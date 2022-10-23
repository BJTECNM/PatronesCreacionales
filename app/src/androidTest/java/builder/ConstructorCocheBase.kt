package builder

class ConstructorCocheBase : BuilderCoche() {
    override fun construirMotor() {
        coche!!.motor = "Motor de potencia mínima"
    }

    override fun construirCarroceria() {
        coche!!.carroceria = "Carrocería de baja protección"
    }

    override fun construirAireAcond() {
        coche!!.aireAcond = false
    }

    override fun construirElevalunas() {
        coche!!.elevalunasElec = false
    }
}