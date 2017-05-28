package FlyWeight

/**
  * Created by steven on 28/05/2017.
  */
class RubyPlatform extends Platform {

  println("RubyPlatform object created")

  override def execute(code: Code): Unit =
    println("Compiling and executing Ruby code.")
}