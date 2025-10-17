import java.util.Scanner;

public class Encrypt{

public static void main(String... args){


Scanner scanner = new Scanner(System.in);

System.out.print("Enter your four-digit password: ");
int data = scanner.nextInt();
int digit1 = 0;
int digit2 = 0;
int digit3 = 0;
int digit4 = 0;
int temp1 = 0;
int temp2 = 0;

 digit1 = (data % 10000)/1000;
 digit2 = (data % 1000)/100;
 digit3 = (data % 100)/10;
 digit4 = (data % 10)/1;


digit1 = (digit1 + 7) % 10;
digit2 = (digit2 + 7) % 10;
digit3 = (digit3 + 7) % 10;
digit4 = (digit4 + 7) % 10;


temp1 = digit3;
digit3 = digit1;
digit1 = temp1;

temp2 = digit4;
digit4 = digit2;
digit2 = temp2;



System.out.print(digit1 + " ");
System.out.print(digit2 + " ");
System.out.print(digit3 + " ");
System.out.print(digit4 + " ");



}

}