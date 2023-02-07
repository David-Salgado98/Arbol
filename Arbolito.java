import java.util.Scanner;

public class Arbolito {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del arbol ");
        int h = sc.nextInt();
//parte alta
        for (int i = 1; i <= h; i++) {
            for (int j = h - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
//parte de abajo
        for (int i = 1; i <= (int)Math.round(h/4d); i++) {
            System.out.print(" ");
            for (int j = (int)Math.floor(h/2d-.3); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = h/2; k > 0; k--) {
                System.out.print("* ");
            }

            System.out.println();
        }
        ///////////////////fin abajo/////////////////////
        //inicio base
        for(int i=1;i<=h/6;i++){
            for (int j = (int) Math.round(h/4d-.3); j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = h - ((int) Math.floor(h/4d)); k > 0; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
