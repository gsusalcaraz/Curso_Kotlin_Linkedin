package com.gsusalcaraz.clases.interfaces

interface Reproductor {
    fun play(cancion: String){
        println("Reproduciendo canción $cancion")
    }
    fun stop()
    fun pause()
}