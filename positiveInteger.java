	import java.util.Scanner;

	public class positiveInteger {

		//if the input is odd multiply it by 3 and plus 1; else if the input is even divide it by 2 
			public static void main(String[] args) {
				int num, x, newNum;
				
				Scanner scan = new Scanner(System.in);
				
				System.out.println("Enter a positive number: ");
				num = scan.nextInt();
				
				if(num <= 0) {
					System.out.println("Invalid number.");
				} else {
					while (num > 1) {
						if((num % 2) == 0) {
							newNum = num / 2;
						} else {
							newNum = (num * 3) + 1;
						}
						System.out.println("Current given value is " + newNum);
						num = newNum;
					}
				}
			}
		}

