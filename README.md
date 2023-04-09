# Navigation
    Entering 1: finding minimum of the numbers.
    Entering 2: finding average of the numbers.
    Entering 3: finding type of the number.
    Entering 4: finding factorial of the number.
    Entering 5: finding the n-th element in fibonacci sequence.
    Entering 6: finding a^n.
    Entering 7: displaying the array in reverse order.
    Entering 8: checking the string for the content only of digits.
    Entering 9: finding binomial coefficient.
    Entering 10: finding gcd of the numbers.
# Task 1
__Description__: Return the minimum value of an array.
>__Explanation__: When the initial value of the minimum is less than the value of numbers[i], then it will take the value of numbers[i] and when the loop is completed, the function will return the value of the minimum

__Solution__:
    
    public static int find_minimum(int[] numbers){
        int min = numbers[0]; 
        for (int j = 1; j < numbers.length; j++) {
            if (numbers[j] < min)
            {
                min = numbers[j]; 
            }
        }
        return min;
    }

# Task 2
__Description__: Return the average of the given numbers.
>__Explanation__: First, we initialize the variable sum = 0, then we add numbers[i] to sum using a loop, and at the end we divide sum by the length of the array

__Solution__:
    
    public static double find_average(int[] numbers){
        int sum = 0; 
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        return (double) sum / numbers.length;
    }   
# Task 3
__Description__: Return "Yes" if the number is prime, otherwise return "No".
>__Explanation__: First we initialize the variable count = 0, then we add 1 to count using a loop. At the end, the condition is triggered, if count == 2, then "Prime" will be displayed, otherwise "Composite" will be displayed

__Solution__:
    
    public static String check_prime_or_composite(int n){
        int count = 0; 
        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                count += 1;
            }
        }
        if (count == 2) 
        {
            return "Prime";
        }
        else 
        {
            return "Composite";
        }
    } 
# Task 4
__Description__: Return the factorial of a given number.
>__Explanation__: When n == 1  we return 1 (1! == 1), otherwise, return the result of multiplying "n" by n - 1.

__Solution__:
    
    public static int find_factorial(int n){
        if (n == 1)  // if n == 1 returns 1, because 1! == 1
        {
            return 1;
        }
        return find_factorial(n - 1) * n;
    }    
# Task 5
__Description__: Return the n-th element in the fibonacci sequence.
>__Explanation__: When n == 1 or n == 2 we return 1 (1st and 2nd elements in fibonacci sequense == 1), otherwise, return the result of adding n - 1 to n - 2.

__Solution__:
    
    public static int find_fibonacci_number(int n){
        if (n == 1 || n == 2) 
        {
            return 1;
        }
        return find_fibonacci_number(n - 1) + find_fibonacci_number(n -2);
    }    
# Task 6
__Description__: Return a^n.
>__Explanation__: When n == 1 we return 1 (ex: 3 ^ 1 == 3), otherwise, return the result of multiplying a ^ (n - 1) to "a".

__Solution__:
    
    public static int find_pow(int a, int n){
        if (n == 1)
        {
            return a;
        }
        return find_pow(a, n -1) * a;
    }  
# Task 7
__Description__: Return an array in reverse order.
>__Explanation__: When n == the length of given array we just stop our program, otherwise, return recursive function with properties n = n + 1 and "arr", then print arr[n] + " ".

__Solution__:
    
    public static void make_reverse_array(int n, int[] arr) {
        if (n == arr.length) 
        {
            return;
        }
        make_reverse_array(n + 1, arr);
        System.out.print(arr[n] + " ");
    }
# Task 8
__Description__: Return "Yes" if the given string is all consists of digits, otherwise return "No".

> __Explanation__: Firstly, function array calls recursive function isNum() with properties of splitted "s", length of "s" and const zero. Secondly, if zero less than length of the string "s", then we call function checking to check the character is number or not. If character is integer returns true, otherwise, return false. Then, in function array() if character is number we return recursive function isNum() to check next character and if all characters are digits we return "Yes", otherwise return "No".

__Solution__:

    public static String array(String s) {
            return isNum(s.split(""), 0, s.length());
        }

    public static String isNum(String[] arr, int zero, int length) {
        if (zero < length) {
            if (checking(arr[zero])) {
                return isNum(arr, ++zero, length);
            }
            else {
                return "No";
            }
        }
        return "Yes";
    }
    
    public static boolean checking(String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
# Task 9
__Description__: Return the binomial coefficient.
>__Explanation__: When k == n or k == 0 we return 1, otherwise, return the result of adding n = n - 1, k = k - 1 to n = n - 1, k.

__Solution__:
    
    public static int find_binomial_coefficient(int n, int k){
        if (n == k || k == 0)
        {
            return 1;
        }
        return find_binomial_coefficient(n - 1, k - 1) + find_binomial_coefficient(n - 1, k);
    }
# Task 10
__Description__: Return GCD of two given numbers.

> __Explanation__: If a > b then a % b == 0, we return b, otherwise, b > a then b % a == 0, we return a.

__Solution__:

    public static int find_GCD(int a, int b) {
        if (a % b == 0) 
        {
            return b;
        } else if (b % a == 0) 
        {
            return a;
        }
        return find_GCD(a % b, b % a);
    }            
