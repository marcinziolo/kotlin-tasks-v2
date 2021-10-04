import java.util.*
import java.util.function.Consumer

fun <T> Optional<T>.ifPresentOrElse(consumer: Consumer<T>, runnable: Runnable) {
    //TODO Implement method
}

fun main() {
    val optional: Optional<String> = Optional.of("value")
    optional.ifPresentOrElse({ println(it) }, { println("absent") })

    val optionalEmpty = Optional.empty<String>()
    optionalEmpty.ifPresentOrElse({ println(it) }, { println("absent") })
}