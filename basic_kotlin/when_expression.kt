
package basic_kotlin

fun when_expression() {

    // when expression -> when expression digunakan untuk menggantikan fungsi if else if yang
    // panjang
    val nilaiUjian = 101

    when (nilaiUjian) {
        in 83..100 -> println("Selamat Anda Lulus dengan Pujian")
        in 70..82 -> println("Selamat Anda Lulus")
        in 0..50 -> println("Maaf Anda Tidak Lulus")
        else -> println("Nilai Tidak Valid")
    }

    val alamatRumah = "BTG"
    val alamatSingkat = "Bontang"

    when (alamatSingkat == "Bontang" && alamatRumah == "BTG") {
        false -> println("Anda Bukan dari Bontang")
        true -> println("Anda dari Bontang")
    }

    // when expression mengguankan range
    val rentangUmur = 25

    when (rentangUmur) {
        in 0..10 -> println("Anak - anak")
        in 11..20 -> println("Remaja")
        in 21..30 -> println("Dewasa")
        else -> println("Umur Tidak Valid")
    }

    // when expression in
    val UmurAnggota = 20
    val daftarUmurAnggotaAktif = arrayOf(25, 20, 22)

    when (UmurAnggota) {
        in daftarUmurAnggotaAktif -> println("Anggota Aktif")
        !in daftarUmurAnggotaAktif -> println("Bukan Anggota Aktif")
    }
}