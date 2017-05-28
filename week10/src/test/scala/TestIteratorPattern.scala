/**
  * Created by steven on 28/05/2017.
  */
import Iterator._

object TestIteratorPattern extends App {
  val storage = new ShapeStorage()
  storage.addShape("Polygon")
  storage.addShape("Hexagon")
  storage.addShape("Circle")
  storage.addShape("Rectangle")
  storage.addShape("Square")

  var iterator = new ShapeIterator(storage.shapes)

  while (iterator.hasNext) println(iterator.next())

  println("Apply removing while iterating...")
  iterator = new ShapeIterator(storage.shapes)

  while (iterator.hasNext) {
    println(iterator.next())
    iterator.remove()
  }
}
