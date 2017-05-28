package State

/**
  * Created by steven on 28/05/2017.
  */
case class RoboticOff(r: Robot) extends RoboticState {
  def walk(): Unit = {

    println ("off...")
  }
  def cook(): Unit = println("off cannot cook..")

  def off(): Unit = {
    println("already off...")
    r.state = r.roboticOff
  }
}
