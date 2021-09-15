package com.knoldus.implimentation
import org.scalatest.flatspec.AnyFlatSpec
class DIvide_fibonacci_test extends AnyFlatSpec {
  val forValidatingDivideOpr =new Fibonacci_Divide()
  val forValidatingFibonacciOpr =new Fibonacci_Divide()


  // Test cases to validate divide method

  "A number 12" should "return 4 when divided by 3" in{

    assert(forValidatingDivideOpr.divide(12,3)==4)
  }

  it should "throw ArithmeticException when divided by 0" in{

    assertThrows[ArithmeticException] {
      forValidatingDivideOpr.divide(12,0)
    }
  }

  // Test cases to validate fibonacci method.

  "When user gives a positive number " should "generate the fibonacci series " in{
    val lastTerm=6
    assert(forValidatingFibonacciOpr.fibonacci(lastTerm).equals("0 1 1 2 3 5"))
  }

  "When user gives a negative number " should "not accept that value and should print an error message" in{
    val lastElement= -10
    assert(forValidatingFibonacciOpr.fibonacci(lastElement).equals("Invalid Input"))
  }

}
