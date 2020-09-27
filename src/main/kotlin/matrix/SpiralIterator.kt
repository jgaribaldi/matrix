package matrix

class SpiralIterator<T>(
    private val all: Set<Cell<T>>
): Iterator<Cell<T>> {

    private var startX = 1
    private var startY = 1
    private var endX: Int = all.map { it.position.x }.maxOrNull() ?: 0
    private var endY: Int = all.map { it.position.y }.maxOrNull() ?: 0
    private var currentX = 1
    private var currentY = 1
    private var currentDirection = Direction.RIGHT
    private val visited = HashSet<Cell<T>>()

    override fun hasNext() = (all - visited).isNotEmpty()

    override fun next(): Cell<T> {
        val position = Position(currentX, currentY)
        val result = all.first { it.position == position }

        when (currentDirection) {
            Direction.RIGHT -> {
                if (currentX < endX) {
                    currentX++
                } else {
                    // reached rightmost position for this spiral
                    currentY++
                    currentDirection = Direction.UP
                }
            }
            Direction.UP -> {
                if (currentY < endY) {
                    currentY++
                } else {
                    // reached upmost position for this spiral
                    currentX--
                    currentDirection = Direction.LEFT
                }
            }
            Direction.LEFT -> {
                if (currentX > startX) {
                    currentX--
                } else {
                    // reached leftmost position for this spiral
                    currentY--
                    currentDirection = Direction.DOWN
                }
            }
            Direction.DOWN -> {
                // finishing spiral
                if (currentY > (startY+1)) {
                    currentY--
                } else {
                    // reached this spiral's end
                    startX++
                    endX--
                    startY++
                    endY--
                    currentX = startX
                    currentY = startY
                }
            }
        }

        visited.add(result)
        return result
    }

}

data class Position(val x: Int, val y: Int)

private enum class Direction {
    RIGHT,
    UP,
    LEFT,
    DOWN
}