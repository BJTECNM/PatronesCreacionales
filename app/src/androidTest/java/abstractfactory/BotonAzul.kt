package abstractfactory

class BotonAzul : Boton() {
    init {
        configurar()
    }

    override fun configurar() {
        println("Configurando el botón AZUL")
    }
}