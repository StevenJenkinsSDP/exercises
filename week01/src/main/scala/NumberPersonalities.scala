package main.scala

/**
  * Created by steven on 03/05/2017.
  */
class NumberPersonalities extends NP {

  val limit = 100

  override def isPrime(n: Int): Boolean = {
    var prime = false
    for (i <- 2 until n) {
      if (n / i != 0) prime = true
    }
    prime
  }

  override def isHappy(n: Int): Boolean = {
    var finished = false
    var isHappy = true
    var squareTotal = 0.0
    var num = n
    while (!finished) {
      val lastDigit = num % 1
      num = num / 10
      squareTotal += math.pow(lastDigit, 2)
      if (num == 4) {
        isHappy = false
        finished = true
      }
      if(num==0) {
        finished = true
      }
    }
    isHappy
  }

  override def isTriangular(n: Int): Boolean = {
    var triangle = false
    var num = n
    for(i<-(1 until n)) {
      if(num == 0) {
        triangle = true
      }
      num -= i
    }
    triangle
  }

  override def isSquare(n: Int): Boolean = {
    var square = false
    var num = n
    for(i<-1 until n by 2) {
      if(num == 0) {
        square = true
      }
      num -= i
    }
    square
  }

  override def isSmug(n: Int): Boolean = {
    var smug = false
    var num = n
    for(i<-1 until n) {
      var sq = i*i
      var remain = num - sq
     if (isSquare(remain))  {
       smug = true
     }
    }
    smug
  }

  override def isHonest(n: Int): Boolean = ???

  override def isPronic(n: Int): Boolean = ???

  override def isDeficient(n: Int): Boolean = ???

  override def isPerfect(n: Int): Boolean = ???

  override def isAbundant(n: Int): Boolean = ???

  override def sumOfPositiveDivisorsOf(n: Int): Int = ???
}
