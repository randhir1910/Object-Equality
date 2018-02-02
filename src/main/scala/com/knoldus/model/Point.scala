package com.knoldus.model

class Point[T](val first: T, val second: T) {
  override def hashCode = (first, second).##

  def isEqual(anyValue: Any) = anyValue.isInstanceOf[Point[T]]

  override def equals(anyType: Any) = anyType match {
    case point: Point[T] => (point isEqual this) && (this.first == point.first) && (this.second == point.second)
    case _ => false
  }
}
