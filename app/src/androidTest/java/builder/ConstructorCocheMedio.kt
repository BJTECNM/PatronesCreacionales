package builder

class ConstructorCocheMedio : BuilderCoche() {
    override fun construirMotor() {
        coche!!.motor = "Motor de potencia media"
    }

    override fun construirCarroceria() {
        coche!!.carroceria = "Carrocería de protección media"
    }

    override fun construirAireAcond() {
        coche!!.aireAcond = false
    }

    override fun construirElevalunas() {
        coche!!.elevalunasElec = true
    }
}