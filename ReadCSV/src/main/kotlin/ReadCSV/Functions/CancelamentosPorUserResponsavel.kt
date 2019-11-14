package ReadCSV.Functions

import ReadCSV.Model.Cancelamento
import ReadCSV.Model.CancelamentoMotivo
import ReadCSV.Model.CancelamentoUserResponsavel

fun contandoCancelamentosUserResponsavel(lista: ArrayList<Cancelamento>){

    var cancelamentoPorMotivo = ArrayList<CancelamentoUserResponsavel>()

    lista.forEach {
        val user = it.usuario_responsavel_id
        var count = 0
        lista.forEach{
            if (it.usuario_responsavel_id == user){
                count += 1
            }
        }
        cancelamentoPorMotivo.add(CancelamentoUserResponsavel(total = count, userResponsavel = user))
    }

    var nova = cancelamentoPorMotivo.distinctBy { it.userResponsavel }.sortedByDescending { it.total }
    println("Total - Usuario")
    nova.forEach {
        print(it.total)
        print(" - ")
        println(it.userResponsavel)
    }

}