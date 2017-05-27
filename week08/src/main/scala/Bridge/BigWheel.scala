package Bridge

/**
  * Created by steven on 08/05/2017.
  */
case class BigWheel(product: Product, s: String) extends Car(product, s) {

  override def assemble: Unit = {

  }

  override def produceProduct: Unit = {
    product.produce
  }

  override def printDetails: Unit = {
    product.productName
  }
}
