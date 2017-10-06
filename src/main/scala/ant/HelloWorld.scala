package ant

import fs2.Task
import fs2.interop.cats._
import io.circe._
import org.http4s._
import org.http4s.circe._
import org.http4s.dsl._

object HelloWorld {

  val service = HttpService {
    case GET -> Root / "hello" / name =>
      Ok(Json.obj("message" -> Json.fromString(s"Hello, $name")))

    case request@GET -> Root =>
      static("index.html", request)

    case GET -> Root / "index.html" =>
      goToRoot

    case GET -> Root / "index.htm" =>
      goToRoot

    case request @ GET -> Root / path if List(".js", ".css", ".html").exists(path.endsWith) =>
      static(path, request)
  }

//test
  def static(file: String, request: Request): Task[Response] =
    StaticFile.fromResource("/webapp/" + file, Some(request)).getOrElseF(NotFound())

  def goToRoot: Task[Response] = PermanentRedirect(Uri.unsafeFromString("/"))
}
