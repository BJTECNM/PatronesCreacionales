package builder

import kotlin.jvm.JvmStatic

object MainActivity {
    @JvmStatic
    fun main(args: Array<String>) {
        val objFabrica = Director()
        val base: BuilderCoche = ConstructorCocheBase()
        val medio: BuilderCoche = ConstructorCocheMedio()
        val full: BuilderCoche = ConstructorCocheFull()
        objFabrica.construir(base)
        val cocheBase = base.coche
        objFabrica.construir(medio)
        val cocheMedio = medio.coche
        objFabrica.construir(full)
        val cocheFull = full.coche
        mostrarCaracteristicas(cocheBase)
        mostrarCaracteristicas(cocheMedio)
        mostrarCaracteristicas(cocheFull)
    }

    fun mostrarCaracteristicas(coche: Coche?) {
        println("Motor: " + coche!!.motor)
        println("Carrocería: " + coche.carroceria)
        println("Elevalunas eléctrico: " + coche.elevalunasElec)
        println("Aire acondicionado: " + coche.aireAcond)
        println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*")
    }
}