package matrix

fun main() {
    val matrix = Matrix(setOf(
        Cell(Position(1, 1), "hello"),
        Cell(Position(2, 1), "world"),
        Cell(Position(3, 1), "of"),
        Cell(Position(1, 2), "spiral"),
        Cell(Position(2, 2), "iterator"),
        Cell(Position(3, 2), "in kotlin")
    ))

    val visitor = StdOutputCellVisitor<String>()

    for (cell in matrix) {
        cell.accept(visitor)
    }
}