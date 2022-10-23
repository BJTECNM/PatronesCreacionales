package abstractfactory

import abstractfactory.Componentes
import abstractfactory.Boton
import abstractfactory.Lista
import kotlin.jvm.JvmStatic
import abstractfactory.Cliente
import abstractfactory.ComponentesAzules
import abstractfactory.ComponentesRojos
import abstractfactory.BotonRojo
import abstractfactory.ListaRoja
import abstractfactory.BotonAzul
import abstractfactory.ListaAzul

class ListaRoja : Lista() {
    init {
        configurar()
    }

    override fun configurar() {
        println("Configurando la lista ROJA")
    }
}