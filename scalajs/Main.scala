package cz.madhouse.reacthello

import org.scalajs.dom
import org.scalajs.dom.html
import org.scalajs.dom.document
import org.scalajs.dom.html.Div
import org.scalajs.dom.raw.CSSStyleDeclaration

import scala.collection.immutable._

import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.html_<^._

object HelloWorld {
  def main(args: Array[String]): Unit = {

  val HelloMessage = ScalaComponent.builder[String]
    .render($ => <.div("Hello ", $.props))
    .build

  HelloMessage("John").renderIntoDOM(document.body)
  }
}
