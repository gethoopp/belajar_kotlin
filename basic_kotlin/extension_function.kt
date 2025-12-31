package basic_kotlin



// extension function adalah kemampuan menambahkan function pada tipe data yang sudah ada 
// salah satu fitur yang powerful namun harap digunakan dengan bijak dikarenakan dapat membuat program telriihat sulit dimengerti
// untuk membuat extension menambhakan tipe data pada nama function nya dan diikuti . 

fun String.ucapanSelamat() = print("Selamat berlibu pak $this")