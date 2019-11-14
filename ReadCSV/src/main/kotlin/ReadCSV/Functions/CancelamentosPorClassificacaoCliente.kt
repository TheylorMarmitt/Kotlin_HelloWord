package ReadCSV.Functions

import ReadCSV.Model.Cancelamento
import ReadCSV.Model.CancelamentoCliente

fun contandoCancelamentos(lista: ArrayList<Cancelamento>){

    var cancelamentoPorCliente = ArrayList<CancelamentoCliente>()

    lista.forEach {
        val cla = it.classificacao_cliente
        var count = 0
        lista.forEach{
            if (it.classificacao_cliente == cla){
                count += 1
            }
        }
        cancelamentoPorCliente.add(CancelamentoCliente(total = count, classificacao = cla))
    }

    var nova = cancelamentoPorCliente.distinctBy { it.classificacao }.sortedByDescending { it.total }
    nova.forEach {
        print(it.total)
        print(" - ")
        println(it.classificacao)
    }

}