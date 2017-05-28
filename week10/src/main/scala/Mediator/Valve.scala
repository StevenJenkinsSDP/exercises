package Mediator

/**
  * Created by steven on 28/05/2017.
  */

  class Valve extends Colleague {

  private var mediator: MachineMediator = _

  override def setMediator(mediator: MachineMediator): Unit ={
    this.mediator = mediator
  }

    def open(): Unit = mediator.open()

    def closed(): Unit = mediator.closed()

}
