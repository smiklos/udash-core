package io.udash.web.guide.views

import io.udash.web.commons.components.CodeBlock
import io.udash.web.guide.styles.partials.GuideStyles
import org.scalajs.dom.Element

package object rest {
  def simpleExample(): Element =
    CodeBlock(
      """import io.udash.rest._
        |
        |@REST
        |trait MainServerREST {
        |  def simple(): SimpleServerREST
        |}
        |
        |@REST
        |trait SimpleServerREST {
        |  @GET def string(): Future[String]
        |  @GET def int(): Future[Int]
        |  @GET @RESTName("class") def cls(): Future[RestExampleClass]
        |}""".stripMargin
    )(GuideStyles)
}
