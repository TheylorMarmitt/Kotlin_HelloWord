package ReadCSV.Model

import java.time.LocalDate

class Cancelamento(val cliente_id: Long,
                   val usuario_responsavel_id: Long,
                   val data_cadastro: LocalDate,
                   val classificacao_cliente: String,
                   val quantidade_usuario_pagante: Int,
                   val data_inicio: LocalDate,
                   val data_cancelamento: LocalDate,
                   val motivo_cancelamento_id: Int,
                   val motivo: String)  {
}
