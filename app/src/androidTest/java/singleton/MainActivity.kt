package singleton

import kotlin.jvm.JvmStatic

object MainActivity {
    @JvmStatic
    fun main(args: Array<String>) {
        for (num in 1..5) {
            Coche.instancia
        }
    }
}