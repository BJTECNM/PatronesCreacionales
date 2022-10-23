package builder

abstract class BuilderCoche {
    var coche: Coche? = null
        protected set

    fun crearNuevoCoche() {
        coche = Coche()
    }

    abstract fun construirMotor()
    abstract fun construirCarroceria()
    abstract fun construirAireAcond()
    abstract fun construirElevalunas()
}