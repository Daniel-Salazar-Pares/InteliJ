import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var dataValida = false
    var data: Int
    var any: Int
    var mes: Int
    var dia: Int

    // Demana a l'usuari que introdueixi una data de naixement vàlida en format ddmmaaaa
    do {
        print("Introdueixi una data de neixament en format ddmmaaaa vàlida: ")

        // Assegura que l'entrada sigui un número enter
        do {
            if (!scan.hasNextInt()) {
                print("Introdueixi un enter en format ddmmaaaa: ")
                scan.next()
            }
        } while (!scan.hasNextInt())

        data = scan.nextInt()

        // Separa la data en dia, mes i any
        any = data % 10000
        mes = ((data % 1000000) - (any)) / 10000
        dia = ((data % 100000000) - (mes)) / 1000000

        // Comprova si l'any està entre 1 i 2023 i el mes entre 1 i 12
        if (any in 1..2023 || mes in 1..12) {
            when (mes) {
                1, 3, 5, 7, 8, 10, 12 -> {
                    // Comprova si el dia està entre 1 i 31 per a mesos amb 31 dies
                    if (dia in 1..31) {
                        dataValida = true
                    }
                }

                4, 6, 9, 11 -> {
                    // Comprova si el dia està entre 1 i 30 per a mesos amb 30 dies
                    if (dia in 1..30) {
                        dataValida = true
                    }
                }

                2 -> {
                    // Comprova els dies per a febrer (28 o 29 en anys de traspàs)
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

    // Calcula el "número de la sort" reduint els dígits a un sol dígit
    while (numeroSort > 9) {
        var sumaDigits = 0
        while (numeroSort > 0) {
            sumaDigits += numeroSort % 10
            numeroSort /= 10
        }
        numeroSort = sumaDigits
    }

    // Imprimeix el "número de la sort"
    println("El teu número de la sort és $numeroSort")
}
