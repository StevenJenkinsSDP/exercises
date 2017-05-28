package Memento

/**
  * Created by steven on 28/05/2017.
  */
case class Originator(
                       var x: Double,
                       var y: Double,
                       var careTaker: CareTaker
                     ) {

  private var lastUndoSavepoint: String = _

  createSavepoint("INITIAL")

  def createSavepoint(savepointName: String): Unit = {
    careTaker.saveMemento(new Memento(x,y),savepointName)
    lastUndoSavepoint = savepointName
  }

  def undo(): Unit = {
    x = careTaker.getMemento(lastUndoSavepoint).x
    y = careTaker.getMemento(lastUndoSavepoint).y
  }

  def undo(savepointName: String): Unit = {
    x = careTaker.getMemento(savepointName).x
    y = careTaker.getMemento(savepointName).y
  }

  def undoAll(): Unit = {
    val m = careTaker.getMemento("INITIAL")
    careTaker.clearSavepoints()
    careTaker.saveMemento(m,"INITIAL")
    lastUndoSavepoint = "INITIAL"
  }

  private def setOriginatorState(savepointName: String): Unit = ???

  override def toString(): String = "X: " + x + ", Y: " + y
}
