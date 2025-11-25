
import javax.swing.text.StyledEditorKit;

public class Primes {
    public static void main(String[] args) {
       int n=Integer.parseInt(args[0]);
        boolean[] isPrime = primes(n);
       int times=0;
        System.out.println("Prime numbers up to " + n + ":");
       for (int i = 2; i <= n; i++) {
           if (isPrime[i]) {
               System.out.println(i);
               times++;
           }
       }int percent = 0;
       if (n > 1) {
           percent = (int)((double)times * 100 / (n - 1));
       }
       System.out.println("There are " + times + " primes between 2 and " + n + "(" + percent + "% are primes)");
    }


    public static boolean [] primes ( int n){
        boolean [] isPrime = new boolean[n + 1];
        
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }
        
        if (n >= 0) isPrime[0] = false;
        if (n >= 1) isPrime[1] = false;

        for (int p = 2; p * p <= n; p++) {
            
            if (isPrime[p]) {
                
                for (int i = p * p; i <= n; i += p) {
                    isPrime[i] = false;
                }
            }
        }
        
        return isPrime;
    }

    }
