package cz.madhouse.reacthello

import org.scalajs.dom
import org.scalajs.dom.html
import org.scalajs.dom.document
import org.scalajs.dom.html.Div
import org.scalajs.dom.raw.CSSStyleDeclaration

import scala.collection.immutable._
object HelloWorld {
  def main(args: Array[String]): Unit = {
    val div = document.createElement("div").asInstanceOf[Div]
    div.textContent = "Hello, World!"
    document.body.appendChild(div)
  }
}
