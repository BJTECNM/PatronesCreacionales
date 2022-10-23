package abstractfactory

class ComponentesAzules : Componentes {
    override val boton: Boton
        get() = BotonAzul()
    override val lista: Lista
        get() = ListaAzul()
}