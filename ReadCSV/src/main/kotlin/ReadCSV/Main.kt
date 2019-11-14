

import ReadCSV.Functions.*
import java.time.format.DateTimeFormatter

fun main(args: Array<String>?) {

    // lendo
    val lista = ler()

    // 1
    println("-------------   EX - 1   -------------")
    contandoCancelamentos(lista).forEach {
        print(it.total)
        print(" - ")
        println(it.classificacao)
    }

    // 2
    println("-------------   EX - 2   -------------")
    println("Média: "+ "%.0f".format(mediaTempoVida(lista)) + " dias")

    // 3
    println("-------------   EX - 3   -------------")
    contandoCancelamentosMotivo(lista).forEach {
        print(it.total)
        print(" - ")
        println(it.motivo)
    }

    // 4
    println("-------------   EX - 4   -------------")
    val formatter = DateTimeFormatter.ofPattern("MM/yyyy")
    contandoCancelamentosMesAno(lista).forEach {
        print(it.total)
        print(" - ")
        println(it.mesAno.format(formatter))
    }

    // 5
    println("-------------   EX - 5   -------------")
    contandoCancelamentosUserResponsavel(lista).forEach {
        print(it.total)
        print(" - ")
        println(it.userResponsavel)
    }
}

