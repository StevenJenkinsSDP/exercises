package ChainOfResponsibility

/**
  * Created by steven on 28/05/2017.
  */
case class DocFileHandler(name:String) extends Handler {
  var h: Handler = null

  def setHandler(handler: Handler) = {
    h = handler
  }
  def process(file: File) = {
    if (file.fileType.equals("doc")) println(getHandlerName()) else {
      println(getHandlerName() + " forward request to " + file.fileName)
      h.process(file)
    }
  }
  def getHandlerName(): String = name
}
