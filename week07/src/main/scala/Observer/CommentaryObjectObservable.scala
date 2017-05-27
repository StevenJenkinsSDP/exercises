package Observer

/**
  * Created by steven on 07/05/2017.
  */
class CommentaryObjectObservable(var desc:String) extends Commentary{

  def setDesc(desc: String) = this.desc = desc

}
