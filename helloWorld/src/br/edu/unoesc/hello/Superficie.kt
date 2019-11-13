package br.edu.unoesc.hello

data class Superficie(val altura: Double, val largura: Double) {

    fun getArea(): Double {
        return altura*largura
    }

}