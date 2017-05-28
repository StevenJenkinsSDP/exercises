package Visitor

/**
  * Created by steven on 28/05/2017.
  */
case class StyleVisitor() extends Visitor {
  override def visit(element: HtmlElement): Unit = ???
  override def visit(parentElement: HtmlParentElement): Unit = ???
}
