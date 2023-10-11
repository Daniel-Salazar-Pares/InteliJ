import java.util.*
fun main () {
    val scan = Scanner(System.`in`)
    var commanda:String = ""
    var primerCostat:Int
    var segonCostat:Int
    var tercerCostat:Int
    var quadratPrimerCostat:Int
    var quadratSegonCostat:Int
    var quadratTercerCostat:Int

    println("***Les opcions de menu son les següents:***")
    println("1.-Comprovacio si pot ser un triangle")
    println("2.-Comprobar si el triangle es rectangle")
    println("3.-Classificar tipus de triangle")
    println( )
    println("Menu.-S'obre el menu d'opcions")
    println("Exit.-Sortir del programa")
    do {
        commanda = scan.nextLine()
        when (commanda) {
            "Menu" -> {
                println("***Les opcions de menu son les següents:***")
                println("1.-Comprovacio si pot ser un triangle")
                println("2.-Comprobar si el triangle es rectangle")
                println("3.-Classificar tipus de triangle")
                println("4.-Perimetre i area")
                println("Menu.-S'obre el menu d'opcions")
                println("Exit.-Sortir del programa")
            }
            "1" -> {
                print("Introdueixi el primer costat del triangle:")
                do {
                    if (!scan.hasNextInt()) {
                        print("Introdueixi un valor valid:")
                        scan.next()
                    }
                } while (!scan.hasNextInt())
                primerCostat = scan.nextInt()
                print("Introdueixi el segon costat del triangle:")
                do {
                    if (!scan.hasNextInt()) {
                        print("Introdueixi un valor valid:")
                        scan.next()
                    }
                } while (!scan.hasNextInt())
                segonCostat = scan.nextInt()
                print("Introdueixi el tercer costat del triangle:")
                do {
                    if (!scan.hasNextInt()) {
                        print("Introdueixi un valor valid:")
                        scan.next()
                    }
                } while (!scan.hasNextInt())
                tercerCostat = scan.nextInt()
                if (primerCostat + segonCostat > tercerCostat && segonCostat + tercerCostat > primerCostat && primerCostat + tercerCostat > segonCostat) {
                    print("El triangle de costats $primerCostat $segonCostat $tercerCostat es possible")
                } else {
                    print("El triangle de costats $primerCostat $segonCostat $tercerCostat NO es un triangle possible")
                }
            }
            "2" -> {
                print("Introdueixi el primer costat del triangle:")
                do {
                    if (!scan.hasNextInt()) {
                        print("Introdueixi un valor valid:")
                        scan.next()
                    }
                } while (!scan.hasNextInt())
                primerCostat = scan.nextInt()
                print("Introdueixi el segon costat del triangle:")
                do {
                    if (!scan.hasNextInt()) {
                        print("Introdueixi un valor valid:")
                        scan.next()
                    }
                } while (!scan.hasNextInt())
                segonCostat = scan.nextInt()
                print("Introdueixi el tercer costat del triangle:")
                do {
                    if (!scan.hasNextInt()) {
                        print("Introdueixi un valor valid:")
                        scan.next()
                    }
                } while (!scan.hasNextInt())
                tercerCostat = scan.nextInt()

                quadratPrimerCostat = primerCostat * primerCostat
                quadratSegonCostat = segonCostat * segonCostat
                quadratTercerCostat = tercerCostat * tercerCostat

                if (quadratPrimerCostat == quadratSegonCostat + quadratTercerCostat) {
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
            "3" -> {

            }

        }


    } while (commanda != "Exit")
}