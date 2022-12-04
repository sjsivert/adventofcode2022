package Day03

import java.io.File

fun readLines(fileName: String): List<String> {
    return File(fileName).readLines()
}