package com.gsusalcaraz.clases

fun main() {
    // miRectangulo()
    // miDireccion()
    // clasesEnum()
    // extensiones()
    // clasesAninadas()


}

fun clasesAninadas() {
    val miProcesador = Ordenador.Procesador(4, 2.9)
    println(miProcesador.mostrarEspecificaciones())

    val miJuego = Juego()
    val miMarcador = miJuego.Marcador()
    miMarcador.incremetar(20)
    println("La puntuación de mi miJuego es ${miJuego.puntuacion}")
    miMarcador.decrementar(5)
    println("La puntuación de mi miJuego es ${miJuego.puntuacion}")
}

fun extensiones() {
    val nombre = "Juan"
    val primerCaracter = nombre.primero()
    println(primerCaracter)
    val segundoCaracter = nombre.segundo()
    println(segundoCaracter)
    val tercerCaracter = nombre.tercero
    println(tercerCaracter)
}

fun clasesEnum() {
    val colorSalmon = Color.SALMON.hex
    println(DiasDeLaSemana.MIERCOLES.ordinal)
    println(DiasDeLaSemana.MIERCOLES.name)
    println("------")
    for (dia in DiasDeLaSemana.values()){
        println("${dia.ordinal} - $dia")
    }
}

private fun miDireccion() {
    val miDireccion = Direccion("Paseo de Almería", 8, 235412, "Almería")
    println(miDireccion.toString())
    val miDireccion2 = Direccion("Paseo de Almería", 8, 235412, "Almería")
    println("¿Es miDireccion igual a miDireccion 2? ${miDireccion.equals(miDireccion2)}")
    val miDireccion3 = miDireccion.copy(codigoPostal = 4131)
    println(miDireccion3.toString())

}

private fun miRectangulo() {
    var miRectangulo = Rectangulo(2.0, 2.0)

    println("miRectangulo tiene un alto de ${miRectangulo.alto} y un ancho de ${miRectangulo.ancho}")

    miRectangulo.alto = 24.0
    miRectangulo.ancho = 24.0

    println("miRectangulo tiene un alto de ${miRectangulo.alto} y un ancho de ${miRectangulo.ancho}")

    var area = miRectangulo.obtenerArea()
    println("El area es: $area")

    if (miRectangulo.esCuadrado) {
        println("El rectángulo es cuadrado")
    } else
        println("El rectángo NO es cuadrado")
}