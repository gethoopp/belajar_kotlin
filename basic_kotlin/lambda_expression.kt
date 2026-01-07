package basic_kotlin

//lambda expression merupakan function yang tidak memiliki nama 
//function dalam kotlin bisa disimpan dalam variabel array bahkan dikirim ke parameter fucntion itu sendiri 
// lambda dibuat tanpa mendeklarasikan function itu sendiri 
// secara default pada lambda baris terkahir menjadi return value nya 

 fun toLower (value:String): String =  value.lowercase()

fun lambda_expression()  {
    val lambdaExpression: (String) -> String = { nameOrang: String -> 
        "Haloo $nameOrang"
    }
    val result = lambdaExpression("Supriadi")
    println(result)

  
    val loweLamda: (String) -> String = :: toLower

    println(loweLamda("SULAIMAN"))
    
}