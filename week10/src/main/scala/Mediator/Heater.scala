package Mediator

/**
  * Created by steven on 28/05/2017.
  */
class Heater extends Colleague {

  private var mediator: MachineMediator = _
  private var temp: Int = 0

  override def setMediator(mediator: MachineMediator): Unit = {
    this.mediator = mediator
  }

  def on(temp: Int): Unit = {
    println("heater on" + temp)
   mediator.on()
  }

  def off(): Unit = println ("heater off")
}
