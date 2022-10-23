package factorymethod

class ArchivoAudio : IArchivo {
    override fun reproducir() {
        println("Reproduciendo archivo de audio")
    }
}