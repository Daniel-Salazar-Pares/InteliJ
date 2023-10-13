import java.util.*
import kotlin.math.sqrt
fun main () {
    val scan = Scanner(System.`in`)
    var commanda:String //definim les variables que ens faran falta
    var primerCostat = 0
    var segonCostat = 0
    var tercerCostat = 0
    var quadratPrimerCostat:Int
    var quadratSegonCostat:Int
    var quadratTercerCostat:Int
    var triangleValid = false

    println("***Les opcions de menu son les següents:***") //opcions del menu
    println("1.-Introduir dimensions del triangle")
    println("2.-Comprobar si el triangle es rectangle")
    println("3.-Classificar tipus de triangle")
    println("4.-Calcular el perimetre i l'area" )
    println("Menu.-S'obre el menu d'opcions")
    println("Exit.-Sortir del programa")
    do {
        commanda = scan.nextLine()
        when (commanda) {
            "Menu" -> { //si s'escriu menu en torna a donar el menu
                println("***Les opcions de menu son les següents:***")
                println("1.-Introduir dimensions del triangle")
                println("2.-Comprobar si el triangle es rectangle")
                println("3.-Classificar tipus de triangle")
                println("4.-Calcular el perimetre i l'area")
                println("Menu.-S'obre el menu d'opcions")
                println("Exit.-Sortir del programa")
            }
            "1" -> { //opcio 1 serveix per inserir les dades d'un triangle i comprobar si pot existir
                print("Introdueixi el primer costat del triangle: ")
                do {
                    if (!scan.hasNextInt()) {
                        print("Introdueixi un valor valid: ")
                        scan.next()
                    }
                } while (!scan.hasNextInt())
                primerCostat = scan.nextInt()
                print("Introdueixi el segon costat del triangle: ")
                do {
                    if (!scan.hasNextInt()) {
                        print("Introdueixi un valor valid: ")
                        scan.next()
                    }
                } while (!scan.hasNextInt())
                segonCostat = scan.nextInt()
                print("Introdueixi el tercer costat del triangle: ")
                do {
                    if (!scan.hasNextInt()) {
                        print("Introdueixi un valor valid: ")
                        scan.next()
                    }
                } while (!scan.hasNextInt())
                tercerCostat = scan.nextInt()
                //formula matematica per comprovar si es valid el triangle o no que tambe guardarem en un bolea per poder despres mirar si les variables tenen asignats valors valid
                if (primerCostat + segonCostat > tercerCostat && segonCostat + tercerCostat > primerCostat && primerCostat + tercerCostat > segonCostat) {
                    println("El triangle de costats $primerCostat $segonCostat $tercerCostat es possible")
                    triangleValid = true
                } else {
                    println("El triangle de costats $primerCostat $segonCostat $tercerCostat NO es un triangle possible")
                }
            }
            "2" -> if (!triangleValid) { //comprova si hi ha un triangle valid
                println("No s'ha introduït cap trinagle, vagi a l'opcio 1")
            } else {

                quadratPrimerCostat = primerCostat * primerCostat
                quadratSegonCostat = segonCostat * segonCostat
                quadratTercerCostat = tercerCostat * tercerCostat

                if (quadratPrimerCostat == quadratSegonCostat + quadratTercerCostat) { //mira si el triangle es rectangle i quina es l'hipotenusa
                    println("El triangle de costats $primerCostat $segonCostat $tercerCostat es rectangle i la seva hipotenusa es el primer costat")
                }
                else if (quadratSegonCostat == quadratTercerCostat + quadratPrimerCostat) {
                    println("El triangle de costats $primerCostat $segonCostat $tercerCostat es rectangle i la seva hipotenusa es el segon costat")
                }
                else if (quadratTercerCostat == quadratPrimerCostat + quadratSegonCostat) {
                    println("El triangle de costats $primerCostat $segonCostat $tercerCostat es rectangle i la seva hipotenusa es el tercer costat")
                }
                else if (primerCostat + segonCostat > tercerCostat && segonCostat + tercerCostat > primerCostat && primerCostat + tercerCostat > segonCostat) {
                    println("El triangle de costats $primerCostat $segonCostat $tercerCostat NO es rectangle")
                }
                else {
                    println("El triangle de costats $primerCostat $segonCostat $tercerCostat NO es un triangle possible")
                }

            }
            "3" -> if (!triangleValid) { //comprova si hi ha un triangle valid
                println("No s'ha introduït cap trinagle, vagi a l'opcio 1")
            } else {
                when { //mira el tipus de triangle que es
                    primerCostat == segonCostat && segonCostat == tercerCostat -> println("El triangle de costats $primerCostat $segonCostat $tercerCostat es un EQUILATER")
                    primerCostat == segonCostat || segonCostat == tercerCostat || primerCostat == tercerCostat -> println("El triangle de costats $primerCostat $segonCostat $tercerCostat es un ISCOSCELES")
                    else -> println("El triangle de costats $primerCostat $segonCostat $tercerCostat es un ESCALE")
                }
            }
            "4" -> if (!triangleValid) { //comprova si hi ha un triangle valid
                println("No s'ha introduït cap trinagle, vagi a l'opcio 1")
            } else { //mira l'area i el perimetre
                val perimetre = primerCostat + segonCostat + tercerCostat
                val s = (primerCostat + segonCostat + tercerCostat) / 2.0
                val area = sqrt(s * (s - primerCostat) * (s - segonCostat) * (s - tercerCostat))
                println("El triangle de costats $primerCostat $segonCostat $tercerCostat te un perimetre de $perimetre i un area de $area")
            }
        }
    } while (commanda != "Exit")
}
