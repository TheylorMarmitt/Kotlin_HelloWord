package ReadCSV.Functions

import ReadCSV.Model.Cancelamento
import ReadCSV.Model.CancelamentoMotivo
import ReadCSV.Model.CancelamentoUserResponsavel

fun contandoCancelamentosUserResponsavel(lista: ArrayList<Cancelamento>){

    var cancelamentoPorUser = ArrayList<CancelamentoUserResponsavel>()

    lista.forEach {
        var userResponsavel = it.usuario_responsavel_id
        var count = 0
        lista.forEach{

        }
    }

    var nova = lista.distinctBy { it.usuario_responsavel_id }

    nova.forEach {
        println(it.usuario_responsavel_id)
    }

}