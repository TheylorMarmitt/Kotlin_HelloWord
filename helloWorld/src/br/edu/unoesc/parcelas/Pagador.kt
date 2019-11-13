package br.edu.unoesc.parcelas


class Pagador(val valorTotal: Double, val qtdDias: Int, val qtdParcelas: Int) {

    fun valorPorParcela(): Double {
        return valorTotal/qtdParcelas
    }

}