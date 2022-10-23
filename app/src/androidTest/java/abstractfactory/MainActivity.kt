package abstractfactory

import kotlin.jvm.JvmStatic

object MainActivity {
    @JvmStatic
    fun main(args: Array<String>) {
        var cliente = Cliente(ComponentesAzules())
        println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")
        cliente = Cliente(ComponentesRojos())
    }
}