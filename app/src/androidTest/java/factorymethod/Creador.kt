package factorymethod

class Creador : CreadorAbstracto() {
    override fun crear(tipo: Int): IArchivo? {
        val objeto: IArchivo? = when (tipo) {
            AUDIO -> {
                ArchivoAudio()
            }
            VIDEO -> {
                ArchivoVideo()
            }
            else -> {
                null
            }
        }
        return objeto
    }
}