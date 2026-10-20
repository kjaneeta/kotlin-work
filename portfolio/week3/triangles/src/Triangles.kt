// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry
// Name: Kayla Janeeta Rahardjo 201967257

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
fun isValidTriangle(tri: Triangle): Boolean 
{
    val (side1, side2, side3) = tri
    if ((side1 < side2+side3) && (side2 < side1+side3) && (side3 < side1+side2)) 
    {
        return true
    }
    else
    {
        // throw exception
        return false
    }
}

fun triangleArea(tri: Triangle): Double
{
    if (!isValidTriangle(tri))
    {
        throw IllegalArgumentException("Not a valid triangle!")
    }
    val (side1, side2, side3) = tri
    val semiperimeter = (side1 + side2 + side3)/2
    val area = sqrt(semiperimeter*(semiperimeter-side1)*(semiperimeter-side2)*(semiperimeter-side3))
    return area
}
