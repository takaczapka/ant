package ant

import org.http4s.Method._
import org.http4s.Status._
import org.http4s._
import org.scalatest.{FreeSpec, Matchers}

class HelloServiceSpec extends FreeSpec with Matchers {

  import ResponseOps._

  "hello is greeting the world" in {

    val helloWorld = HttpServiceFacade(HelloWorld.service)

    val response = helloWorld.get("/hello/world")

    response.status shouldBe Ok

    response.entityAsString shouldBe """{"message":"Hello, world"}"""
  }
}

object ResponseOps {

  implicit class Addons(response: Response) {
    def entityAsString: String =
      response.bodyAsText.runFold("")(_ + _).unsafeRun()
  }
}

case class HttpServiceFacade(httpService: HttpService) {

  def get(path: String): Response =
    run(Request(GET, Uri.fromString(path).right.get))

  def run(request: Request): Response =
    httpService.run(request).unsafeRun().orNotFound

}
