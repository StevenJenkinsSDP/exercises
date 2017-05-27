package Builder

/**
  * Created by steven on 08/05/2017.
  */
case class CarDirector(carBuilder: CarBuilder) {

  def build = {
    carBuilder.buildBodyStyle
    carBuilder.buildBreaks
    carBuilder.buildEngine
    carBuilder.buildFuelType
    carBuilder.buildPower
    carBuilder.buildSeats
    carBuilder.buildWindows

  }

}
