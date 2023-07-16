import java.util.Arrays;
import java.util.ArrayList;

public class PrimeDirective{

    public boolean isPrime(int i){
        if (i == 2 || i == 1) {
            return true;
        }
        for (int b = i - 1; b > 1; b--){
            if (i % b == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};
        ArrayList<Integer> primes = new ArrayList<Integer>();
        PrimeDirective x = new PrimeDirective();
        for (int nums : numbers){
            if(x.isPrime(nums)){
                primes.add(nums);
            }
        }
        System.out.println(primes);
    }
}