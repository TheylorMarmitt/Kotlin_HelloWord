package br.edu.unoesc.parcelas

import java.time.LocalDate

fun listaParcelas(pagador: Pagador): ArrayList<Parcela>{
    var lista = ArrayList<Parcela>()
    val dias = LocalDate.now()
    for (x in 1..pagador.qtdParcelas)
        lista.add(Parcela(
            data = dias.plusDays(pagador.qtdDias.toLong() * x),
            valor = pagador.valorPorParcela(),
            numero = x))
    return lista;
}