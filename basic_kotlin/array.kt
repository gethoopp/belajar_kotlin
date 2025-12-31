package basic_kotlin

fun array_type () {
     // Array --> Secara standart array di kotlin tidak dapat bernilai null, jika inign membuat array
    // yang dapat bernilai null, gunakan tanda tanya (?) setelah tipe data
    val members = listOf("A", "B", "C")
    println("Group Members: ${members.joinToString(", ")}")
}