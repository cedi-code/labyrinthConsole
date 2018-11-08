import java.awt.*;

public class Kachel {


    public void render(Graphics c) {
        c.setColor(Color.lightGray);
        c.drawRect(x,y,width,height);
    };

    public Kachel(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }
    public int getX() { return x; }

    private int x, y;
    private int width = 50;
    private int height = 50;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }



}
