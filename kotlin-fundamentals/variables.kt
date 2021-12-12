fun main() {

//Kotlin é estaticamente tipada ou seja precisamos especificar o tipo da variavel em sua declaracão 
var language: String = "Kotlin"
val birthyear = 2011

//porém kotlin tem suporte a inferencia de tipo
var hobbie = "coding"
//o tipo é implicitamente detectado


//variaveis precedidas de val não podem ter o valor alterado
birthyear = 2021

//mas podem ser inicializadas depois, contando que o tipo esteja declarado
val drink: String
drink = "Coffee"

//variaveis precedidas por var podem ter seu valor alterado
language = "JavaScript" 

//mas não podem ter seu tipo alterado
language = 2021

//ou ser reatribuidas
var language = "PHP"

}