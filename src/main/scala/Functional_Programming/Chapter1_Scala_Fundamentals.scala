package Functional_Programming

object Chapter1_Scala_Fundamentals {
  def main(args : Array[String]) : Unit = {

    /*
      Scala is very much object oriented programming language
      Every value in scala is an object
      We call methods on objects using dot notation
      There are no operators in scala hence +, -, *, / etc., are methods
    */

    println("Hello World!")
    println(s"Converting Int to Double --  5.toDouble :- ${5.toDouble}")
    println(s"Converting Double to Int -- 5.6.toInt :- ${5.6.toInt}")
    println(s"Calling the method + on Int object 59 passing another Int object 98 -- 56.+(98) :- ${56.+(98)}")

    //If a method has only one parameter then we can call the method without using dot and parentheses
    println(s"Calling the method + without using dot and parentheses -- 56 + 98 :- ${56 + 98}")
  }
}
