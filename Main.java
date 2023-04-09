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
            case 8:
                String s = scanner.next();
                System.out.println(array(s));
                break;
            case 9:
                int n = scanner.nextInt();
                int k9 = scanner.nextInt();
                System.out.println(find_binomial_coefficient(n, k9));
                break;
            case 10:
                int a10 = scanner.nextInt();
                int b10 = scanner.nextInt();
                System.out.println(find_GCD(a10,b10));
                break;
        }
    }
    /**
     * Task 1. Contains function find_minimum() which finding minimum of given numbers and using 1 parameter "numbers".
     * @param numbers is an array of received digits of which you need to find minimum digit.
     * @return this function returns minimum of given numbers.
     */
    public static int find_minimum(int[] numbers){
        int min = numbers[0]; // initialization of the minimum, which takes the value of numbers[0]
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < min) //comparison of minimum and value of numbers[i]
            {
                min = numbers[j]; // if the condition is satisfied, the minimum takes value of numbers[i]
            }
        }
        return min;
    }
    /**
     * Task 2. Contains function find_average() which uses 1 parameter "numbers".
     * @param numbers is an array of received digits of which you need to find average value.
     * @return this function returns the average of all digits.
     */
    public static double find_average(int[] numbers){
        int sum = 0; // initialization of the sum
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // getting the sum of all numbers
        }

        return (double) sum / numbers.length;
    }
    /**
     * Task 3. Contains function check_prime_or_composite() which identifies the type of number and uses parameter "n".
     * @param n is a number type of which you want to identify.
     * @return this function returns "composite" or "prime" type of number.
     */
    public static String check_prime_or_composite(int n){
        int count = 0; // counter initialization
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count += 1; // if the condition is satisfied, the counter will add 1
            }
        }
        if (count == 2) // if count will equal 2, then works this statement
        {
            return "Prime";
        }
        else // if count won't equal 2, then works this statement
        {
            return "Composite";
        }

    }
    /**
     * Task 4. Contains recursive function find_factorial() which identifying factorial of given number and uses parameter "n".
     * @param n is a number factorial of which you need to find.
     * @return this function returns factorial of given number.
     */
    public static int find_factorial(int n){
        if (n == 1)  // if n == 1 returns 1, because 1! == 1
        {
            return 1;
        }
        return find_factorial(n - 1) * n;
    }
    /**
     * Task 5. Contains recursive function find_fibonacci_number() which identifies n-th element in fibonacci sequence and uses parameter "n".
     * @param n is a number n-element of which you need to find.
     * @return this function returns n-th element in fibonacci sequence.
     */
    public static int find_fibonacci_number(int n){
        if (n == 1 || n == 2) // if n == 1 or n == 2 returns 1, because 1st and 2nd elements in fibonacci sequence equal to 1
        {
            return 1;
        }
        return find_fibonacci_number(n - 1) + find_fibonacci_number(n -2);
    }
    /**
     * Task 6. Contains recursive function find_pow() which solves a^n tasks and uses 2 parameters "a" and "n".
     * @param a is a coefficient number.
     * @param n is a degree number of coefficient.
     * @return this function returns result of a^n operation.
     */
    public static int find_pow(int a, int n){
        if (n == 1) // if n of a^n equals to 1 we return "a", because a^1 == a
        {
            return a;
        }
        return find_pow(a, n -1) * a;
    }
    /**
     * Task 7. Contains recursive function make_reverse_array() which reverses given digits in array and uses 2 parameters "n" and "arr".
     * @param n is a length of an array.
     * @param arr is an array of received digits reverse order of which you need to display.
     */
    public static void make_reverse_array(int n, int[] arr) {
        if (n == arr.length) // if n == length of an array we stop the program
        {
            return;
        }
        make_reverse_array(n + 1, arr);
        System.out.print(arr[n] + " ");
    }
    /**
     * Task 8, 1st function. Contains recursive function isNum() which check whether a string consists only of digits or not and uses 3 parameters "arr", "zero" and "length".
     * @param arr is an array of received digits.
     * @param zero is a parameter with value 0 to check if length more or less than 0.
     * @param length is a parameter which contains length of string.
     * @return this function returns "Yes" if string consists only of digits otherwise "No".
     */
    public static String check_is_num(String[] arr, int zero, int length) {
        if (zero < length) // if zero less than length of the string "s" we check the character is digit or not and return the result
        {
            if (checking(arr[zero])) {
                return check_is_num(arr, ++zero, length);
            }
            else // else we return "No"
            {
                return "No";
            }
        }
        return "Yes";
    }
    /**
     * Task 8, 2nd function. Contains function array() which gets string and splits it, uses parameter "s".
     * @param s is a some string that user entered.
     * @return this function returns split data and transmit these data to function isNum().
     */
    public static String array(String s) {
        return check_is_num(s.split(""), 0, s.length());
    }
    /**
     * Task 8, 3rd function. Contains function checking() which checking by try-catch does the string consist only of digits and uses parameter "s".
     * @param s is a some string that user entered.
     * @return this function returns true if the string consists only of digits otherwise false and transmit this data to function isNum().
     */
    public static boolean checking(String s) {
        try // if s is digit we return true
        {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) // if s is not digit we return false
        {
            return false;
        }
    }
    /**
     * Task 9. Contains recursive function find_binomial_coefficient() which finding binomial coefficient using parameter "n" and "k".
     * @param n is a digit of first item.
     * @param k is a digit of second item.
     * @return this function returns binomial coefficient of 2 digits using formula.
     */
    public static int find_binomial_coefficient(int n, int k){
        if (n == k || k == 0) // if k == n or k == 0 we return 1
        {
            return 1;
        }
        return find_binomial_coefficient(n - 1, k - 1) + find_binomial_coefficient(n - 1, k);
    }
    /**
     * Task 10. Contains recursive function find_GCD() which finding gcd of 2 given numbers and uses 2 parameters "a" and "b".
     * @param a is a first number.
     * @param b is a second number.
     * @return this function returns gcd of 2 numbers.
     */
    public static int find_GCD(int a, int b) {
        if (a % b == 0) // if a > b and a % b == 0, we will return b
        {
            return b;
        } else if (b % a == 0) // if b > a and b % a == 0, we will return a
        {
            return a;
        }
        return find_GCD(a % b, b % a);
    }
}
