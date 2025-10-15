public class Divisor{

public static void main(String[] args){
int num = 20;
int divide = 2; 
int total = 0;

for(int count = num; count < 1; count++){
if(num % 2 != 0){ divide++; }


num = num / divide;
total = total + divide;
System.out.println(divide);

System.out.println(total);


}








}


}