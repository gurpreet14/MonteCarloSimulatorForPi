
import org.ddahl.rscala.RClient
import breeze.linalg._

import scala.collection.mutable.ArrayBuffer

/**
  * Created by GP on 25/12/17.
  */
object Main {

  def main (args: Array[String]): Unit = {

    val R = RClient()

    val points = new ArrayBuffer[Vector[Double]]
    val total = 1500
    for( a <- 1 to total) {
      points += Vector[Double](R.evalD1("m <- runif(2)"))
    }

    val incircle= points.map(x=>isInCircle(x)).filter(x=>x).length
    val pi = 4*(incircle/1500.0)
//    println(points.mkString(" "))
//    println(incircle)
    println(s"value of pi is ${pi}")

  }

  def isInCircle(value: Vector[Double]): Boolean =
  {
//    centre of the circle is (0.5,0.5)
    val x0 = 0.5
    val y0 = 0.5
    val dist = scala.math.pow((x0-value{0}),2.0)+scala.math.pow((y0-value{1}),2)

    if (dist < scala.math.pow(0.5,2))
      return true
    return false
  }
}

