package io.udash.web.guide.views.frontend.demos

import io.udash._
import io.udash.css.CssView
import io.udash.web.guide.demos.AutoDemo
import io.udash.web.guide.styles.partials.GuideStyles
import org.scalajs.dom
import scalatags.JsDom

object BindDemo extends AutoDemo with CssView {
  import JsDom.all._

  private val (rendered, source) = {
    val names = Stream.continually(Stream("John", "Amy", "Bryan", "Diana")).flatten.iterator

    val name: Property[String] = Property[String](names.next())
    dom.window.setInterval(() => name.set(names.next()), 500)

    p("Name: ", bind(name))
  }.withSourceCode

  override protected def demoWithSource(): (JsDom.all.Modifier, Iterator[String]) = {
    (div(id := "bind-demo", GuideStyles.frame)(rendered), source.lines.drop(1))
  }
}
