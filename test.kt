import basic_kotlin.when_expression
import basic_kotlin.for_loop
import basic_kotlin.while_loo
import basic_kotlin.addrres_person
import basic_kotlin.greeting_another
import basic_kotlin.hitungLebar
import basic_kotlin.singleExpression
import basic_kotlin.ucapanSelamat
import basic_kotlin.sayCheers
import basic_kotlin.sayWhen
import basic_kotlin.functionRecursive
import basic_kotlin.tailRecursive
import basic_kotlin.lambda_expression
import basic_kotlin.perulangan

fun main() {
    when_expression()
    for_loop()
    while_loo()
    greeting_another()
    addrres_person(alamat = "Jalan Mangga", kota = "Bontang", tempatlLahir = "Bontang")
    println(hitungLebar(20, 20))
    singleExpression("pamungkas")
    var nama = "haliim"
    println(nama.ucapanSelamat())
    val result = "" change "haliim"
    println(result)
    println(sayCheers("Haliim"))
    println(sayWhen(90))
    println(functionRecursive(10))
    println(tailRecursive(1))
    lambda_expression() 
    perulangan(10);
    println(InputNama("anjing") { value: String -> filterName(value) })
     var counter = 0

    val anonyMousFunction = fun() {
       counter++
    }


    val counterFunction = fun() {
        counter++
    }


   anonyMousFunction()
   counterFunction()

 print(counter)

}

/*kotlinc test.kt -include-runtime -d test.jar
 kotlinc test.kt basic_kotlin/*.kt -include-runtime -d test.jar
java -jar test.jar
*/