package Decorator

/**
  * Created by steven on 07/05/2017.
  */
class Meat(val pizza: Pizza) extends PizzaDecorator {
  def getDesc: String = pizza.getDesc + " Meat"

  def getPrice: Double = pizza.getPrice + 14.25
}
