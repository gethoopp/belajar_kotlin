package basic_kotlin



//kotlin mendukung return sebelum if atau when
// di dalam dalam blok if dan when itu kita menggunakan return namun sekarang sebelum if dan when dapat digunakan return 

fun sayCheers(name: String) {
    return if (name == "haliim") {
     println("Halo halim apa kabar")
    }else {
        println("Maaf salah orang")
    }


   
}


fun sayWhen(nilaiUjian : Int) {
    return when( nilaiUjian) {
       in 83..100 -> println("Selamat Anda Lulus dengan Pujian")
        in 70..82 -> println("Selamat Anda Lulus")
        in 0..50 -> println("Maaf Anda Tidak Lulus")
        else -> println("Nilai Tidak Valid")
    }
}