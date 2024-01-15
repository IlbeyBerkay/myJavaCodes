public class Point {
    private int x ;
    private  int y ;
    public Point(){}
    public Point(int x , int y){

    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    public double distance(Point point ){
        int dx = this.x - point.getX();
        int dy = this.y - point.getY();
        return Math.sqrt(dx * dx + dy * dy);

    }

    public double distance(int x , int y ){
        int dx = this.x - x;
        int dy = this.y - y;
        return Math.sqrt(dx * dx + dy * dy);
    }
}
