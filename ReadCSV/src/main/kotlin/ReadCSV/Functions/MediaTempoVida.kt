package ReadCSV.Functions

import ReadCSV.Model.Cancelamento
import java.time.temporal.ChronoUnit
import kotlin.math.round

fun mediaTempoVida(lista: ArrayList<Cancelamento>){

    var dias = ArrayList<Long>()

    lista.forEach {
        dias.add(ChronoUnit.DAYS.between(it.data_inicio, it.data_cancelamento))
    }

    println("Média dias: "+ "%.2f".format(dias.average()))

}