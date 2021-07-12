package exercise_one

fun main() {
    val aluno = Aluno("202004940089", "098.213.345-34")

    aluno.atribuiNotas(4.5)
    aluno.atribuiNotas(9.5)
    aluno.atribuiNotas(8.7)
    aluno.atribuiNotas(1.5)

    println("O conceito do aluno é: ${aluno.calcularConceito()}")
}