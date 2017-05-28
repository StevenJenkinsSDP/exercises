/**
  * Created by steven on 28/05/2017.
  */
case class VideoFileHandler(name:String) extends Handler {
  var h: Handler = null

  def setHandler(handler: Handler) = {
    h = handler
  }
  def process(file: File) = {
    if (file.fileType.equals("mp4")) getHandlerName() else h.process(file)
  }
  def getHandlerName(): String = name
}
