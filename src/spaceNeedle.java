import com.sun.glass.ui.Size;

public class spaceNeedle {
    final static int SIZE = 3; //When SIZE is changed, the height/width of the needle will also change

    public static void main(String[] args){
    needle();
    topDome(true);
    spacer();
    bottomDome();
    needle();
    body();
    topDome(false);
    spacer();
    }
    // Pre: none
    // Post: Prints out the needle portion
    public static void needle() {
        for (int i = 1; i <= SIZE; i++) {
            for (int space = 1; space <= SIZE*3; space++) {
                System.out.print(" ");
            }
            System.out.println("||");
        }
    }
    public static void topDome(boolean hastip) {
        int extra;
        int iterations;
        if (hastip){
            extra = 1;
            iterations = SIZE;
        } else {
            extra = 0;
            iterations = SIZE-1;
        }
        for (int i = 1; i <= iterations; i++) {
            for (int space = 1; space <= (iterations-i)*3; space++) {
                System.out.print(" ");
            }
            System.out.print("__/");
            for (int j = 1; j <= (i-extra)*3; j++) {
                System.out.print(":");
            }
            System.out.print("||");
            for (int l = 1; l <= (i-extra)*3; l++) {
                System.out.print(":");
            }
            System.out.println("\\__");
        }
    }
    public static void bottomDome() {

    }
    public static void body() {
        for (int i = 1; i <= SIZE*SIZE; i++) {
            for (int space = 1; space <= SIZE*2; space++) {
                System.out.print(" ");
            }
            System.out.println("|%%||%%|");
        }
    }
    public static void spacer() {
        System.out.print("|");
        for (int i = 1; i <= SIZE * 6; i++) {
            System.out.print("\"");
        }
        System.out.println("|");
    }
}
