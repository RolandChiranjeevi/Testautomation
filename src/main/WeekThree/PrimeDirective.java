package main.WeekThree;

    import java.util.ArrayList;

    public class PrimeDirective {

        public boolean isPrime(int number) {
            if (number == 2) {
                return true;
            } else if (number < 2) {
                return false;
            }

            for (int i = 2; i < number; i++) {
                if (number % i == 0) {
                    return false;
                }
            }
            return true;
        }

        public ArrayList<Integer> onlyPrimes(int[] numbers) {
            ArrayList<Integer> primes = new ArrayList<>();

            for (int number : numbers) {          // for-each loop [page:3]
                if (isPrime(number)) {             // återanvänd metoden ovan
                    primes.add(number);              // lägg till i listan
                }
            }

            return primes;
        }

        public static void main(String[] args) {
            PrimeDirective pd = new PrimeDirective();

            int[] numbers = {7, 28, 2, 0, 5, 11, 18};

            ArrayList<Integer> primes = pd.onlyPrimes(numbers);
            System.out.println(primes);
        }
    }

