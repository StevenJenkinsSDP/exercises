package Builder

/**
  * Created by steven on 08/05/2017.
  */
object SedanCarBuilder extends CarBuilder {



  override def buildBodyStyle: Unit = {
    var s = "Body: External dimensions: overall length (inches): 202.9, "+
   " overall width (inches): 76.2, overall height (inches): 60.7,"+
    "wheelbase (inches): 112.9, front track (inches): 65.3,"+
    "rear track (inches): 65.5 and curb to curb turning circle (feet): 39.5"

  }

  override def buildPower: Unit = {
    var s = "Power: 285 hp @ 6,500 rpm; 253 ft lb of torque @ 4,000 rpm"
  }

  override def buildEngine: Unit = {
    var s = "  Engine //todo: labels is not supported 3.5"
  }

  override def buildBreaks: Unit = {
    var s = "Breaks: Four-wheel disc brakes: two ventilated. Electronic brake distribution"
  }

  override def buildSeats: Unit = {
    var s = "Seats: Front seat centre armrest.Rear seat centre armrest.Split-folding rear seats"
  }

  override def buildWindows: Unit = {
    var s = "Windows: Laminated side windows.Fixed rear window with defroster"
  }

  override def buildFuelType: Unit = {
    var s = " Fuel Type: Diesel 19 MPG city, 29 MPG highway, 23 MPG combined and 437 mi. range"
  }

  override def getCar: Car = {
  new Car("Sedan Car")
  }
}
