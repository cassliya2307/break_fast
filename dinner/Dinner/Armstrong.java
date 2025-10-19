
import java.util.Scanner;

public class Armstrong{

public static void main(String... args){


Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();
int cubed = 1;
while(number > 0){
int digit = number % 10;
cubed = number * number * number;

System.out.println(digit);


//cubed = number * number * number;

number /= 10;

//cubed = number * number * number;

}

System.out.println(cubed);



}

}