package com.yeahthon.scala

import util.control.Breaks._

object ScalaField {

  def main(args: Array[String]): Unit = {

    val result: Unit = for (i <- 1 to 3) {
      println(i)
      i
    }
    println(result)
    println()

    val resultTwo = for (j <- 1 to 3) yield {
      println(j)
    }
    println(resultTwo)
    println()

    var n = 1

    breakable {

      while (n < 10) {

        println(n)
        n += 1

        if (n == 5) {
          break()
        }
      }
    }

    var m = 0

    while (m < 10) {

      breakable {

        m += 1

        if (m % 2 != 0) {
          println(m)
        } else {
          println("continue")
          break()
        }
      }
    }

  }

}
