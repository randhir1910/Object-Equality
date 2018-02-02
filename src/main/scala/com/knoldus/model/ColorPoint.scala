package com.knoldus.model

import com.knoldus.constant.Color

class ColorPoint[T](first: T, second: T, val color: Color.Value) extends Point(first, second) {

  override def hashCode: Int = (super.hashCode, color).##

   override def isEqual(any: Any): Boolean = any.isInstanceOf[ColorPoint[T]]

  override def equals(anyType: Any): Boolean = anyType match {
    case colourPoint: ColorPoint[T] => (colourPoint isEqual this) && super.equals(colourPoint) && colourPoint.color == this.color
    case _ => false
  }
}
