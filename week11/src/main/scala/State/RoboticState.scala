package State

/**
  * Created by steven on 28/05/2017.
  */
trait RoboticState {
  def walk(): Unit
  def cook(): Unit
  def off(): Unit
}
