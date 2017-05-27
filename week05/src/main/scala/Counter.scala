/**
  * Created by steven on 06/05/2017.
  */
class Counter(val count:Int) {

  class Adder(amount: Int) {
    def add(in: Int) = in + amount
  }

  def inc = new Counter(count+1)

  def dec = new Counter(count-1)

  def inc(n:Int) = new Counter(count+1)

  def dec(n:Int) = new Counter(count-1)
    def adjust(a:Adder) = {
    new Counter(a.add(count))
  }



}
