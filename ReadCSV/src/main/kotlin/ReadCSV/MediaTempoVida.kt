package ReadCSV

import java.time.temporal.ChronoUnit

fun mediaTempoVida(lista: ArrayList<Cancelamento>){

    var dias = ArrayList<Long>()

    lista.forEach {
        dias.add(ChronoUnit.DAYS.between(it.data_inicio, it.data_cancelamento))
    }

    println("Média dias: "+ dias.sum().div(dias.size))

}