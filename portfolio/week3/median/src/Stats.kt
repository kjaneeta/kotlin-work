// Task 7.7.1: statistics functions

fun median(floatings: List<Float>())
{
    val median = 0
    // is the list already pre-sorted?
    if (floatings.size % 2 == 0)
    {
        median = floatings[floatings.size/2]
    }
    else
    {
        median = floatings[(floatings.size/2)+1]
    }
}

fun displayStats(floatings: List<Float>())
{
    val minimum = floatings.min()
    val maximum = floatings.max()
    val median = floatings.median()
    val mean = floatings.average()
    return minimum, maximum, median, mean
}
