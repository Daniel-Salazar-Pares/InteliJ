import java.util.*

fun main() {
    val scan = Scanner(System.`in`)
    var sumaDivisorsPrimerNumero = 0
    var sumaDivisorsSegonNumero = 0
    print("Introdueixi un numero enter: ")

    do {
        if (!scan.hasNextInt()) { // Comprova si l'entrada no és un número enter
            print("Introdueixi un enter: ")
            scan.next() // Ignora l'entrada incorrecta
        }
    } while (!scan.hasNextInt()) // Continua el bucle fins que es proporcioni un número enter correcte

    val primerNumero: Int = scan.nextInt() // Llegeix el primer número enter proporcionat per l'usuari

    // Calcula la suma dels divisors propis del primer número
    for (numero in 1 until primerNumero) {
        if (primerNumero % numero == 0) {
            sumaDivisorsPrimerNumero += numero
        }
    }

    print("Introdueixi un altre enter: ")

    do {
        if (!scan.hasNextInt()) { // Comprova si l'entrada no és un número enter
            print("Introdueixi un enter: ")
            scan.next() // Ignora l'entrada incorrecta
        }
    } while (!scan.hasNextInt())

    val segonNumero: Int = scan.nextInt() // Llegeix el segon número enter proporcionat per l'usuari

    // Calcula la suma dels divisors propis del segon número
    for (numero in 1 until segonNumero) {
        if (segonNumero % numero == 0) {
            sumaDivisorsSegonNumero += numero // Suma el divisor a la suma total.
        }
    }

    // Comprova si les sumes de divisors dels dos números són iguals i mostra el resultat
    when {
        sumaDivisorsPrimerNumero == sumaDivisorsSegonNumero -> println("Els numeros $primerNumero i $segonNumero son numeros amics")
        else -> println("Els numeros $primerNumero i $segonNumero NO son numeros amics")
    }
}
