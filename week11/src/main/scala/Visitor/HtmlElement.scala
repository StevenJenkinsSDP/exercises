package Visitor

/**
  * Created by steven on 28/05/2017.
  */
case class HtmlElement(var tagName: String) extends HtmlTag {
  var startTag: String = ""
  var endTag: String = ""

  private var tagBody: String = ""

  override def setTagBody(tagBody: String)= this.tagBody = tagBody
  override def generateHtml(): Unit = ???
  override def accept(visitor: Visitor): Unit = ???

  def getEndTag(): String = endTag
  def getStartTag(): String = startTag
  def getTagName(): String = tagName
  def setEndTag(tag: String): Unit = this.endTag = tag
  def setStartTag(tag: String): Unit = this.startTag = tag
}
