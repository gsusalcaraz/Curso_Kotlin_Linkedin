package com.gsusalcaraz.clases.nulabilidad

fun main() {

    //nulabilidad1()
    // nulabilidad2()
}

fun nulabilidad2() {
    val dia: Any = "lunes"
    dia is Int
    dia is String
}

fun nulabilidad1() {
    val nombre: String? = null
    val apellido = "Garcia"

//    if (nombre != null) {
//        nombre.uppercase()
//    }

    var nombreEnMayusculas = nombre?.uppercase()?:"EXTRAÑO"
    println(nombreEnMayusculas)

    apellido.uppercase()
}
