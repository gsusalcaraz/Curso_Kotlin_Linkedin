package com.gsusalcaraz.clases.herencia

fun main() {
//    val miAnimal = Animal(5, TipoDeAnimal.VERTEBRADO)
//    miAnimal.dormir()
//
    val miPerro = Animal.Perro(6)
//    miPerro.dormir()
//    miPerro.ladrar()

    val miGato = Animal.Gato(8)
    println("miGato tiene ${miGato.edad} años y es de tipo ${miGato.tipo}")

    miGato.comer()
    miPerro.comer()
}