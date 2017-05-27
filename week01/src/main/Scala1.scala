/**
  * Created by steven on 03/05/2017.
  */
import io._

object Scala1 {

  def main(args: Array[String]): Unit = {
    //println(getStarted)
    //readAndPrint
    //ifStatement
    //whileLoop
    //forLoopSquareCube
    println(isEven(8))
    println(isEven(5))
  }

  //Get started Log in. Open a command-line window and enter scala to start the Scala
  //REPL. Use the REPL to compute 2+2.
  def getStarted = 2+2

  //Reading and printing Use readLine to ask the user for an integer,
  //and save it in a val named number. Then use println to tell the user the value of half of that number.
  def readAndPrint = {
    val number:Int = readLine("enter an integer for read and print ").toInt
    println(number/2)
  }

  //Use an if statement Compare the number just entered to 100, then print "That’s a big number"
  //if the number is greater than 100, or
  //"That’s a small number"
  //if the number is less than 100.
  //(Remember that your test must be put inside parentheses.)

  def ifStatement = {
    val number:Int = readLine("enter an integer for ifStatement").toInt
    val answer = if (number > 100) "that's big" else "that's small"
    println(answer)
  }

  //Use a while loop Write a program to repeatedly do the following:
  // 1. Ask for a number, and
  //2. print out a message that says what number you entered, and the square of that number(for example, 5 squared is 25).
  //3. Quit when the number 0 is entered.
  //(Remember that the readLine and println expressions must be inside curly braces,

  def whileLoop: Unit = {
    var finished = false
    while(!finished) {
      val number:Int = readLine("enter an integer for whileLoop - 0 to finish").toInt
      if (number !=0) {
        val square = math.pow(number,2)
        println("you've just entered " + number + " and the sqare is " + square)
      } else {finished = true}
    }
  }

  //Use a for loop Write a program to print out the numbers 1 through 25 and, for each number,
  // print its square and its cube on the same line.
  //(You can use + to combine strings and numbers into a single string.)
  def forLoopSquareCube = {
    for(i<-1 to 25) {
      println(i + " square: "+math.pow(i,2) + " cube: " + math.pow(i,3))
    }
  }

  //Write a function In your program, write a function named isEven that, given a single Int as a parameter,
  //returns true if the remainder when divided by 2 is zero (the operator that gives you the remainder is %),
  //and false otherwise.Reload the program and try calling the function with various numbers.

  def isEven(i: Int): Boolean = (i%2==0)

}
