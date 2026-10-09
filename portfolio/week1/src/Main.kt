// COMP2850 Portfolio: Week 1
// Name: Kayla Janeeta Rahardjo
// Student ID: 201967257
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main(args: Array<String>)
{
    if(args.size != 3)
    {
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    val semiperimeter = (0.5)*(args[0].toFloat() + args[1].toFloat() + args[2].toFloat())
    val area = sqrt((semiperimeter)*(semiperimeter - args[0].toFloat())*(semiperimeter - args[1].toFloat())*(semiperimeter - args[2].toFloat()))
    System.out.printf("Area = %.5f\n", area)
}