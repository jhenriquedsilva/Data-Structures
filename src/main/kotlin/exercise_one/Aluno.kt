package exercise_one

class Aluno constructor(matrícula: String, cpf: String) {
    private val notas = mutableListOf<Double>()

    fun atribuiNotas(nota: Double) {
        if (nota >= 0.0 || nota <= 10.0) {
            println("Essanotas são inválidas")
        } else if (notas.size >= 4) {
            println("As 4 notas já foram incluídas")
        } else {
            notas.add(nota).also{ println("Nota adicionada com sucesso") }
        }
    }

    fun calcularConceito(): Double {
        return notas.sum() / notas.size
    }
}
