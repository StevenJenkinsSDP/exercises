/**
  * Created by steven on 08/05/2017.
  */
package AbstractFactory

object ParserFactoryProducer {

  var p: AbstractParserFactory = new NYCFactory

  def getFactory(s: String) = {
    if (s.equals("NYCFactory")) {
      p = new NYCFactory
    } else p = new LondonFactory
  p
  }

}