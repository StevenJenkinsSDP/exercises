/**
  * Created by steven on 28/05/2017.
  */
import State._

object TestStatePattern extends App {
  val robot = Robot()
  robot.walk()
  robot.cook()
  robot.walk()
  robot.off()
  robot.walk()
  robot.off()
  robot.cook()
}
