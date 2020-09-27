package matrix

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class SpiralIteratorTest {

    private lateinit var colMatrixList: List<Cell<String>>
    private lateinit var colMatrixIterator: SpiralIterator<String>
    private lateinit var rowMatrixList: List<Cell<String>>
    private lateinit var rowMatrixIterator: SpiralIterator<String>
    private lateinit var squareIteratorList: List<Cell<String>>
    private lateinit var squareIterator: SpiralIterator<String>
    private lateinit var rectangularIterator2List: List<Cell<String>>
    private lateinit var rectangularIterator2: SpiralIterator<String>
    private lateinit var rectangularIterator1List: List<Cell<String>>
    private lateinit var rectangularIterator1: SpiralIterator<String>
    private lateinit var twoByTwoList: List<Cell<String>>
    private lateinit var twoByTwoIterator: SpiralIterator<String>
    private lateinit var oneByOneList: List<Cell<String>>
    private lateinit var oneByOneIterator: SpiralIterator<String>

    @Test
    internal fun `should return only position in one by one`() {
        `given one by one iterator`()
        `when one by one iterator is iterated`()
        `should return only one position`()
    }

    @Test
    internal fun `should return four positions in two by two`() {
        `given two by two iterator`()
        `when two by two iterator is iterated`()
        `should return four positions in correct order`()
    }

    @Test
    internal fun `should iterate rectangular matrix 1`() {
        `given rectangular iterator 1`()
        `when rectangular iterator 1 is iterated`()
        `should return all positions 1 in correct order`()
    }

    @Test
    internal fun `should iterate rectangular matrix 2`() {
        `given rectangular iterator 2`()
        `when rectangular iterator 2 is iterated`()
        `should return all positions 2 in correct order`()
    }

    @Test
    internal fun `should iterate square matrix`() {
        `given square iterator`()
        `when square iterator is iterated`()
        `should return all positions in correct order`()
    }

    @Test
    internal fun `should iterate row matrix`() {
        `given row matrix`()
        `when row matrix is iterated`()
        `should return all row positions in correct order`()
    }

    @Test
    internal fun `should iterate col matrix`() {
        `given col matrix`()
        `when col matrix is iterated`()
        `should return all col positions in correct order`()
    }

    private fun `should return all col positions in correct order`() {
        assertThat(colMatrixList).containsExactly(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(1, 2), "1,2"),
            Cell(Position(1, 3), "1,3")
        )
    }

    private fun `when col matrix is iterated`() {
        colMatrixList = colMatrixIterator.asSequence().toList()
    }

    private fun `given col matrix`() {
        colMatrixIterator = SpiralIterator(hashSetOf(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(1, 2), "1,2"),
            Cell(Position(1, 3), "1,3")
        ))
    }

    private fun `should return all row positions in correct order`() {
        assertThat(rowMatrixList).containsExactly(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(3, 1), "3,1")
        )
    }

    private fun `when row matrix is iterated`() {
        rowMatrixList = rowMatrixIterator.asSequence().toList()
    }

    private fun `given row matrix`() {
        rowMatrixIterator = SpiralIterator(hashSetOf(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(3, 1), "3,1")
        ))
    }

    private fun `should return all positions in correct order`() {
        assertThat(squareIteratorList).containsExactly(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(3, 1), "3,1"),
            Cell(Position(3, 2), "3,2"),
            Cell(Position(3, 3), "3,3"),
            Cell(Position(2, 3), "2,3"),
            Cell(Position(1, 3), "1,3"),
            Cell(Position(1, 2), "1,2"),
            Cell(Position(2, 2), "2,2")
        )
    }

    private fun `when square iterator is iterated`() {
        squareIteratorList = squareIterator.asSequence().toList()
    }

    private fun `given square iterator`() {
        squareIterator = SpiralIterator(hashSetOf(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(3, 1), "3,1"),
            Cell(Position(3, 2), "3,2"),
            Cell(Position(3, 3), "3,3"),
            Cell(Position(2, 3), "2,3"),
            Cell(Position(1, 3), "1,3"),
            Cell(Position(1, 2), "1,2"),
            Cell(Position(2, 2), "2,2")
        ))
    }

    private fun `should return all positions 2 in correct order`() {
        assertThat(rectangularIterator2List).containsExactly(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(2, 2), "2,2"),
            Cell(Position(2, 3), "2,3"),
            Cell(Position(1, 3), "1,3"),
            Cell(Position(1, 2), "1,2")
        )
    }

    private fun `when rectangular iterator 2 is iterated`() {
        rectangularIterator2List = rectangularIterator2.asSequence().toList()
    }

    private fun `given rectangular iterator 2`() {
        rectangularIterator2 = SpiralIterator(hashSetOf(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(2, 2), "2,2"),
            Cell(Position(2, 3), "2,3"),
            Cell(Position(1, 3), "1,3"),
            Cell(Position(1, 2), "1,2")
        ))
    }

    private fun `should return all positions 1 in correct order`() {
        assertThat(rectangularIterator1List).containsExactly(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(3, 1), "3,1"),
            Cell(Position(3, 2), "3,2"),
            Cell(Position(2, 2), "2,2"),
            Cell(Position(1, 2), "1,2")
        )
    }

    private fun `when rectangular iterator 1 is iterated`() {
        rectangularIterator1List = rectangularIterator1.asSequence().toList()
    }

    private fun `given rectangular iterator 1`() {
        rectangularIterator1 = SpiralIterator(hashSetOf(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(3, 1), "3,1"),
            Cell(Position(3, 2), "3,2"),
            Cell(Position(2, 2), "2,2"),
            Cell(Position(1, 2), "1,2")
        ))
    }

    private fun `should return four positions in correct order`() {
        assertThat(twoByTwoList).containsExactly(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(2, 2), "2,2"),
            Cell(Position(1, 2), "1,2")
        )
    }

    private fun `when two by two iterator is iterated`() {
        twoByTwoList = twoByTwoIterator.asSequence().toList()
    }

    private fun `given two by two iterator`() {
        twoByTwoIterator = SpiralIterator(hashSetOf(
            Cell(Position(1, 1), "1,1"),
            Cell(Position(2, 1), "2,1"),
            Cell(Position(2, 2), "2,2"),
            Cell(Position(1, 2), "1,2")
        ))
    }

    private fun `should return only one position`() {
        val cell = Cell(Position(1, 1), "1,1")
        assertThat(oneByOneList).containsExactly(cell)
    }

    private fun `when one by one iterator is iterated`() {
        oneByOneList = oneByOneIterator.asSequence().toList()
    }

    private fun `given one by one iterator`() {
        oneByOneIterator = SpiralIterator(hashSetOf(Cell(Position(1, 1), "1,1")))
    }
}