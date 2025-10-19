public class PerfectNumber {
public static void main(String[] args){

int sum = 0;


for(int counter = 1; counter <= 1000; counter++){
for(int count = 1; count < counter; count++) {
if (number % count == 0) sum += count;
}

if(sum ==counter){

System.out.print(counter);
}
else{


System.out.print(counter);

}
}
}
}