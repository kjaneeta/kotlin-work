// Task 3.5: simple file I/O

import kotlin.io.path.Path
import kotlin.io.path.appendText
import kotlin.io.path.readText
import kotlin.io.path.writeText

fun main() {
    val filePath = Path("test.txt")
    val fileContents = filePath.writeText("hi janeeta")
    val fileReplace = filePath.appendText("halo dunia")
    val fileRead = filePath.readText()
    println(fileRead)
}
