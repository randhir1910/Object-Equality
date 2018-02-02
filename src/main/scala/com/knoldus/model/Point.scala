package com.knoldus.model

class Point[T](val first: T, val second: T) {

  override def hashCode: Int = (first, second).##

   def isEqual(anyValue: Any): Boolean = anyValue.isInstanceOf[Point[T]]

  override def equals(anyValue: Any): Boolean = anyValue match {
    case point: Point[T] => (point isEqual(this)) && (this.first == point.first) && (this.second == point.second)
    case _ => false
  }
}
