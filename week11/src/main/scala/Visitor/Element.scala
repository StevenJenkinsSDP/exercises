package Visitor

/**
  * Created by steven on 28/05/2017.
  */
trait Element {
  def accept(visitor: Visitor): Unit
}
