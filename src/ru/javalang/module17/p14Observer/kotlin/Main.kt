package ru.dvfu.mrcpk.patterns.p14Observer.kotlin

import java.io.File

fun main(){
    val meteoStation = MeteoStation()

    val consoleObserver1 = ConsoleObserver("console observer", meteoStation = meteoStation)
    val fileWriterObserver = FileWriterObserver("File observer1", meteoStation = meteoStation)
    meteoStation.addObserver(consoleObserver1)
    meteoStation.addObserver(fileWriterObserver)

    println("MeteoStation sent:")
    meteoStation.setParams(10F,20F)
}

interface ObserverIf {
    fun handleEvents(temp: Float, humidity: Float) : ObserverIf
}

interface ObservableIf<T> {
    fun addObserver(observer: ObserverIf)
    fun removeObserver(observer: ObserverIf)
    fun notifyObservers()
    fun setParams(temp: Float, humidity: Float) : T
}

data class MeteoStation(
    private val observers: ArrayList<ObserverIf> = arrayListOf(),
    private val temp: Float = 0F,
    private val humidity: Float = 0F
) : ObservableIf<MeteoStation> {

    override fun addObserver(observer: ObserverIf) { observers.add(observer) }

    override fun removeObserver(observer: ObserverIf) { observers.remove(observer) }

    override fun notifyObservers() {
        observers.forEach { it.handleEvents(temp,humidity) }
    }

    override fun setParams(temp: Float, humidity: Float) : MeteoStation {
        val updateCondition = copy(temp = temp, humidity = humidity)
        return updateCondition.also { it.notifyObservers() }
    }
}

data class ConsoleObserver(
    private val name: String,
    private val temp: Float = 0F,
    private val humidity: Float = 0F,
    private val meteoStation: ObservableIf<MeteoStation>
) : ObserverIf {

    override fun handleEvents(temp: Float, humidity: Float) : ConsoleObserver {
        val updateCondition = copy(temp=temp, humidity=humidity)
        println("Current conditions on $name. Temperature: $temp°C, humidity: ${humidity.toInt()}%")
        return updateCondition
    }
}

data class FileWriterObserver(
    private val name: String,
    private val temp: Float = 0F,
    private val humidity: Float = 0F,
    private val meteoStation: ObservableIf<MeteoStation>
) : ObserverIf {

    override fun handleEvents(temp: Float, humidity: Float): ObserverIf {
        writeFile(temp,humidity)
        return copy(temp=temp,humidity=humidity)
    }

    fun writeFile(temp: Float, humidity: Float) {
        File.createTempFile("TempPressure", "_txt")
            .printWriter().use { out -> out.write("Current conditions on $name. Temperature: $temp°C, humidity: ${humidity.toInt()}%")}

    }
}