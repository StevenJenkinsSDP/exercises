package AbstractFactory

/**
  * Created by steven on 08/05/2017.
  */
trait AbstractParserFactory {
  def getParserInstance(parserType: String): XMLParser
}
