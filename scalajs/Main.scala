package cz.madhouse.reacthello

import org.scalajs.dom
import org.scalajs.dom.html
import org.scalajs.dom.document
import org.scalajs.dom.html.Div
import org.scalajs.dom.raw.CSSStyleDeclaration

import scala.collection.immutable._

import typings.gojs.{mod => go}

object HelloWorld {
  def main(args: Array[String]): Unit = {

    val diagram: go.Diagram = new go.Diagram("myDiagramDiv")
    var node = new go.Node(go.Panel.Auto)
    var shape = new go.Shape()
    shape.figure = "RoundedRectangle"
    shape.fill = "lightblue"
    node.add(shape)
    var textblock = new go.TextBlock()
    textblock.text = "Hello!"
    textblock.margin = 5
    node.add(textblock)
    diagram.add(node)
  }
}
