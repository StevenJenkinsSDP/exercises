package State

/**
  * Created by steven on 28/05/2017.
  */
case class RoboticStandby(r: Robot) extends RoboticState {
  def walk(): Unit = {
    r.state = r.roboticOn
    println("on walking..")
  }

  def cook(): Unit = {

    println("On standby cant cook")
  }

  def off(): Unit = {
    println("turning off...")
    r.state = r.roboticOff
  }
}
