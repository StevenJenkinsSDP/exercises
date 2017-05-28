package ChainOfResponsibility

/**
  * Created by steven on 28/05/2017.
  */
case class ImageFileHandler(name:String) extends Handler {
  var h: Handler = null

  def setHandler(handler: Handler) = {
    h = handler
  }
  def process(file: File) = {
    if (file.fileType.equals("bat")) println(getHandlerName()) else {
      println(getHandlerName() + " forward request to " + file.fileType)
      h.process(file)
    }
  }
  def getHandlerName(): String = name
}
