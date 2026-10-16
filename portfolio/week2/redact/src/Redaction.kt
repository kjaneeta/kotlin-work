// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
// Kayla Janeeta Rahardjo 201967257

fun redact(text: String, target: String, symbol: Char): String
{
    if (target == "") {
        return text
    }
    else {
        var mask = ""
        for(m in 1..target.length)
        {
            mask = mask.plus(symbol)
        }
        return text.replace(target, mask)
    }
}

fun redact(text: String, target: String): String
{
    if (target == "") {
        return text
    }
    else {
        var mask = ""
        for(m in 1..target.length)
        {
            mask = mask.plus('X')
        }
        return text.replace(target, mask)
    }
}