package factorymethod

class ArchivoVideo : IArchivo {
    override fun reproducir() {
        println("Reproduciendo archivo de vídeo")
    }
}