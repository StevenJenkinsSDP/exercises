/**
  * Created by steven on 06/05/2017.
  */
case class Person(var forename:String,var surname:String) {



  override def toString = forename + " " + surname
}

object Person{
 def apply(name:String)= {
   val parts = name.split(" ")
   val forename = parts(0)
   val surname = parts(1)
   val s = new Person(forename,surname)

 }


}