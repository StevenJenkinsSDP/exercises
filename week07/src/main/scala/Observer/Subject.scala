package Observer

/**
  * Created by steven on 07/05/2017.
  */

  trait Subject {
    def subscribeObserver(observer: Observer)

    def unSubscribeObserver(observer: Observer)

    def notifyObservers()

    def subjectDetails: String

}
