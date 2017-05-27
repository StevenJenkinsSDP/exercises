package main.scala

/**
  * Created by steven on 06/05/2017.
  */

import scala.util.Random

class FireSensor extends Sensor{

  private var battery = 100

  //returns true/false for whether the sensor is triggered or not.
  def isTriggered: Boolean = {
    battery *= 0.9
    val rand = Random.nextInt(100)
    if (rand<6) true else false
  }

  //returns a description of the location of the sensor such as Lobby
  def getLocation: String = ???

  //returns a textual description of thesensor type such as "Fire sensor"
  def getSensortype:String = "Fire Sensor"

  //returns a number between 0-100 where 0 is empty and 100 is fully charged.
  def getBatteryPercentage:Int = {
    battery
  }

}
