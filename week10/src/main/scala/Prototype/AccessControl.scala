package Prototype

/**
  * Created by steven on 28/05/2017.
  */
class AccessControl(val controlLevel: String,
                    var access: String)
  extends Prototype {

  override def clone(): AccessControl = AccessControlProvider.getAccessControlObject(controlLevel)
}
