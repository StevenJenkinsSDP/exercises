/**
  * Created by steven on 06/05/2017.
  */
case class Film(var name:String,var yearOfRelease:Int,var imdbRating:Double,var director:Director) {




  def directorsAge = director.yearOfBirth - yearOfRelease

  def isDirectedBy(d:Director):Boolean = if (d.equals(director)) true else false

}
