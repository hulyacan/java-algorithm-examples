package elektroyazilim;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

class Utils {
    public boolean isItPrime(int num) {
        int count = 0;
        if (num == 2) {
            System.out.println("asal : min");
        } else if (num < 0 || num == 0 || num == 1) {
            count++;
        } else {
            count = 0;
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    count++;
                    //break; -> alternative
                }
            }
        }
        // bu sorguyu asagidaki gibi degil de if ile yapsaydin return sorunu yasardin
        // ne demek istiyorsun
        boolean isPrime = count != 0 ? false : true;
        return isPrime;
    }
}

public class FindPrimeNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any integer num : ");
        int number = input.nextInt();

        Utils utils = new Utils();
        boolean isPrime = utils.isItPrime(number);
        System.out.println("Is " + number + " prime? : " + isPrime);
    }


}
