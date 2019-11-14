package br.edu.unoesc.parcelas

import kotlin.math.round


class Pagador(val valorTotal: Double, val qtdDias: Int, val qtdParcelas: Int) {

    fun valorPorParcela(): Double {
        return (round(valorTotal/qtdParcelas))
    }

}