package com.yeahthon.scala

object ControlAbstract {

  def loop(n: Int)(op: => Unit): Unit = {

    if (n > 0) {
      op
      loop(n - 1)(op)
    }
  }

  def main(args: Array[String]): Unit = {

    loop(5) {
      println("test")
    }
  }

}
