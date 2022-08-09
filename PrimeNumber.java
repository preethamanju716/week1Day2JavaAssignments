package week1.day2.assignments;



public class PrimeNumber {

	public static void main(String[] args) {

		int input=253;
		boolean flag=false;
		int i;

		for(i=2;i<=input/2;i++) {
			if(input%i==0) {
				flag=true;
				break;
			}
		}
		if (flag==true) {
			System.out.println("The number " + input+" is not a prime number and it is divisible by "+ i);
		}
		else
		{
			System.out.println("The number "+ input+" is a prime number");
		}

   }

}