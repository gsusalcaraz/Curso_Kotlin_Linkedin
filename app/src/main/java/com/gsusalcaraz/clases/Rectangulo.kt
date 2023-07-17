package com.gsusalcaraz.clases

class Rectangulo(var ancho: Double, var alto: Double) {

    // constructor(rectangulo: Rectangulo) : this(rectangulo.ancho, rectangulo.alto, rectangulo.grosor)

    val esCuadrado: Boolean
        get() = ancho == alto

    var grosor: Int = 1
        set(value) {
            if (value <= 0) {
                throw IllegalAccessException("El valor del grosor debe ser prositivo")
            }
            field = value
        }


//    init {
//        if (ancho <= 0 || alto <= 0) {
//            throw IllegalAccessException("El ancho y el alto no pueden ser negativos")
//        }
//    }


    fun obtenerArea() = alto * ancho
}