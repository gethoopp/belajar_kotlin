package basic_kotlin


// tail recursive function adalah teknik mengubah recursvie function menjadi looping biasa ketika dijalankan 
// tidak semua recursive function bisa secara otomatis dibuat menjadi tail recursice function 
// di depan function ditambaghkan tailrec dan harus memanggil dirinya sendiri tanpa data lain 


tailrec fun tailRecursive (value : Int) {
   return when(value) {
     10 -> println("Nilai sudah mendekati ambang batas $value")
     else -> tailRecursive(value - 1)
   }
 }