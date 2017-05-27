package test.scala

/**
  * Created by steven on 03/05/2017.
  */

import org.scalatest.FunSuite

class NPTest extends FunSuite with NP{

  val n = new NumberPersonalities

    test("[1a] test isPrime true") {
        assert(n.isPrime(7) == true, "is 7 Prime")
    }

    test("[1b] test isPrime false") {
    assert(n.isPrime(6) == true, "is 6 Prime")
    }

  test("[2a] test isHappy true") {
    assert(n.isHappy(7) == true, "is 1024 Happy")
  }

  test("[2b] test isHappy false") {
    assert(n.isHappy(6) == true, "is 10 happy")
  }

  test("[3a] test isTriangle true") {
    assert(n.isTriangular(10) == true, "is 10 triangular")
  }

  test("[3b] test isTriangle false") {
    assert(n.isTriangular(9) == false, "is 9 triangular")
  }

  test("[4a] test isSquare true") {
    assert(n.isSquare(16) == true, "is 16 square")
  }

  test("[4b] test isSquare false") {
    assert(n.isSquare(15) == false, "is 15 square")
  }

  test("[5a] test isSmug true") {
    assert(n.isSmug(13) == true, "is 13 smug")
  }

  test("[5b] test isSmug false") {
    assert(n.isSmug(12) == false, "is 12 smug")
  }

}
