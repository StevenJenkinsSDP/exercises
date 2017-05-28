package Mediator

/**
  * Created by steven on 28/05/2017.
  */
class Machine extends Colleague {

  private var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit ={
    this.mediator = mediator
  }

  def start(): Unit = println("machine starting")

  def wash(): Unit = mediator.wash()
}
