package main.scala

/**
  * Created by steven on 06/05/2017.
  */
import scala.collection.mutable.ListBuffer
class ControlUnit {


  def pollSensors() {
    val sensors = new ListBuffer[Sensor]()
    sensors += new FireSensor()
    sensors += new SmokeSensor()
    for (sensor <- sensors) {
      if (sensor.isTriggered) {
        System.out.println("A " + sensor.getSensorType + " sensor was triggered at " + sensor.getLocation)
      }
      else {
        System.out.println("Polled " + sensor.getSensorType + " at " + sensor.getLocation + " successfully")
      }
    }
  }

}
