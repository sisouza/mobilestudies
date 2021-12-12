fun main() {

//podemos declarar valores do tipo char ou strings
var lonelychar = 'k'
println(lonelychar)
var mystring = "kotlin"
println(mystring)

//podemos realizar uma operacão de iteracão com strings
for (char in mystring){
	println(char)
}

/**
 * IMPORTANTE
 * Strings são imutaveis, ou seja uma vez que tenham sido declaradas
 * seu valor não pode ser alterado portanto ao realizar operacões com o 
 * tipo String, o valor original não é alterado e o resultado é salvo em um novo
 * Objeto String.
 */


//Template Literals

//concatenacão simples
val mydrink = "chocolate"
println("time to drink a: "+ mydrink) 


//facilitam a concatenacão e exibicão de valores
val drink = "coffee"
println("time to drink a ${drink}") 

//Utilizando Null Safety

//especificando que languague pode ser anulavel
val language: String? = null
println("${language}") 

//ou seja pode receber um valor do tipo String ou pode ser nulo

}