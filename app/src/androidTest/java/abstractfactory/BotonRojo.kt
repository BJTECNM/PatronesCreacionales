package abstractfactory

class BotonRojo : Boton() {
    init {
        configurar()
    }

    override fun configurar() {
        println("Configurando el botón ROJO")
    }
}