package com.gsusalcaraz.clases

class Ordenador(val RamGB: Double, val procesador: Procesador) {

    class Procesador (val numeroDeNucleos: Int, val frecuenciaGHz: Double){
        fun mostrarEspecificaciones(){
            println("Numero de núcleos: $numeroDeNucleos, Frecuencia: $frecuenciaGHz GHz")
        }
    }
}




