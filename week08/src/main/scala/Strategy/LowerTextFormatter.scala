package Strategy

/**
  * Created by steven on 08/05/2017.
  */
class LowerTextFormatter extends TextFormatter{

  def format(text: String)= println(text.toLowerCase)

}
