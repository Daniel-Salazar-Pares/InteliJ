import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var dataValida = false
    var data:Int
    var any:Int
    var mes:Int
    var dia:Int
    do {
        print("Introdueixi una data de neixament en format ddmmaaaa valida: ")
        do {
            if (!scan.hasNextInt()) {
                print("Introdueixi un enter en format ddmmaaaa: ")
                scan.next()
            }
        } while (!scan.hasNextInt())
        data = scan.nextInt()
        any = data % 10000
        mes = ((data % 1000000) - (any)) / 10000
        dia = ((data % 100000000) - (mes)) / 1000000

        if (any in 1..2023 || mes in 1..12) {
            when (mes) {
                1, 3, 5, 7, 8, 10, 12 -> {
                    if (dia in 1..31) {
                        dataValida = true
                    }
                }

                4, 6, 9, 11 -> {
                    if (dia in 1..30) {
                        dataValida = true
                    }
                }

                2 -> {
                    if ((any % 4 != 0) || ((any % 100 != 0) && (any % 4 == 0))) {
                        if (dia in 1..28) {
                            dataValida = true
                        }
                    } else {
                        if (dia in 1..29) {
                            dataValida = true
                        }
                    }
                }
            }
        }
    } while (!dataValida)

    var numeroSort = data
    while (numeroSort > 9) {
        var sumaDigits = 0
        while (numeroSort > 0) {
            sumaDigits += numeroSort % 10
            numeroSort /= 10
        }
        numeroSort = sumaDigits
    }
    println("El teu numero de la sort es $numeroSort")
}