package exercise_one

class Data() {
    private val mesesCom31Dias = arrayOf(1, 3, 5, 7, 8, 10, 12)
    private val mesesCom30Dias = arrayOf(4, 6, 9, 11)
    private val fevereiro = 2

    init { println("Você deve informa primeiro o mês, depois o dia e, por fim, o ano") }

    var dia: Int = 0
        set(value) {
            if (mes != 0) {
                if (mes in mesesCom30Dias) {
                    if (value < 1 || value > 30) {
                        println("Este mês não possui essa quantidade de dias")
                    } else {
                        field = value
                    }
                } else if (mes in mesesCom31Dias ) {
                    if (value < 1 || value > 31) {
                        println("Este mês não possui essa quantidade de dias")
                    } else {
                        field = value
                    }
                } else {
                    if (value < 1 || value > 29) {
                        println("O mês de fevereiro não possui essa quantidade de dias")
                    } else {
                        field = value
                    }
                }
            } else {
                println("O dia só será guardado se o mês for informado primeiro")
            }
        }

    var mes: Int = 0
        set(value) {
            if (value < 1 || value > 12) {
                println("Este mês é inválido")
            } else {
                field = value
            }
        }

    var ano: Int = 0
        set(value) {
            if (value != 2021) {
                println("Este ano é inválido")
            } else {
                field = value
            }
        }

    override fun toString(): String {
        return "$dia/$mes/$ano"
    }
}