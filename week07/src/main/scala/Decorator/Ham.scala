package Decorator

/**
  * Created by steven on 07/05/2017.
  */
class Ham(val pizza: Pizza) extends PizzaDecorator {

  def getDesc: String = pizza.getDesc + "Ham"

  def getPrice: Double = pizza.getPrice + 18.12
}
