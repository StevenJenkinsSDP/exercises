package Observer

/**
  * Created by steven on 07/05/2017.
  */

  class SMSUsers(s: Subject, var msg: String) extends Observer {


  def update(desc: String) = {
    msg = desc
  }

    def subscribe() = s.subscribeObserver(this)

    def unSubscribe() = s.unSubscribeObserver(this)

}
