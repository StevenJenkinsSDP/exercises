package Observer

/**
  * Created by steven on 07/05/2017.
  */

import scala.collection.mutable.ListBuffer

  class CommentaryObject(var subscribers: ListBuffer[Observer], var title: String) extends Subject {

    def CommentaryObject(title:String)={
      this.title = title
    }

    def subscribeObserver(observer: Observer) = subscribers += observer

    def unSubscribeObserver(observer: Observer) = subscribers -= observer

    def notifyObservers() = {

      for(s<-subscribers) {
        s.update(title)
      }
    }

    def subjectDetails: String = ???

}
