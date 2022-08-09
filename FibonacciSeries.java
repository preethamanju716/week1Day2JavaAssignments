package week1.day2.assignments;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=8;
		int a1=0,a2=1,sum=0;
		System.out.println(a1);
		System.out.println(a2);
		for(int i=3;i<=input;i++) {
			sum=a1+a2;
			System.out.println(sum);
			a1=a2;
			a2=sum;
			}

		}

	}