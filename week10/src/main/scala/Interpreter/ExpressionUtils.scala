package Interpreter

/**
  * Created by steven on 28/05/2017.
  */
object ExpressionUtils {

  def isOperator(s: String): Boolean = {
    s match {
      case "+" => true
      case "-" => true
      case "*" => true
      case "/" => true
      case _ => false
    }
  }

  def getOperator(s: String, left: Expression, right: Expression): Expression = {
    s match {
      case "+" => new Add(left,right)
      case "-" => new Subtract(left,right)
      case "*" => new Product(left,right)
    }
  }
}
