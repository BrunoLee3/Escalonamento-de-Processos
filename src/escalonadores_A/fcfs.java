package escalonadores_A;

import java.util.Scanner;

public class fcfs {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];

        System.out.println("digite 5 valores de tempo de processo:");
        for (int i = 0; i < 5; i++) {
            
            if (scan.hasNextInt()) {
                arr[i] = scan.nextInt();
            }
        }

        System.out.println("saída: ");
            
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();

    }
}