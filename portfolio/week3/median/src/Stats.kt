// Task 7.7.1: statistics functions

fun median(floatings: List<Float>): Float {
    var median = 0.0f
    if (floatings.size == 0) {
        throw IllegalArgumentException("Must not be empty list!")
    }
    else {
        
        if (floatings.size % 2 == 0) {
            var median = (((floatings[floatings.size/2]) + (floatings[floatings.size/2] + 1)) / 2)
        }
        else {
            var median = floatings[(floatings.size/2)+1]
        }
    }
    return median
}

fun displayStats(floatings: List<Float>) {
    val minimum = floatings.min()
    val maximum = floatings.max()
    val median = median(floatings)
    val mean = floatings.average()
    println("Minimum: $minimum, Maximum: $maximum, Median: $median, Mean: $mean")
}
