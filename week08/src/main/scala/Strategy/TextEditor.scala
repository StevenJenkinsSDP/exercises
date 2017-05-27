package Strategy

/**
  * Created by steven on 08/05/2017.
  */
class TextEditor(val tf:TextFormatter) {

  def publishText(text:String) = tf.format(text)

}
