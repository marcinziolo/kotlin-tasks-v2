import java.io.File

interface Printer {
    fun print(text: String)
}

interface Scanner {
    fun scan(): File
}

class PrinterImpl: Printer {
    override fun print(text: String) {
        println("Println implementation")
    }
}

class ScannerImpl: Scanner {
    override fun scan(): File {
        println("Scanner implementation")
        return File("file.txt")
    }
}


class MultifunctionalMachine: Printer, Scanner {
    override fun scan(): File {
        TODO("implement without duplication code")
    }

    override fun print(text: String) {
        TODO("implement without duplication code")
    }
}