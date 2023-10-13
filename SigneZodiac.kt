import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var mes = 0
    var dia = 0
    println("Introdueixi l'any de naixement:")
    do { //al do while es comprovara si el valor introduit es un enter
        if (!scan.hasNextInt()) {
            println("No s'ha introduït un any vàlid, torni a intentar-ho:")
            scan.next()
        }
    } while (!scan.hasNextInt())
    val any = scan.nextInt()
    println("Introdueixi el mes de naixement en valor numèric:")
    do {//al do while es comprovara si el valor introduit es un enter i es troba entre 1 i 12
        if (!scan.hasNextInt()) {
            println("No s'ha introduït un valor numèric, torni a intentar-ho:")
            scan.next()
        } else {
            mes = scan.nextInt()
            if (mes < 1 || mes > 12) {
                println("El valor del mes no és vàlid, torni a intentar-ho:")
            }
        }
    } while (mes < 1 || mes > 12)
    println("Introdueixi dia de naixement")

    if (!scan.hasNextInt()) {
        println("No s'ha introduït un valor numèric, torni a intentar-ho:")
        scan.next()
    } else {
        when (mes) {
            1, 3, 5, 7, 8, 10, 12 -> {
                do { //al do while es comprovara si el valor introduit es troba entre 1 i 31 ja que els mesos 1, 3, 5, 7, 8, 10, 12 tenen 31 dies
                    dia = scan.nextInt()
                    if (dia < 1 || dia > 31) {
                        println("El valor del mes no és vàlid, torni a intentar-ho:")
                    }
                } while (dia !in 1..31)
            }

            4, 6, 9, 11 -> {
                do {//al do while es comprovara si el valor introduit es troba entre 1 i 30 ja que els mesos 4, 6, 9 i 11 tenen 30 dies
                    dia = scan.nextInt()
                    if (dia < 1 || dia > 30) {
                        println("El valor del mes no és vàlid, torni a intentar-ho:")
                    }
                } while (dia !in 1..30)
            }

            2 -> { //al cas de febrer (mes 2) es comproba si te 28 o 29 dies amb unes operacions donades per l'enunciat

                if ((any % 4 != 0) || ((any % 100 != 0) && (any % 4 == 0))) {
                    do {
                        dia = scan.nextInt()
                        if (dia < 1 || dia > 28) {
                            println("El valor del mes no és vàlid, torni a intentar-ho:")
                        }
                    } while (dia !in 1..28)
                } else {
                    do {
                        dia = scan.nextInt()
                        if (dia < 1 || dia > 29) {
                            println("El valor del mes no és vàlid, torni a intentar-ho:")
                        }
                    } while (dia !in 1..29)
                }
            }
        }
    }

    when (mes) { //depenent del dia i al mes que es troba imprimira el signe zodiacal correspondent
        1 -> if (dia <= 19) println("Capricorn") else println("Aquari")
        2 -> if (dia <= 18) println("Peixos") else println("Piscis")
        3 -> if (dia <= 20) println("Peixos") else println("Aries")
        4 -> if (dia <= 19) println("Aries") else println("Taure")
        5 -> if (dia <= 20) println("Taure") else println("Bessons")
        6 -> if (dia <= 20) println("Bessons") else println("Cancer")
        7 -> if (dia <= 22) println("Cancer") else println("Lleo")
        8 -> if (dia <= 22) println("Lleo") else println("Verge")
        9 -> if (dia <= 22) println("Verge") else println("Balança")
        10 -> if (dia <= 22) println("Balança") else println("Escorpio")
        11 -> if (dia <= 21) println("Escorpio") else println("Sagitari")
        12 -> if (dia <= 21) println("Sagitari") else println("Capricorn")
    }
}
