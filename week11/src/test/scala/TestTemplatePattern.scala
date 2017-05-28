/**
  * Created by steven on 28/05/2017.
  */
import Template._

object TestTemplatePattern extends App {
  println("For MYSQL....")
  var template: ConnectionTemplate = MySqlCSVCon()
  template.run()
  println("\nFor Oracle...")
  template = OracleTxtCon()
  template.run()
}
