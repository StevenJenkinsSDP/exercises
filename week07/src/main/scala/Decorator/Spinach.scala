package Decorator

/**
  * Created by steven on 07/05/2017.
  */
class Spinach(val pizza: Pizza) extends PizzaDecorator {

  def getDesc: String = pizza.getDesc + " Spinach"

  def getPrice: Double = pizza.getPrice + 7.92

}
