package Command

/**
  * Created by steven on 28/05/2017.
  */
class FileIOJob extends Job {

  var f:FileIO = null

  def setFileIO(fileIO: FileIO)= f = fileIO

  override def run() = f.execute()
}
