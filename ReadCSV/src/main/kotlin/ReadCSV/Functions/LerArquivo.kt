package ReadCSV.Functions

import ReadCSV.Model.Cancelamento
import com.opencsv.CSVReader
import java.io.BufferedReader
import java.io.FileReader
import java.io.IOException
import java.time.LocalDate
import java.time.format.DateTimeFormatter

fun ler(): ArrayList<Cancelamento>{
    var fileReader: BufferedReader? = null
    var csvReader: CSVReader? = null
    var lista = ArrayList<Cancelamento>()

    try {
        fileReader = BufferedReader(FileReader("/Users/TheylorMarmitt/IntelliJ/Componente/kotlin/cancelamentos.csv"))
        csvReader = CSVReader(fileReader)
        var record: Array<String>?

        csvReader.readNext()
        record = csvReader.readNext()
        while (record != null) {

            lista.add(
                Cancelamento(
                    cliente_id = record[0].toLong(),
                    usuario_responsavel_id = record[1].toLong(),
                    data_cadastro = LocalDate.parse(record[2], DateTimeFormatter.ISO_DATE),
                    classificacao_cliente = record[3],
                    quantidade_usuario_pagante = record[4].toInt(),
                    data_inicio = LocalDate.parse(record[5], DateTimeFormatter.ISO_DATE),
                    data_cancelamento = LocalDate.parse(record[6], DateTimeFormatter.ISO_DATE),
                    motivo_cancelamento_id = record[7].toInt(),
                    motivo = record[8]
                )
            )

            record = csvReader.readNext()
        }
        csvReader.close()

    } catch (e: Exception) {
        println("Reading CSV Error!")
        e.printStackTrace()
    } finally {
        try {
            fileReader!!.close()
            csvReader!!.close()
        } catch (e: IOException) {
            println("Closing fileReader/csvParser Error!")
            e.printStackTrace()
        }
    }
    return lista
}