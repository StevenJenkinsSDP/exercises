package FlyWeight

/**
  * Created by steven on 28/05/2017.
  */
import java.util.HashMap
import java.util.Map

object PlatformFactory {

  private var map: Map[String, Platform] = new HashMap[String,Platform]

  map.put("JAVA",new JavaPlatform)
  map.put("RUBY",new RubyPlatform)
  map.put("C",new CPlatform)
  map.put("SCALA",new ScalaPlatform)

  def getPlatformInstance(platformType: String): Platform = map.get(platformType)
  // this method will probably need to be synchronized

}
