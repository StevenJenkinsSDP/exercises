package Visitor

/**
  * Created by steven on 28/05/2017.
  */
trait Visitor {
  def visit(element: HtmlElement): Unit
  def visit(parentElement: HtmlParentElement): Unit
}
