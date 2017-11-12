package ant

import fs2.interop.cats._
import fs2.{Stream, Task}
import org.http4s.dsl.{->, GET, NotFound, Root, _}
import org.http4s.server.blaze.BlazeBuilder
import org.http4s.server.staticcontent
import org.http4s.server.staticcontent.ResourceService
import org.http4s.util.StreamApp
import org.http4s.{HttpService, StaticFile}

object Server extends StreamApp {
  override def stream(args: List[String]): Stream[Task, Nothing] =
    BlazeBuilder
      .bindHttp(8080, "0.0.0.0")
      .mountService(root)
      .mountService(staticFileService)
      .mountService(HelloWorld.service)
      .serve

  val staticFileService: HttpService = staticcontent.resourceService(ResourceService.Config(basePath = "/webapp", pathPrefix = "/resources"))

  val root = HttpService {
    case request@GET -> Root =>
      StaticFile.fromResource("/webapp/index.html", Some(request)).getOrElseF(NotFound())
  }

}
