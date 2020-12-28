package com.yeahthon.scala

object ScalaRecursion {

  def recursionTest(i: Int): Int = {

    if (i == 1) {
      1
    } else {
      i * recursionTest(i - 1)
    }
  }

  def main(args: Array[String]): Unit = {

    val result: Int = recursionTest(5)
    println(result)
  }

}
