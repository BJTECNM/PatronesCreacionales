package builder

class Director {
    fun construir(builder: BuilderCoche) {
        builder.crearNuevoCoche()
        builder.construirMotor()
        builder.construirCarroceria()
        builder.construirElevalunas()
        builder.construirAireAcond()
    }
}