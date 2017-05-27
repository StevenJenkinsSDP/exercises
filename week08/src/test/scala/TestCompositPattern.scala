/**
  * Created by steven on 08/05/2017.
  */

import Composite._

object TestCompositePattern extends App {

  val parentTag: HtmlTag = HtmlParentElement("<html>")
  parentTag.setStartTag("<html>")
  parentTag.setEndTag("</html>")

  val p1: HtmlTag = HtmlParentElement("<body>")
  p1.setStartTag("<body>")
  p1.setEndTag("</body>")
  parentTag.addChildTag(p1)

  var child1: HtmlTag = HtmlElement("<P>")
  child1.setStartTag("<P>")
  child1.setEndTag("</P>")
  child1.setTagBody("Testing html tag library")
  p1.addChildTag(child1)

  child1 = HtmlElement("<P>")
  child1.setStartTag("<P>")
  child1.setEndTag("</P>")
  child1.setTagBody("Paragraph 2")

  p1.addChildTag(child1)
  parentTag.generateHtml
}
