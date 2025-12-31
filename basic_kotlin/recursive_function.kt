package basic_kotlin

// meurpakan function yang memanggil dirisnya sendiri 
// biasnaya digunakan unutk menghitung faktorial 

fun functionRecursive(nilai: Int):Int {
    return when (nilai) {
        1 -> 1
        else -> nilai * functionRecursive(nilai - 1)
    }

}