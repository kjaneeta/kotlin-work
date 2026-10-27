// Task 7.7.1: statistics functions

fun median(floatings: List<Float>): Float {
    var median: Float
    if (floatings.size == 0) {
        throw IllegalArgumentException("Must not be empty list!")
    }
    else if (floatings.size == 1) {
        median = floatings[0]
    }
        
        else if ((floatings.size % 2) == 0) {
            median = (((floatings[(floatings.size/2)-1]) + (floatings[floatings.size/2])) / 2)
            
        }
        else {
            median = floatings[(floatings.size/2)]
        }
    
    println(median)
    return median
}

fun displayStats(floatings: List<Float>) {
    val minimum = floatings.min()
    val maximum = floatings.max()
    val median = median(floatings)
    val mean = floatings.average()
    println("Minimum: $minimum, Maximum: $maximum, Median: $median, Mean: $mean")
}
