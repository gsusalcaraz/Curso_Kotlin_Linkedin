package com.gsusalcaraz.clases.interfaces

interface Motor {
    fun arrancar()
    fun acelerar(unidades: Int)
    fun frenar(unidades: Int)
    fun parar()
}