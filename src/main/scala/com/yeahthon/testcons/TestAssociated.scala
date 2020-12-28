package com.yeahthon.testcons

class TestAssociated {

}

object TestAssociated {

  def main(args: Array[String]): Unit = {

    val associated = new TestAssociated

    val bool: Boolean = associated.isInstanceOf[TestAssociated]
    println(bool)

    val result: TestAssociated = associated.asInstanceOf[TestAssociated]
    println(result)

    println()
    val nameOne: Class[TestAssociated] = classOf[TestAssociated]
    println(nameOne)
  }
}
