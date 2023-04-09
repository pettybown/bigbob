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
            case 3:
                int n3 = scanner.nextInt();
                System.out.println(check_prime_or_composite(n3));
                break;
            case 4:
                int n4 = scanner.nextInt();
                System.out.println(find_factorial(n4));
                break;
            case 5:
                int n5 = scanner.nextInt();
                System.out.println(find_fibonacci_number(n5));
                break;
            case 6:
                int n6 = scanner.nextInt();
                int k6 = scanner.nextInt();
                System.out.println(find_pow(n6, k6));
                break;
            case 7:
                int n7 = scanner.nextInt();
                int[] numbers7 = new int[n7];
                for (int i = 0; i < n7; i++ ){
                    numbers7[i] = scanner.nextInt();
                }
                make_reverse_array(0, numbers7);
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
    public static String check_prime_or_composite(int n){
        int count = 0;
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count += 1;
            }
        }
        if (count == 2){
            return "Prime";
        }
        else {
            return "Composite";
        }

    }
    public static int find_factorial(int n){
        if (n == 1){
            return 1;
        }
        return find_factorial(n - 1) * n;
    }
    public static int find_fibonacci_number(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        return find_fibonacci_number(n - 1) + find_fibonacci_number(n -2);
    }
    public static int find_pow(int a, int n){
        if (n == 1){
            return a;
        }
        return find_pow(a, n -1) * a;
    }
    public static void make_reverse_array(int n, int[] arr) {
        if (n == arr.length) {
            return;
        }
        make_reverse_array(n + 1, arr);
        System.out.print(arr[n] + " ");
    }

}
