package Bridge

/**
  * Created by steven on 08/05/2017.
  */
abstract class Car(product: Product, carType: String) {

  def assemble

  def produceProduct

  def printDetails
}
