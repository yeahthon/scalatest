package com.yeahthon.scala

class Person {

  var name: String = _

  var age: Int = _

  def this(age: Int) {
    this()
    this.age = age
    println("辅助构造器")
  }

  println("主构造器")
}

object Person {

  def main(args: Array[String]): Unit = {

    new Person(18)
  }

}
