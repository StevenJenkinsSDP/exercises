package Facade

/**
  * Created by steven on 08/05/2017.
  */
case class ScheduleServerImpl() extends ScheduleServer {


  override def startBooting: String = "start booting"

  override def readSystemConfigFile: String = "read system"

  override def init: String = ???

  override def initializeContext: Unit = ???

  override def initializeListeners: Unit = ???

  override def createSystemObjects: Unit = ???

  override def releaseProcesses: Unit = ???

  override def destory: Unit = ???

  override def destroySystemObjects: Unit = ???

  override def destoryListeners: Unit = ???

  override def destoryContext: Unit = ???

  override def shutdown: Unit = ???
}
