

import ReadCSV.Functions.*

fun main(args: Array<String>?) {

    // lendo
    var lista = ler()

    println("-------------   EX - 1   -------------")
    // 1
    contandoCancelamentos(lista)

    println("-------------   EX - 2   -------------")
    // 2
    mediaTempoVida(lista)

    println("-------------   EX - 3   -------------")
    // 3
    contandoCancelamentosMotivo(lista)

    println("-------------   EX - 4   -------------")
    // 4
    contandoCancelamentosMesAno(lista)

    println("-------------   EX - 5   -------------")
    // 5
    contandoCancelamentosUserResponsavel(lista)
}

