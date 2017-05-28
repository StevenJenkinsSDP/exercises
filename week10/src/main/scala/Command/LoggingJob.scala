package Command

/**
  * Created by steven on 28/05/2017.
  */
class LoggingJob extends Job {

  var l:Logging = null

  def setLogging(logging: Logging) = l = logging

  override def run = l.log
}
