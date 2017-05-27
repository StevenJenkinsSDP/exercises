/**
  * Created by steven on 08/05/2017.
  */

import Facade._

object TestFacade {
  def main(args: Array[String]) {
    val scheduleServer: ScheduleServer = ScheduleServerImpl()
    val facadeServer: ScheduleServerFacade = ScheduleServerFacade(scheduleServer)
    println("Start working......")
    facadeServer.startServer
    println("After work done.........")
    facadeServer.stopServer
  }
}
