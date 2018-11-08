import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Enter matrix [y x]: ");
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int b = sc.nextInt();

        System.out.println("Labyrinth wird erstellt:");

        Labyrinth l = new Labyrinth(i,b);






        System.out.println("Change type in matrix cordinates[y x zerstörbar]: ");
        Scanner scc = new Scanner(System.in);

        int ii = sc.nextInt()-1;
        int bb = sc.nextInt()-1;
        boolean zz = sc.nextBoolean();





        System.out.println("Labyrinth wird überarbeitet:");
        l.changeType(bb,ii,zz);



    }
}
