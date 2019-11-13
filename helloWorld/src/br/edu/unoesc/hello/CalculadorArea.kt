package br.edu.unoesc.hello

    fun calcular(superficies: Array<Superficie>): Double {
        return superficies.map(Superficie::getArea).sum()
    }

    //        var soma: Double = 0.0
//        for (superficie in superficies){
//            soma += superficie.getArea()
//        }
//        superficies.forEach { soma += it.getArea() }
