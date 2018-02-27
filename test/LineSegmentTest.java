import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LineSegmentTest {

    @Test
    public void lineSegmentIsALine() {
        LineSegment segment = new LineSegment(new Point(), new Point(1, 2));

        assertTrue(segment instanceof Line);
    }

    @Test
    public void containsInnerPointThatConformsToTheFormula() {
        Point start = new Point(0, 0);
        Point end = new Point(8, 6);
        LineSegment line = new LineSegment(start, end);

        assertTrue(line.contains(new Point(4, 3)));
    }

    @Test
    public void doesNotContainPointThatConformsToTheFormulaButItsOutOfRange() {
        Point start = new Point(0, 0);
        Point end = new Point(8, 6);
        LineSegment line = new LineSegment(start, end);

        assertFalse(line.contains(new Point(-4, -3)));
    }
}

