package basic_kotlin


fun range_type() {
     // tipe data range -> range digunakan jika kita ingin membuat isi sebauh nilai yang data nya
    // berurutan
    // jika urutan nya terbalik memakai tanda downTo

    val numberRane = 0..100
    println("number Range : $numberRane")
    println("number Range : ${numberRane.count()}")

    val reverseNumberRange = 100 downTo 0
    println("reverse Number Range : $reverseNumberRange")

    // unutk membuat kenaikan nya dapat tidak hanya satu seperti pangkat atau ganjil dapat memakai
    // kata kunci step
    val stepNumberRange = 0..100 step 2
    println("step Number Range : $stepNumberRange")
}