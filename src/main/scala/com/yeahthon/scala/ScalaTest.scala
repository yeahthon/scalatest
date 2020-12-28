package com.yeahthon.scala

import scala.io.StdIn

object ScalaTest {

  def main(args: Array[String]): Unit = {

    val a = 1.6.toInt
    println(a)

    val b: Char = 97
    println(b)

    val c: Int = 'a' + 1
    println(c)

    val d: Char = ('a' + 1).toChar
    println(d)

    val e: Char = 97.toChar
    println(e)

    val s1: String = true + ""
    println(s1)

    val s2: String = "false"
    val b2: Boolean = s2.toBoolean
    println(b2)

    val f: Double = 10.0 / 3
    printf(f.formatted("%.2f"))

    val in: String = StdIn.readLine()
    println(in)

    val s3 = if (false) {
      "字符串"
    } else if (false) {
      true
    } else {
      0
    }
    println(s3)

    val result = if (true) 1 else 2

  }

}
