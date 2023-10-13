import java.util.*
fun main () {
    val scan = Scanner(System.`in`)
    var numero = 0
    var divisors = 0
    var enter = false
    println("Insereixi un número enter major a 1")
    do {
        // Comprovem si l'entrada és un número enter vàlid
        if (!scan.hasNextInt()) {
            println("Ingressi un número enter")
            scan.next()
        } else {
            numero = scan.nextInt()
            // Comprovem si el número és major a 1
            if (numero <= 1) {
                println("El número ha de ser major a 1")
            }
        }
    } while (numero <= 1)

    // Comprovem els divisors del número
    for (valor in 1..numero) {
        if (numero % valor == 0){
            divisors++
        }
    }

    // Determinem si el número és primer o no
    when {
        divisors == 2 -> println("El número és primer")
        divisors > 2 -> {
            // Si no és primer, busquem el següent primer
            var seguentPrimer = numero
            var divisorsSeguentPrimer = 0
            do {
                seguentPrimer++
                divisorsSeguentPrimer = 0
                for (valor in 1..seguentPrimer) {
                    if (seguentPrimer % valor == 0) {
                        ++divisorsSeguentPrimer
                    }
                }
                if (divisorsSeguentPrimer == 2) {
                    enter = true
                }
            } while (!enter)
            println("El número no és un primer, però el següent primer és $seguentPrimer")
        }
    }
}
