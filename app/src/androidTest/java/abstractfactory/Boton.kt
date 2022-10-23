package abstractfactory

abstract class Boton {
    var texto: String? = null
    fun dibujar() {
        println("Dibujando el botón...")
    }

    abstract fun configurar()
}