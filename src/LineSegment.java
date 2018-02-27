public class LineSegment extends Line {

    public LineSegment(Point start, Point end) {
        super(start, end);
        start.equals(end);
    }

    @Override
    public boolean contains(Point point) {
        boolean pointMeetsFormula = super.contains(point);
        boolean pointIsInRange = isPointIsInRange(point);
        return pointIsInRange && pointMeetsFormula;
    }

    private boolean isPointIsInRange(Point point) {
        boolean xIsInRange = start.getX() <= point.getX() && point.getX() <= end.getX();
        boolean yIsInRange = start.getY() <= point.getY() && point.getY() <= end.getY();

        return xIsInRange && yIsInRange;
    }
}