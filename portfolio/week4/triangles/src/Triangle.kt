// COMP2850 Portfolio: Week 4
// Triangle class

// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry
// Name: Kayla Janeeta Rahardjo 201967257

import kotlin.math.sqrt


data class Triangle constructor(val sideA: Double, val sideB: Double, val sideC: Double)
{

    init { 
        if (!isValidTriangle())
        {
            throw IllegalArgumentException("Not a valid triangle!")
        }
    }
    

    val perimeter = sideA + sideB + sideC
    val semiPerimeter = perimeter/2
    val area = sqrt(semiPerimeter*(semiPerimeter-sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC))

    fun isValidTriangle(): Boolean 
    {
        // val (sideA, sideB, sideC) = tri
        if ((sideA < sideB+sideC) && (sideB < sideA+sideC) && (sideC < sideA+sideB)) 
        {
            return true
        }
        else
        {
            // throw exception
            // throw IllegalArgumentException("Not a valid triangle!")
            return false
        }
    } 

    override fun toString(): String {
        return "Triangle($sideA, $sideB, $sideC)" 
    }

}

// typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here
/* fun isValidTriangle(tri: Triangle): Boolean 
{
    val (sideA, sideB, sideC) = tri
    if ((sideA < sideB+sideC) && (sideB < sideA+sideC) && (sideC < sideA+sideB)) 
    {
        return true
    }
    else
    {
        // throw exception
        // throw IllegalArgumentException("Not a valid triangle!")
        return false
    }
} */



/* fun triangleArea(tri: Triangle): Double
{
    if (!isValidTriangle(tri))
    {
        throw IllegalArgumentException("Not a valid triangle!")
    }
    
    val (sideA, sideB, sideC) = tri
    val semiperimeter = (sideA + sideB + sideC)/2
    val area = sqrt(semiperimeter*(semiperimeter-sideA)*(semiperimeter-sideB)*(semiperimeter-sideC))
    return area
} */

