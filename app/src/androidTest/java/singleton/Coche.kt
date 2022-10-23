package singleton

object Coche {
    var instancia: Coche? = null
        get() {
            if (field == null) {
                field = Coche
                println("El objeto ha sido creado")
            } else {
                println("Ya existe el objeto")
            }
            return field
        }
        private set
}