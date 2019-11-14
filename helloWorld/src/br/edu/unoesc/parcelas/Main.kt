package br.edu.unoesc.parcelas

import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.util.*


fun main(){
    val reader = Scanner(System.`in`)

    println("Digite o valor total ")
    val valor :Double = reader.nextDouble()

    println("Digite a quatidade de parcelas ")
    val parcelas :Int = reader.nextInt()

    println("Digite o intervalo de dias por parcelas ")
    val intervalo :Int = reader.nextInt()

    reader.close()

    val formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy")
    listaParcelas(Pagador(qtdDias = intervalo, qtdParcelas = parcelas, valorTotal = valor )).forEach {
        println("----------------------")
        println("Data: " + it.data.format(formatter))
        if(parcelas == it.numero){
            println("Valor: " + (valor - ((it.valor * (parcelas - 1)))))
        }else{
            println("Valor: " + it.valor)
        }
        println("Parcela número: " + it.numero)
    }

}

