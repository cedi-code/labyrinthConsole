import java.awt.*;

public class Block extends Kachel {

    public Block(int x, int y, boolean z) {
        super(x,y);
        this.zerstörbar = z;
    }
    @Override
    public void render(Graphics c) {


        if(zerstörbar)
        {
            c.setColor(Color.gray);

        }
        else
        {
            c.setColor(Color.black);
        }

        c.fillRect(super.getX(),super.getY(),super.getWidth(),super.getHeight());
    };


    public void zerstören() {
        if(zerstörbar) {

        }
    }

    public Boolean getZerstörbar() {
        return zerstörbar;
    }

    public void setZerstörbar(Boolean zerstörbar) {
        this.zerstörbar = zerstörbar;
    }

    private Boolean zerstörbar;
}
