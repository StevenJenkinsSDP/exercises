package Decorator

/**
  * Created by steven on 07/05/2017.
  */

  class RomaTomatoes(val pizza: Pizza) extends PizzaDecorator {
  def getDesc: String = pizza.getDesc + " tomatoes"

  def getPrice: Double = pizza.getPrice + 5.20

}
