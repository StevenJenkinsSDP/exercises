package Factory

/**
  * Created by steven on 06/05/2017.
  */
class ConcreteCreator extends Creator{
 override def createProduct(s:String): Product = {
   new ConcreteProduct
 }
}
