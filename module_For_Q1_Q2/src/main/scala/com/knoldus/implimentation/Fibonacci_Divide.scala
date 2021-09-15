package com.knoldus.implimentation

import com.knoldus.traits.fibonacci_divide

class Fibonacci_Divide extends fibonacci_divide{
  override def divide(a: Int, b: Int): Int = a / b

  override def fibonacci(lastTerm: Int): String = {
    var (prevNum, nextNum, sum, i) = (0, 1, 0, 2)
    var fibonacciSeriesStr = prevNum + " " + nextNum

    if (lastTerm < 0)
      return "Invalid Input"
    else if (lastTerm == 1)
      return "0"
    else if (lastTerm == 2)
      return fibonacciSeriesStr

    while (i < lastTerm) {
      sum = prevNum + nextNum
      fibonacciSeriesStr += " " + sum
      prevNum = nextNum
      nextNum = sum
      i += 1
    }
    fibonacciSeriesStr
  }
}
