package com.gsusalcaraz.clases.herencia

open class Animal(val edad: Int, val tipo: TipoDeAnimal) {

    init {
        println("Inicialización de Animal")
    }
    fun dormir() {
        println("Estoy durmiendo")
    }

    open fun comer() {
        println("Estoy comiendo")
    }

    class Gato(edad: Int) : Animal(edad, TipoDeAnimal.VERTEBRADO ) {
        init {
            println("Inicialización de Gato")
        }

        override fun  comer(){
            println("Estoy comiendo sardinas")
        }
        fun maullar() {
            println("Miau")
        }
    }

    class Perro (edad: Int): Animal(edad, TipoDeAnimal.VERTEBRADO) {
        fun ladrar() {
            println("Guau")
        }
    }

    class Ave (edad: Int): Animal(edad, TipoDeAnimal.VERTEBRADO) {
        fun volar() {
            println("Estoy volando")
        }
    }
}


