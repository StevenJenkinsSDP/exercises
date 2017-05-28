package FlyWeight

/**
  * Created by steven on 28/05/2017.
  */
trait Platform {
  def execute(code: Code): Unit
}
