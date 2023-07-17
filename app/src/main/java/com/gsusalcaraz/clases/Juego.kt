package com.gsusalcaraz.clases

class Juego() {
    var puntuacion = 0

    inner class Marcador() {
        fun incremetar(puntos: Int) {
            puntuacion = puntuacion + puntos
        }
        fun decrementar(puntos: Int) {
            puntuacion = puntuacion - puntos
        }
    }
}