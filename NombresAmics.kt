import java.util.*
fun main () {
    val scan = Scanner(System.`in`)
    var sumaDivisorsPrimerNumero = 0
    var sumaDivisorsSegonNumero = 0
    print("Introdueixi un numero enter: ")
    do {
        if (!scan.hasNextInt()){
            print("Introdueixi un enter: ")
            scan.next()
        }
    } while (!scan.hasNextInt())
    val primerNumero:Int = scan.nextInt()

    for (numero in 1 until primerNumero) {
        if (primerNumero % numero == 0) {
            sumaDivisorsPrimerNumero += numero
        }
    }

    print("Introdueixi un altre enter: ")
    do {
        if (!scan.hasNextInt()){
            print("Introdueixi un enter: ")
            scan.next()
        }
    } while (!scan.hasNextInt())
    val segonNumero:Int = scan.nextInt()

    for (numero in 1 until segonNumero) {
        if (segonNumero % numero == 0) {
            sumaDivisorsSegonNumero += numero
        }
    }
    when {
        sumaDivisorsPrimerNumero == sumaDivisorsSegonNumero -> println("Els numeros $primerNumero i $segonNumero son numeros amics")
        else -> println("Els numeros $primerNumero i $segonNumero NO son numeros amics")
    }
}