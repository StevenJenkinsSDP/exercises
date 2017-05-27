package main.scala.functions

/**
  * Created by steven on 06/05/2017.
  *
  * List Basics
    These functions are simple enough that you wont need to call any other functions to implement them.
    All you need is pattern matching and recursion!
  *
  */
object Funcs {

  /** takes a list and returns all but the first element.
    * This isn’t a recursive function, but you still need to use pattern matching
    * to catch when the input is Nil. Calling tail on an empty list throws an IllegalArgumentException.
    * Example: tail(List(1,2,3)) = List(2,3)
    */
  def tail[T](lst: List[T]): List[T] = {
    lst match {
      case Nil => throw new IllegalArgumentException
      case h :: t => t
    }
  }

  /** takes a list and replaces the first element. If the list is empty, it simply inserts the element
    * into the empty list.
    * Question: Can you use tail for this?
    * Example: setHead(List(1,2,3), 0) = List(0,2,3)
    */
  def setHead[T](lst: List[T], replace: T): List[T] = {
    lst match {
      case h :: t => replace :: t
      case Nil => List(replace)
    }
  }


  /** removes the first N elements from the given list. If the number of elements to remove exceeds the
    * number of elements in the list, drop will return an empty list.
    * Hint: You have multiple base cases here. How can you match the number of elements to remove and the
    * list at the same time?
    * Example: drop(List(1,2,3,4), 3) = List(4).
    */
  def drop[T](lst: List[T], n: Int): List[T] = {
    lst match {
      case Nil => Nil
      case h :: t => n match {
        case 1 => t
        case _ => drop(t, n - 1)
      }
    }
  }


  /** is the opposite of tail: It removes the last element of the list.
    * Remember that youre not modifying the input list, but building a new list.
    * Calling init on an empty list throws an IllegalArgumentException.
    * Example: init(List(1,2,3)) = List(1,2).
    */
  def init[T](lst: List[T]): List[T] = {
    lst match {
      case Nil => throw new IllegalArgumentException
      case t :: Nil => Nil
      case h :: t => h :: init(t)
    }
  }


  /** One of the real bread-and-butter functions. takes a list, an initial value, and a function,
    * then computes a value by iteratively applying the function to the elements of the list and
    * carrying the result along. foldLeft and foldRight are very similar functions; they just perform
    * the operations in a different order. The difference is subtle; the key takeaway is that foldLeft is
    * tail recursive. You should implement your own version of foldLeft using pattern matching and re- cursion.
    * The function that foldLeft takes has two arguments: the accumulative result and the current element of the list.
    */
  def foldLeft[T, S](lst: List[T], n: S)(f: (S, T) => S): S = {
    lst match {
      case Nil => n
      case h :: t => foldLeft(t, f(n, h))(f)
    }

  }


  /** takes a list of doubles and computes the sum. Thats it! Very straightforward.
    * Example: sum(List(1.0, 2.0, 3.0)) = 6.0
    */
  def sum(lst: List[Double]): Double = {
    def s(x: Double, y: Double): Double = x + y

    foldLeft(lst, 0.0)(s)
  }


  /** takes a list of doubles and computes the product. This should be very similar to sum.
    * Example: product(List(1.0, 2.0, 3.0)) = 6.0
    */
  def product(lst: List[Double]): Double = {
    def s(x: Double, y: Double): Double = x * y

    foldLeft(lst, 0.0)(s)
  }


  /** computes the length of the input. This is a case where the result of foldLeft isnt directly related
    * to the input data! foldLeft doesnt have to use the data, it just iterates over the list.
    * Example: length(List(1,2,3,4,5,6)) = 6.
    */
  def length[T](lst: List[T]): Int = {
    def s[T](x: Int, y: T): Int = 1

    foldLeft(lst, 0)(s)
  }


  /** reverses a list. Yes, you can do this with foldLeft, too! Example: reverse(List(1,2,3)) = List(3,2,1)
    */

  def reverse[T](lst: List[T]): List[T] = {
    def s(x: Int, y: T): Int = y

    foldLeft(lst, 0)(s)
  }


  /** turns a nested list into a single list. This is more straightforward than it sounds.
    * Example: flatten(List(List(1,2,3), List(4,5,6))) = List(1,2,3,4,5,6)
    */
  def flatten = ???


  /** takes a list and a function, then builds a new list by applying the function to each element
    * of the list. This is the third or fourth time youve read that description so far in this exercise.
    * Still unsure what it does? Ask!
    * Unlike foldLeft, maps function takes only a single argument.
    */
  def map[T](lst: List[T])(f: T => T): List[T] = {
    lst match {
      case Nil => Nil
      case h :: t => f(h) :: map(t)(f)
    }
  }

  /** applies a predicate (a function that returns a Boolean value) to the elements of the list,
    * and discards the ones for which the predicate returns False.
    * Example: filter(List(1,2,3,4,5))( _ % 2 == 0) = List(2,4)
    */
  def filter[T](lst: List[T])(f: T => Boolean): List[T] = {
    lst match {
      case Nil => Nil
      case h :: t => if (f(h)) h :: filter(t)(f) else filter(t)(f)
    }
  }


  /** is a cross between map and flatten. Instead of a single value,
    * flatMaps function returns a list of values. flatMap collects all of these values into a single list.
    * Hint: Dont overthink it.
    */
  def flatMap[T](lst: List[T])(f: T => List[T]): List[T] = {
    lst match {
      case Nil => Nil
      case h::t => f(h) ++ flatMap(t)(f)
    }
  }

}

