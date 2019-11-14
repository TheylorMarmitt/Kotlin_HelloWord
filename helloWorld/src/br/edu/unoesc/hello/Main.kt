package br.edu.unoesc.hello

fun main(args: Array<String>){
    println("funcionou")
    val s1 = Superficie(altura = 3.0, largura = 3.0)
    println(calcular(arrayOf(s1, s1)))
}
