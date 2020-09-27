package matrix

interface CellVisitor<T> {
    fun visit(cell: Cell<T>)
}

interface Visitable<T> {
    fun accept(visitor: CellVisitor<T>)
}

class StdOutputCellVisitor<T>: CellVisitor<T> {

    override fun visit(cell: Cell<T>) {
        println("Visiting cell in position ${cell.position} with content [${cell.value}]")
    }

}