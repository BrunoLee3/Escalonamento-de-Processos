package escalonadores_A;

import java.util.Scanner;

public class sjf {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        int[] arr = new int[5];
        int aux = 0;

        System.out.println("digite 5 valores de tempo de processo:");
        for (int i = 0; i < 5; i++) {
            if (scan.hasNextInt()) {
                arr[i] = scan.nextInt();
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] > arr[j]){
                    aux = arr[i];
                    arr[i] = arr[j];
                    arr[j] = aux; 
                }
            }
        }

        System.out.println("saída: ");
            
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        scan.close();
    }
}
