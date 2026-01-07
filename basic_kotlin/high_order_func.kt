

//highher order function dogunakan digunakan agar function dapat dikembali menjadi parameter atau mengembalikan function lainnya
// higher order function kurang lebih sama dengan dengan yang ada di golang


fun InputNama(mama: String, filrerName: (String) -> String): String{
    var testFilter = filrerName(mama)
    return "Halo ini nama saya $testFilter"
} 

fun filterName(name: String):String {
    if (name == "Haliim") {
        return name
    } else {
        return "...."
    }
}