package Interpreter

/**
  * Created by steven on 28/05/2017.
  */
case class Product(private val leftExpression: Expression,
              private val rightExpression: Expression)
  extends Expression {

  override def interpret(): Int =
    leftExpression.interpret() * rightExpression.interpret()
}