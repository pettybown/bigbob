import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which function?");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                int n1 = scanner.nextInt();
                int[] numbers1 = new int[n1];
                for (int i = 0; i < n1; i++) {
                    numbers1[i] = scanner.nextInt();
                }
                System.out.println(find_minimum(numbers1));
                break;
            case 2:
                int n2 = scanner.nextInt();
                int[] numbers2 = new int[n2];
                for (int i = 0; i < n2; i++ ){
                    numbers2[i] = scanner.nextInt();
                }
                System.out.println(find_average(numbers2));
                break;

    }
    }
    public static int find_minimum(int[] numbers){
        int min = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < min) {
                min = numbers[j];
            }
        }
        return min;
    }
    public static double find_average(int[] numbers){
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return (double) sum / numbers.length;
    }


}
