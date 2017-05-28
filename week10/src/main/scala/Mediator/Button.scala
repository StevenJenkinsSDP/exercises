package Mediator

/**
  * Created by steven on 28/05/2017.
  */
class Button extends Colleague {

  private var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit = {
    this.mediator = mediator
  }

  def press(): Unit = {
    println("Button pressed.")
    mediator.start()
  }

}
