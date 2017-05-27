package Decorator

/**
  * Created by steven on 07/05/2017.
  */
class GreenOlives(val pizza: Pizza) extends PizzaDecorator {
  def getDesc: String = pizza.getDesc + " Green Olives"

  def getPrice: Double = pizza.getPrice + 5.47
}
