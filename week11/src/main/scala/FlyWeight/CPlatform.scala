package FlyWeight

/**
  * Created by steven on 28/05/2017.
  */
class CPlatform extends Platform {

  println("CPlatform object created")

  override def execute(code: Code): Unit =
    println("Compiling and executing C code.")
}
