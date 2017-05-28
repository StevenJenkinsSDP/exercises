package FlyWeight

/**
  * Created by steven on 28/05/2017.
  */
class ScalaPlatform extends Platform {

  println("ScalaPlatform object created")

  override def execute(code: Code): Unit =
    println("Compiling and executing Scala code.")
}
