import AbstractFactory.XMLParser

/**
  * Created by steven on 08/05/2017.
  */
import AbstractFactory._

object TestAbstractFactoryPattern {
  def main(args: Array[String]) {
    var parserFactory: AbstractParserFactory = ParserFactoryProducer.getFactory("NYCFactory")
    var parser: XMLParser = parserFactory.getParserInstance("NYCORDER")
    var msg: String = ""
    msg = parser.parse
    println(msg)
    println("************************************")
    parserFactory = ParserFactoryProducer.getFactory("LondonFactory")
    parser = parserFactory.getParserInstance("LondonFEEDBACK")
    msg = parser.parse
    println(msg)
  }
}
