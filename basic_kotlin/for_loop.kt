package basic_kotlin

// for loop -> digunakan untuk datat iterator seperti array atau range
fun for_loop() {

    // for loop -> digunakan untuk melakukan iterasi terhadap array atau range
    val dataArray = arrayOf("Haliim", "Dimas", "Bagas", "Bagus")
    var total = 0

    // for (name in dataArray) {
    //     println(name)
    //     total++
    // }

    var arrayLength = dataArray.size - 1
    for (i in 0..arrayLength) {
        println("ini adalah index " + i + " Isinya " + dataArray.get(i))
    }


    
}


fun perulangan(nilai: Int) {
    var nilaiUlangan = nilai - 1
  for (i in 0..nilaiUlangan) {
   println(i);
}
}
