package problems.problema2.entitities;

public class Point {
    private int x,y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public String getXString(){
        return String.valueOf(x);
    }

    public String getYString(){
        return String.valueOf(y);
    }

    public String toString(){
        return "("+String.valueOf(x)+","+String.valueOf(y)+")";
    }
}
