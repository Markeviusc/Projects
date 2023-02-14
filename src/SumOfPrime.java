public class SumOfPrime {
        private static boolean isPrimeNumber(int number) { // created boolean method to check if number is a prime number
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int number = 2, count = 0, sum = 0;
            while (count < 10) { //  while loop that uses isPrimeNumber method to add prime numbers together
                if (isPrimeNumber(number)) {
                    System.out.println("Prime Number: " + number);
                    sum += number;
                    count++;
                }
                number++;
            }
            System.out.println("Sum of 5 Prime Numbers: " + sum);
        }
    }

