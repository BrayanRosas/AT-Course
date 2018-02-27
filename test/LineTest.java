import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LineTest {

    @Test
    public void lineNeedsTwoPointsToBeCreated() {
        Line line = new Line(new Point(), new Point(3, 4));

        assertTrue(line instanceof Line);
    }

    @Test
    public void lengthIsDeterminedByTheDistanceBetweenPoints() {
        Line line = new Line(new Point(), new Point(3, 4));

        double length = line.length();
        assertEquals(5, length, 0);
    }

    @Test
    public void lengthIsTheDistanceBetweenPoints() {
        Line line = new Line(new Point(1, 1), new Point(1, 4));

        assertEquals(3, line.length(), 0);
    }

    // contains
    @Test
    public void lineContainsItsStartPoint() {
        Point start = new Point(0, 0);
        Line line = new Line(start, new Point(2, 5));

        assertTrue(line.contains(start));
    }

    @Test
    public void lineContainsItsEndPoint() {
        Point start = new Point(0, 0);
        Point end = new Point(2, 5);
        Line line = new Line(start, end);

        assertTrue(line.contains(end));
    }

    @Test
    public void doesNotContainAPointThatDoesntMeetTheFormula() {
        Point start = new Point(0, 0);
        Point end = new Point(2, 5);
        Line line = new Line(start, end);

        assertFalse(line.contains(new Point(1, 2)));
    }


    @Test
    public void containsInnerPointThatConformsToTheFormula() {
        Point start = new Point(0, 0);
        Point end = new Point(8, 6);
        Line line = new Line(start, end);

        assertTrue(line.contains(new Point(4, 3)));
    }

}
