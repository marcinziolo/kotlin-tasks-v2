package kotlinexamples

import java.util.*
import java.util.function.Consumer

fun <T> Optional<T>.ifPresentOrElse(consumer: Consumer<T>, runnable: Runnable) {
    //TODO Implement method
}

fun main() {
    val optional: Optional<String> = Optional.of("some value")
    optional.ifPresentOrElse(Consumer { println(it) }, Runnable{ println("Absent") })
}