package FlyWeight

/**
  * Created by steven on 28/05/2017.
  */
class JavaPlatform extends Platform {

  println("JavaPlatform object created")

  override def execute(code: Code): Unit =
    println("Compiling and executing Java code.")
}
