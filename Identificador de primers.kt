import java.util.*
fun main () {
    val scan = Scanner(System.`in`)
    var numero = 0
    var divisors = 0
    var enter = false
    println("Insereixi un numero enter major a 1")
    do {
        if (!scan.hasNextInt()) {
            println("Ingresi un enter")
            scan.next()
        } else {
            numero = scan.nextInt()
            if (numero <= 1) {
                println("El numero ha de ser major a 1")
            }
        }
    } while (numero <= 1)
    for (valor in 1..numero) {
        if (numero%valor == 0){
            divisors++
        }
    }
    when {
        divisors == 2 -> println("El numero es primer")
        divisors > 2 -> {
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
            println("El numero no es un primer, pero el seguent primer es $seguentPrimer")
        }
    }
}