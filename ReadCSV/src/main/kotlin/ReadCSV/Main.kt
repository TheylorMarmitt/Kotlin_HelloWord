

import ReadCSV.Functions.*

fun main(args: Array<String>?) {

    // lendo
    var lista = ler()

    // 1
    println("-------------   EX - 1   -------------")
    contandoCancelamentos(lista)

    // 2
    println("-------------   EX - 2   -------------")
    mediaTempoVida(lista)

    // 3
    println("-------------   EX - 3   -------------")
    contandoCancelamentosMotivo(lista)

    // 4
    println("-------------   EX - 4   -------------")
    contandoCancelamentosMesAno(lista)

    // 5
    println("-------------   EX - 5   -------------")
    contandoCancelamentosUserResponsavel(lista)


    
}

