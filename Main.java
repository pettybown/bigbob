import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Which function?");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                int n1 = scanner.nextInt();
                int[] numbers = new int[n1];
                for (int i = 0; i < n1; i++) {
                    numbers[i] = scanner.nextInt();
                }
                System.out.println(problem1(numbers));
                break;
            case 2:
        }
    }
    public static int problem1(int[] numbers){
        int min = numbers[0];
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < min) {
                min = numbers[j];
            }
        }
        return min;
    }
    }
