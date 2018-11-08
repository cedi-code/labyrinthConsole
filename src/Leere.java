import java.awt.*;

public class Leere extends Kachel {

    public void render(Graphics c) {
        c.setColor(Color.lightGray);
        c.drawRect(super.getX(),super.getY(),super.getWidth(),super.getHeight());
    };

    public Leere(int x, int y) {
        super(x, y);
    }

    public void setBombe() {

    }
}
