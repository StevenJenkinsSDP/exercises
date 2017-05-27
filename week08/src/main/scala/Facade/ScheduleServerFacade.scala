package Facade

/**
  * Created by steven on 08/05/2017.
  */
case class ScheduleServerFacade(scheduleServer: ScheduleServer) {


  def stopServer: Unit = {
    scheduleServer.releaseProcesses
    scheduleServer.destory
    scheduleServer.destroySystemObjects
    scheduleServer.destoryListeners
    scheduleServer.destoryContext
    scheduleServer.shutdown
  }

  def startServer = {
    scheduleServer.startBooting
    scheduleServer.readSystemConfigFile
    scheduleServer.init
    scheduleServer.initializeContext
    scheduleServer.initializeListeners
    scheduleServer.createSystemObjects
    System.out.println("Start working......")
    System.out.println("After work done.........")
  }

}
