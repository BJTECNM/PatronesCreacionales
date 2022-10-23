package abstractfactory

class ListaAzul : Lista() {
    init {
        configurar()
    }

    override fun configurar() {
        println("Configurando la lista AZUL")
    }
}