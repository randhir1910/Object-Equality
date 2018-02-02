package com.knoldus

import com.knoldus.constant.{Color, Const}
import com.knoldus.model.{ColorPoint, Point}
import org.apache.log4j.Logger

object Equality extends App {

  val Output = Logger.getLogger(this.getClass)

  val FirstPoint = new Point[Int](Const.one, Const.two)
  val SecondPoint = new Point[String]("1", "2")
  val ThirdPoint = new Point[Int](Const.one, Const.two)

  Output.info(FirstPoint == SecondPoint)
  Output.info(FirstPoint == ThirdPoint)

  val FirstColourPoint = new ColorPoint[Int](1, 2, Color.Red)
  val SecondColourPoint = new ColorPoint[Int](1, 2, Color.Green)

  Output.info(FirstPoint == FirstColourPoint)
  Output.info(FirstPoint == FirstPoint)

}
