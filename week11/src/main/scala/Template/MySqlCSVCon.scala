package Template

/**
  * Created by steven on 28/05/2017.
  */
case class MySqlCSVCon() extends ConnectionTemplate {
  override def setDBDriver(): Unit = println("Setting MySQL DB drivers...")
  override def setCredentials(): Unit = println("Setting credentials for MySQL DB...")
  override def setData(): Unit = println("Setting up data from csv file....")
}
