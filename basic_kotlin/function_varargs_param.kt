package basic_kotlin


//varags merupakan singkatan dari variabel argumen yang mana artinya datanya dapat menerima satu input atau berubah jadi arraya 
fun kaliJumlah(vararg jumlah: Int): Int {
    var total = 0
  for (i in jumlah) {
     total *= i
  }

  return total
}

