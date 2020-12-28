package com.yeahthon.scala

object ScalaParam {

  def main(args: Array[String]): Unit = {

    def paramScala(s: String*): Unit = {

      println(s)
    }

    paramScala("ParamOne", "ParamTwo")
    paramScala()
  }

}
