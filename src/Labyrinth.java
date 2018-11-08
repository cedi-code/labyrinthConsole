import java.util.ArrayList;
import java.util.List;


public class Labyrinth {

    private int hoehe;
    private int breite;

    public List<Kachel> getLabyrinthfeld() {
        return labyrinthfeld;
    }

    private List<Kachel> labyrinthfeld;

    private int w = 50;
    private View view;
    public Labyrinth(int h, int b) {
        this.hoehe = h;
        this.breite = b;
         labyrinthfeld = fillLabyrint(h,b);
        view = new View(this,b,h);


    }



    // x und y sind hier vertauscht!
    public List<Kachel> fillLabyrint(int h, int b) {
        List<Kachel> kachels = new ArrayList<Kachel>();
        for(int x = 0; x < h; x++) {
            for(int y = 0; y < b; y++) {
                kachels.add(new Kachel(y*w,x*w));
            }
        }
        return kachels;
    }


    public void changeType(int x,int y, boolean zerstörbar) {
        int pos = x+(y*breite);
        labyrinthfeld.set(pos, new Block(x*w,y*w,zerstörbar));
        view.repaint();

    }

}
