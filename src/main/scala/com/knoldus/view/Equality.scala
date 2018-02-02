package com.knoldus

import com.knoldus.constant.Const
import com.knoldus.model.Point
import org.apache.log4j.Logger

object Equality extends App {

  val Output = Logger.getLogger(this.getClass)

  val FirstPoint = new Point[Int](Const.one, Const.two)
  val SecondPoint = new Point[String]("1", "2")
  val ThirdPoint = new Point[Int](Const.one, Const.two)

  Output.info(FirstPoint == SecondPoint)
  Output.info(FirstPoint == ThirdPoint)

}
