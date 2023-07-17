package com.gsusalcaraz.clases.clasesAbstractas

fun main(){
    val miCirculo = Circulo(2.3)
    val miRectangulo = Rectangulo(3.2, 2.1)

    println("${miCirculo.obtenerArea()} - ${miRectangulo.obtenerPerimetro()}")
}