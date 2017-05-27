/**
  * Created by steven on 06/05/2017.
  */

//Sensor — This interface defines methods for all sensors to implement.
trait Sensor {

  //returns true/false for whether the sensor is triggered or not.
  def isTriggered: Boolean

  //returns a description of the location of the sensor such as Lobby
  def getLocation: String

  //returns a textual description of thesensor type such as "Fire sensor"
  def getSensortype:String

  //returns a number between 0-100 where 0 is empty and 100 is fully charged.
  def getBatteryPercentage:Int

}