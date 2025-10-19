public class PerfectNumber {
public static void main(String[] args){
int number = 6;
int sum = 0;
boolean isPerfect = true;
for(int count = 1; count < number; count++) {
if (number % count == 0) sum += count;
}

if(sum == number){isPerfect = true;

System.out.print(isPerfect);
}
else{
isPerfect = false;

System.out.print(isPerfect);



}
}
}