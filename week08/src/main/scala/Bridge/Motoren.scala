package Bridge

/**
  * Created by steven on 08/05/2017.
  */
case class Motoren(product: Product, s: String) extends Car(product, s) {
  override def assemble: Unit = ???

  override def produceProduct: Unit = ???

  override def printDetails: Unit = ???
}
