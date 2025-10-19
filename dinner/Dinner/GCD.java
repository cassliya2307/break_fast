public class GCD{

public static void main(String... args){

int minimum = 0;
int GCD = 1;
int firstNumber = 12;
int secondNumber = 8;

if(firstNumber < secondNumber){
minimum = firstNumber;
}

else{minimum = secondNumber;}

for(int counter = 1; counter <= minimum; counter++){
if(firstNumber % counter == 0 && secondNumber % counter == 0){GCD = counter;}


}


System.out.println(GCD);







}






}