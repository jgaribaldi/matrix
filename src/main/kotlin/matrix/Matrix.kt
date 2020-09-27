package matrix

data class Matrix<T>(private val cells: Set<Cell<T>>): Iterable<Cell<T>> {

    init {
        val maxX = cells.map { it.position.x }.maxOrNull() ?: 0
        val maxY = cells.map { it.position.y }.maxOrNull() ?: 0

        // cell set should contain all the positions
        if (cells.isEmpty() || cells.size != maxX * maxY) {
            throw RuntimeException("Missing matrix positions in cell set")
        }
    }

    override fun iterator(): Iterator<Cell<T>> = SpiralIterator(cells)
}

data class Cell<T>(val position: Position, val value: T): Visitable<T> {
    override fun accept(visitor: CellVisitor<T>) = visitor.visit(this)
}
