import ChainOfResponsibility._

object TestChainofResponsibility extends App {
  var file:File = null
  val textHandler: Handler = TextFileHandler("Text ChainOfResponsibility.Handler");
  val docHandler: Handler = DocFileHandler("Doc ChainOfResponsibility.Handler");
  val excelHandler: Handler = ExcelFileHandler("Excel ChainOfResponsibility.Handler");
  val audioHandler: Handler = AudioFileHandler("Audio ChainOfResponsibility.Handler");
  val videoHandler: Handler = VideoFileHandler("Video ChainOfResponsibility.Handler");
  val imageHandler: Handler = ImageFileHandler("Image ChainOfResponsibility.Handler");
  textHandler.setHandler(docHandler)
  docHandler.setHandler(excelHandler)
  excelHandler.setHandler(audioHandler)
  audioHandler.setHandler(videoHandler)
  videoHandler.setHandler(imageHandler)
  file = File("Abc.mp3", "audio", "C:");
  textHandler.process(file)
  println("---------------------------------")
  file = File("Abc.jpg", "video", "C:")
  textHandler.process(file)
  println("---------------------------------")
  file = File("Abc.doc", "doc", "C:")
  textHandler.process(file)
  println("---------------------------------")
  file = File("Abc.bat", "bat", "C:")
  textHandler.process(file)
}
