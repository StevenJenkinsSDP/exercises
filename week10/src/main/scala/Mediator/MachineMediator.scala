package Mediator

/**
  * Created by steven on 28/05/2017.
  */
trait MachineMediator {
  def start(): Unit
  def wash(): Unit
  def open(): Unit
  def closed(): Unit
  def on(): Unit
  def off(): Unit
  def checkTemperature(temp: Int): Boolean
}
