 public class digitoperations {
    public static void main(String[] args) {
        int number = 12345;  
        System.out.println("Number: " + number);
        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Product of digits: " + productOfDigits(number));
        System.out.println("Sum of odd digits: " + sumOfOddDigits(number));
    }

    // sum of digits
    public static int sumOfDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }

    // product of digits
    public static int productOfDigits(int n) {
        int product = 1;
        while (n > 0) {
            product *= n % 10;
            n /= 10;
        }
        return product;
    }

    // sum of odd digits
    public static int sumOfOddDigits(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 != 0) {
                sum += digit;
            }
            n /= 10;
        }
        return sum;
    }
}