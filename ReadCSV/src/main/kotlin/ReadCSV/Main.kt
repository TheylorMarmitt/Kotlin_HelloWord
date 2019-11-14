

import ReadCSV.Functions.contandoCancelamentos
import ReadCSV.Functions.contandoCancelamentosMotivo
import ReadCSV.Functions.ler
import ReadCSV.Functions.mediaTempoVida

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

}

