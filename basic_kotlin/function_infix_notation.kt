


//infix notation adalah operasi yang digunakan pada operasi matematikan, dimanaa dia melakukan operasi pada dua data 
// syarat infix notation -> harus menjadi function pada member class nya -> harus memiliki paramater -> tidak boleh memiliki parameter vararg

infix fun String.change(name : String): String {
    if (name == "haliim") {
       return name.uppercase()
    } else {
        return name.lowercase()
    }
}
