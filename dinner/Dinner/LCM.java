import java.util.Scanner;
public class LCM{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int num = scanner.nextInt();
int divide = 2; 
int total = 0;
while(num > 1){
while(num % divide != 0){
divide++;

}


num = num / divide;
total = total + divide;
System.out.println(divide);
}


System.out.println(total);

}





}