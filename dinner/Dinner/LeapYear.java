public class LeapYear{

public static void main(String... args){
boolean isLeap = false; 
int year = 0;

for(year = 1900; year <= 2025; year++){

if(year % 4 == 0 && year % 100 != 0){
System.out.println(year);

}

else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
System.out.println(year);
}         

else if(year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
System.out.println(year);

}




}
}
}