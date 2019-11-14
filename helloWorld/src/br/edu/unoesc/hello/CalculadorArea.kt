package br.edu.unoesc.hello

    fun calcular(superficies: Array<Superficie>): Double {
        return superficies.map(Superficie::getArea).sum()
    }
