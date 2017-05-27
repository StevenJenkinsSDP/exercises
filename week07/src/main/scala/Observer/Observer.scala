package Observer

/**
  * Created by steven on 07/05/2017.
  */
trait Observer {
  def update(desc: String)

  def subscribe()

  def unSubscribe()
}
