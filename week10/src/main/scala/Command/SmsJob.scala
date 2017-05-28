package Command

/**
  * Created by steven on 28/05/2017.
  */
class SmsJob extends Job {

  var s:Sms = null

  def setSms(sms: Sms) = s = sms

  override def run = s.sendSms
}