package basic_kotlin


// while loop -> sangat flexible akan terus melakukan perulang sampai kondisi berniali false
fun while_loo() {
    var i = 0

    while (i < 40) {
        if (i % 2 == 0) {
            println("Fizz $i")
            i++
            if (i < 40) {
                println("Buzz $i")
            }
        } else {
            i++
        }
    }

    do {
        println("fIZZ $i")
        i++
    } while (i % 2 == 0 && i < 20)
}
