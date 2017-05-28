package Command

/**
  * Created by steven on 28/05/2017.
  */


class EmailJob extends Job {

  var e: Email = null

  def setEmail(email: Email) = e = email

  override def run =  e.sendEmail
}
