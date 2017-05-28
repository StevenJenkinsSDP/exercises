package State

/**
  * Created by steven on 28/05/2017.
  */
case class Robot() extends RoboticState {
  var roboticOn: RoboticState = RoboticOn(this)
  var roboticCook: RoboticState = RoboticCook(this)
  var roboticOff: RoboticState = RoboticOff(this)
  var roboticStandby: RoboticState = RoboticStandby(this)

  var state: RoboticState = roboticOn

  override def walk(): Unit = {
    state.walk()
    state = roboticStandby
  }

  override def cook(): Unit = {
    state.cook()
    state = roboticStandby
  }

  override def off(): Unit = {
    state.off()
  }
}
