package Mediator

/**
  * Created by steven on 28/05/2017.
  */
class Motor {

  def startMotor(): Unit = println("starting motor")

  def rotateDrum(rpm: Int): Unit = println("rotating drum " + rpm)
}
