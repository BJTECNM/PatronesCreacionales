package prototype

class Guerrero : Enemigo() {
    init {
        println("Guerrero creado")
    }

    override fun atacar() {
        println("El guerrero ataca")
    }

    override fun detener() {
        println("El guerrero se detiene")
    }

    override fun clonar(): Enemigo {
        val objGuerrero = Guerrero()
        objGuerrero.nombre = nombre
        objGuerrero.arma = arma
        return objGuerrero
    }
}