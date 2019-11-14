package ReadCSV.Functions

import ReadCSV.Model.Cancelamento
import ReadCSV.Model.CancelamentoMotivo
import ReadCSV.Model.CancelamentoUserResponsavel

fun contandoCancelamentosUserResponsavel(lista: ArrayList<Cancelamento>): List<CancelamentoUserResponsavel>{

    var cancelamentoPorMotivo = ArrayList<CancelamentoUserResponsavel>()
    val filtrada = lista.distinctBy { it.usuario_responsavel_id }

    filtrada.forEach {
        val user = it.usuario_responsavel_id
        var count = 0
        lista.forEach{
            if (it.usuario_responsavel_id == user){
                count += 1
            }
        }
        cancelamentoPorMotivo.add(CancelamentoUserResponsavel(total = count, userResponsavel = user))
    }

    return cancelamentoPorMotivo.sortedByDescending { m -> m.total }

}