package prototype

abstract class Enemigo {
    var nombre = ""
    var arma = "DAGA"
    abstract fun clonar(): Enemigo
    abstract fun atacar()
    abstract fun detener()
}