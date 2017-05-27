/**
  * Created by steven on 08/05/2017.
  */
import Builder._

object TestBuilderPattern {
  def main(args: Array[String]) {
    var carBuilder: CarBuilder = SedanCarBuilder
    var director: CarDirector = CarDirector(carBuilder)

    director.build
    println(carBuilder.getCar)

    carBuilder = SportsCarBuilder
    director = CarDirector(carBuilder)

    director.build
    println(carBuilder.getCar)
  }
}
