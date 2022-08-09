package week1.day2.assignments;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=34343;
		int temp=num;
		int r;
		int sum=0;
		while(num>0) {
		r=num%10;
		sum=(sum*10)+r;
		num=num/10;
		}
		if(temp==sum) {
		System.out.println("It is a palindrome");
	}
		else {
			System.out.println("Not a palindrome");
		}
	}

}
