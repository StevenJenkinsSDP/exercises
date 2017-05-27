/**
  * Created by steven on 08/05/2017.
  */

import Strategy._

object TestStrategyPattern extends App {
  var formatter: TextFormatter = new CapTextFormatter()
  var editor: TextEditor = new TextEditor(formatter)
  editor.publishText("Testing text in caps formatter")
  formatter = new LowerTextFormatter()
  editor = new TextEditor(formatter)
  editor.publishText("Testing text in lower formatter")
}
