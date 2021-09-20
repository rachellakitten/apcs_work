public class Primes{
  public static void main(String[] args){
    for(int i = 0; i < 100; i++){
      if(isPrime(i) == true){
        System.out.println(i);
      }
    }
  }
  static boolean isPrime(int n){
    if(n < 1){
      return false;
    }
    for(int i = 2; i < n; i++){
      if((n % i) == 0){
        return false;
      }
    }
    return true;
  }
}
