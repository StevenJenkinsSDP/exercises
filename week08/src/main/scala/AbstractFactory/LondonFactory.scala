package AbstractFactory

/**
  * Created by steven on 08/05/2017.
  */
class LondonFactory extends AbstractParserFactory{


  def getParserInstance(parserType: String): XMLParser = {

      new NYCORDER

  }
}
