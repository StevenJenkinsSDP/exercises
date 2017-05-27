package Decorator

/**
  * Created by steven on 07/05/2017.
  */
class Cheese(val pizza: Pizza) extends PizzaDecorator {
  def getDesc: String =  pizza.getDesc + "Cheese"

  def getPrice: Double =  pizza.getPrice + 20.72
}
