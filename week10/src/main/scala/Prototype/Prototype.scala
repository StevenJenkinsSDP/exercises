package Prototype

/**
  * Created by steven on 28/05/2017.
  */
trait Prototype extends Cloneable {
  override def clone(): AccessControl = throw new CloneNotSupportedException
}