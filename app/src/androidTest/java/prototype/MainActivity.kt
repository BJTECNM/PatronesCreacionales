package prototype

import kotlin.jvm.JvmStatic

object MainActivity {
    @JvmStatic
    fun main(args: Array<String>) {
        val objGP = GestorEnemigo()
        val g1 = objGP.getEnemigo("Warrior1")
        println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")
        println("El Guerrero original se llama [" + g1!!.nombre + "]")
        println("Su arma es [" + g1.arma + "]")
        println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")
        val g2 = objGP.getClon("Warrior1")
        println("Clon del Guerrero creado:")
        println("Su nombre es [" + g2!!.nombre + "]")
        println("Su arma es [" + g2.arma + "]")
        println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")
        g2.nombre = "Warrior2"
        g2.arma = "HACHA"
        println("Tras modificar el clon, ahora se llama [" + g2.nombre + "]")
        println("""
    Su arma es [${g2.arma}]
    
    """.trimIndent())
        println("El nombre del Guerrero original es [" + g1.nombre + "]")
        println("Su arma es [" + g1.arma + "]")
        println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")
        g1.nombre = "Warrior-1"
        g1.arma = "MAZA"
        println("Tras modificar el original, ahora es [" + g1.nombre + "]")
        println("""
    Su arma es [${g1.arma}]
    
    """.trimIndent())
        println("El nombre del clon es [" + g2.nombre + "]")
        println("Su arma es [" + g2.arma + "]")
    }
}