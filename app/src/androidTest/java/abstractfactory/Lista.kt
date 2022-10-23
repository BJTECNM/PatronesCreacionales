package abstractfactory
import java.util.ArrayList

abstract class Lista {
    private val elementos: ArrayList<Any?> = ArrayList<Any?>()
    fun getElemento(posicion: Int): String? {
        return elementos[posicion]?.toString()
    }

    fun insertarElemento(texto: String?) {
        elementos.add(texto)
    }

    fun dibujar() {
        println("Dibujando la lista")
    }

    abstract fun configurar()
}