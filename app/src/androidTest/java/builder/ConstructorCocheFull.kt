package builder

class ConstructorCocheFull : BuilderCoche() {
    override fun construirMotor() {
        coche!!.motor = "Motor de potencia alta"
    }

    override fun construirCarroceria() {
        coche!!.carroceria = "Carrocería de alta protección"
    }

    override fun construirAireAcond() {
        coche!!.aireAcond = true
    }

    override fun construirElevalunas() {
        coche!!.elevalunasElec = true
    }
}