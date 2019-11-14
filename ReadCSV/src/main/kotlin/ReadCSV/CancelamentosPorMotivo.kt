package ReadCSV

fun contandoCancelamentosMotivo(lista: ArrayList<Cancelamento>){

    var cancelamentoPorMotivo = ArrayList<CancelamentoMotivo>()

    lista.forEach {
        val motivo = it.motivo
        var count = 0
        lista.forEach{
            if (it.motivo == motivo){
                count += 1
            }
        }
        cancelamentoPorMotivo.add(CancelamentoMotivo(total = count, motivo = motivo))
    }

    var nova = cancelamentoPorMotivo.distinctBy { it.motivo }.sortedByDescending { it.total }
    nova.forEach {
        print(it.total)
        print(" - ")
        println(it.motivo)
    }

}