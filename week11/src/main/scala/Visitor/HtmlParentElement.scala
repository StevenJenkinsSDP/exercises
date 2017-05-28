package Visitor

/**
  * Created by steven on 28/05/2017.
  */
case class HtmlParentElement(var tagName: String) extends HtmlTag {
  var startTag: String = ""
  var endTag: String = ""

  private var childrenTag =  List[HtmlTag]

  override def addChildTag(htmlTag: HtmlTag): Unit = ???
  override def removeChildTag(htmlTag: HtmlTag): Unit = ???
  override def getChildren() = childrenTag
  override def generateHtml(): Unit = ???
  override def accept(visitor: Visitor): Unit = ???

  def getEndTag(): String = endTag
  def getStartTag(): String = startTag
  def getTagName(): String = tagName
  def setEndTag(tag: String) = endTag = tag
  def setStartTag(tag: String)= startTag = tag
}
