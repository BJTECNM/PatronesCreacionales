package abstractfactory

class ComponentesRojos : Componentes {
    override val boton: Boton
        get() = BotonRojo()
    override val lista: Lista
        get() = ListaRoja()
}