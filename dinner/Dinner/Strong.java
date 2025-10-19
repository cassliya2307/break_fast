public class Strong{

public static void main(String... args){

int number = 15;

int total = 0;
for(int count = 0; number > 0; count++){
int digit = number % 10;
//System.out.print(digit);
int factorial = 1;
for(int counter = 1; counter <= digit; counter++){
factorial *= counter;
}
total += factorial;
number /=  10; 
}

if(number == total){
System.out.println(number + " is a StrongNumber");}
else{
System.out.println(number + " is not StrongNumber");
}















}

}