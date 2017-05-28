package State

/**
  * Created by steven on 28/05/2017.
  */
case class RoboticCook(r: Robot) extends RoboticState {
  def walk(): Unit = {
    r.state = r.roboticCook
    println ("cooking...")
  }
  def cook(): Unit = println("Already cooking...")

  def off(): Unit = {
    println("turning off...")
    r.state = r.roboticOff
  }
}
