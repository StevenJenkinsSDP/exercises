package Bridge

/**
  * Created by steven on 08/05/2017.
  */
case class CentralLocking(s: String) extends Product {
  // TODO
  override def productName: String = s

  override def produce: Unit = ???
}
