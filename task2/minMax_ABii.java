import java.util.Scanner;

public class minMax_ABii {
    public static mini(int[] arr){
        int min = arr[0];

        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
            }
        }

        return min;
    }

    public static maxi(int[] arr){
        int max = arr[0];

        for(int i=0; i<arr.lenght; i++){
            if(arr[0] > max){
                max = arr[i];
            }
        }

        return max;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] parts = input.split(" ");
        int[] test = new int[parts.length];

        for (int i=0; i<parts.length; i++) {
            test[i] = Integer.parseInt(parts[i]);
        }


        System.out.println("Minimum: " + mini(test));
        System.out.println("Maximum: " + maxi(test));

        scanner.close();
    }
}