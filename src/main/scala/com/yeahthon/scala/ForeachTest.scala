package com.yeahthon.scala

object ForeachTest {

  def main(args: Array[String]): Unit = {

    for (i <- 1 to 3) {
      println(i)
    }

    for (i <- 1 until 3 if i != 2) {
      println(i)
    }
    println()

    for(i <- 1 to 10 by 2) {
      println(i)
    }
    println()

    for(i <- 1 to 3;j <- 1 to 3) {
      println(i + " " + j)
    }
    println()

    for(i <- 1 to 3;j = i + 9) {
      println(i + " " + j)
    }
    println()
  }

}
