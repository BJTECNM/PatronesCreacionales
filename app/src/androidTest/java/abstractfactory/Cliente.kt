package abstractfactory

class Cliente(style: Componentes) {
    init {
        val boton = style.boton
        boton.dibujar()
        val lista = style.lista
        lista.dibujar()
    }
}