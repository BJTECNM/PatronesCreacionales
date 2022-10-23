package factorymethod

abstract class CreadorAbstracto {
    abstract fun crear(tipo: Int): IArchivo?

    companion object {
        const val AUDIO = 1
        const val VIDEO = 2
    }
}