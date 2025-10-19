public class LeapYearCount{

public static void main(String... args){
 
int year = 0;
int sum = 0

for(year = 1900; year <= 2025; year++){

if(year % 4 == 0 && year % 100 != 0){
sum += 1;


}

else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
sum += 1;


}         

else if(year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
sum += 1;


}


}

System.out.println(sum);
}
}