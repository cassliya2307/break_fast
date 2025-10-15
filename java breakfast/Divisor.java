public class Divisor{

public static void main(String[] args){
int num = 20;
int divide = 2; 
int total = 0;

for(int count = 0; count <= num; count++){
	if(num > 1 && num % divide != 0){ divide += 1;}

}

num = num / divide;
total = total + divide;
System.out.println(divide);



System.out.println(total);

}





}


