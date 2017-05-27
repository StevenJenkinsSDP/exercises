package Builder

/**
  * Created by steven on 08/05/2017.
  */
trait CarBuilder {
  def buildBodyStyle

  def buildPower

  def buildEngine

  def buildBreaks

  def buildSeats

  def buildWindows

  def buildFuelType

  def getCar: Car
}
