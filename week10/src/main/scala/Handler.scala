/**
  * Created by steven on 28/05/2017.
  */
trait Handler {
  def setHandler(handler: Handler)
  def process(file: File)
  def getHandlerName(): String
}
