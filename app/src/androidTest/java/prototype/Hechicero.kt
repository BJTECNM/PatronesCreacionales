package prototype

class Hechicero : Enemigo() {
    init {
        println("Hechicero creado")
    }

    override fun atacar() {
        println("El hechicero ataca")
    }

    override fun detener() {
        println("El hechiero se detiene")
    }

    override fun clonar(): Enemigo {
        val objHechicero = Hechicero()
        objHechicero.nombre = nombre
        objHechicero.arma = arma
        return objHechicero
    }
}