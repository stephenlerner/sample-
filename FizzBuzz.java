/*FizzBuzz.java*/


public class FizzBuzz{
	
	FizzBuzz(){
		for (int i = 1; i<=100; i++){
			if (i%15 == 0){
				System.out.println("fizzbuzz");
				}
			else if (i%3 == 0){
				System.out.println("fizz");
			}
			else if (i%5 == 0){
				System.out.println("buzz");
			}
			else {
				System.out.println(i);
			}
		}
	}
public static void main(String[] args) {
	FizzBuzz fizz = new FizzBuzz();
	}
}