package Prototype

/**
  * Created by steven on 28/05/2017.
  */
class User(var userName: String,
           var level: String,
           var accessControl: AccessControl) {

  override def toString() = {
    userName + " " + level + " " + accessControl.controlLevel + " " + accessControl.access
  }
}
