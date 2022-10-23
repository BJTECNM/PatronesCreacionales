package prototype

import java.util.*

class GestorEnemigo {
    private val hEnemigos: Hashtable<*, *> = Hashtable<Any?, Any?>()

    init {
        val h1: Enemigo = Hechicero()
        h1.nombre = "Sorcerer1"
        addEnemigo(h1.nombre, h1)
        val g1: Enemigo = Guerrero()
        g1.nombre = "Warrior1"
        g1.arma = "ESPADA"
        addEnemigo(g1.nombre, g1)
    }

    fun addEnemigo(nombre: String?, objEnemigo: Enemigo?) {
        hEnemigos.set(nombre, objEnemigo)
    }

    fun getEnemigo(nombre: String?): Enemigo? {
        return hEnemigos[nombre] as Guerrero?
    }

    fun getClon(nombre: String?): Enemigo {
        val objPrototipo: Enemigo? = hEnemigos[nombre] as Guerrero?
        return objPrototipo!!.clonar()
    }
}

private operator fun <K, V> Hashtable<K, V>.set(nombre: String?, value: Enemigo?) {
    TODO("Not yet implemented")
}
