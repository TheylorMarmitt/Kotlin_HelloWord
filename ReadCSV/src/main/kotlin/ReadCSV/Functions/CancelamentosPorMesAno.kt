package ReadCSV.Functions

import ReadCSV.Model.Cancelamento
import ReadCSV.Model.CancelamentoMesAno
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun contandoCancelamentosMesAno(lista: ArrayList<Cancelamento>): List<CancelamentoMesAno>{

    var cancelamentoMesAno = ArrayList<CancelamentoMesAno>()
    val formatter = DateTimeFormatter.ofPattern("MM/yyyy")

    lista.forEach {
        val ano = it.data_cancelamento.year
        val mes = it.data_cancelamento.month
        var count = 0
        lista.forEach{
            if (ano == it.data_cancelamento.year && mes == it.data_cancelamento.month){
                count += 1
            }
        }
        cancelamentoMesAno.add(CancelamentoMesAno(total = count, mesAno = it.data_cancelamento))
    }

    return cancelamentoMesAno.distinctBy { it.mesAno.format(formatter) }.sortedBy { it.mesAno }

}