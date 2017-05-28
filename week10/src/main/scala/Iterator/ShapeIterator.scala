package Iterator

/**
  * Created by steven on 28/05/2017.
  */
import java.util.Iterator


class ShapeIterator(private var shapes: Array[Shape]) extends Iterator[Shape] {

  var currentPos = 0
  var newShapes:Array[Shape] = new Array[Shape](shapes.size)

  override def hasNext(): Boolean = {
    if (currentPos < shapes.length) {
      currentPos +=1
      true
    } else false
  }

  override def next(): Shape = shapes(currentPos-1)

  override def remove():Unit = {
    var index = 0
    while (index< shapes.size) {
      if (index!=currentPos) {
        shapes(index) = new Shape(index, shapes(index).name)
      }
      index += 1
    }
  }
}
