package factorymethod

import kotlin.jvm.JvmStatic

object MainActivity {
    @JvmStatic
    fun main(args: Array<String>) {
        val creator: CreadorAbstracto = Creador()
        val audio = creator.crear(CreadorAbstracto.AUDIO)
        audio!!.reproducir()
        val video = creator.crear(CreadorAbstracto.VIDEO)
        video!!.reproducir()
    }
}