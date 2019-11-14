

import ReadCSV.contandoCancelamentos
import ReadCSV.contandoCancelamentosMotivo
import ReadCSV.ler
import ReadCSV.mediaTempoVida

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

