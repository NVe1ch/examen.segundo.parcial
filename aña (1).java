import java.util.Scanner;
public class aña {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i;
        int[] n = new int[10];
        double m = 0;
        System.out.println("Lectura de los elementos del array: ");
        for (i = 0; i < 10; i++) {
            System.out.print("n[" + i + "]= ");
            n[i] = sc.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){ 
                m = m + n[i]; 
            }
        }
        System.out.println("Media de los valores que se encuentran en posiciones pares: "+ m/5);              
    }
}