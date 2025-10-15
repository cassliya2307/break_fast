pudlic class Task{

public static void int even Numbers(int num){
for(int count = 1; count <= 100; count++){
if(count % 2 == 0){
System.out.print(count);
}
}



}


public static void int oddNumbers(int num){
for(count = 50; count <= 100; count++){
if(count % 2 != 0){System.out.print(count);}


}

}


public static void int decrease(int num){
for(count = 100; count >= 1; count--){

System.out.print(count);


}


}


public static void int square(int num){
for(count = 1; count <= 20; count++){

System.out.print(count * count);

}

}


public static void int multipleOfThree(int num){
for(count = 1; count <= 50; count++){
if(count % 3 == 0){System.out.print(count);
}
}



}

public static void int multipleOfThreeAndFive(int num){
for(count = 1; count <= 100; count++){
if(count % 3 == 0 && count % 5 == 0){System.out.print(count);
}
}




}


public static void int multipleOfSeven(int num){
for(count = 1; count <= 100; count++){
if(count % 7 == 0){System.out.print(count);
}
}

}


public static void int sumOfNumbers(int num){
sum = 0;
for(count = 1; count <= 50; count++){
sum += count;

}





}


public static void int productOfNumbers(int num){

product = 1;
for(count = 1; count <= 50; count++){
product *= count;

System.out.print(product)
}




}


public static void String allCharacters(String ring){
String ring = "haliya";

for(int count = 0; count <= ring.length; count++){

System.out.println(ring[count]);

}

}


public static void String occurence(String word){
String word = "Pour";
sum = 0;
for(int count = 0; count <= word.length; count++){
if (word[count] == "e" || word[count] == "E"){
		sum += 1;
}
System.out.println(sum);

}


public static void String toUpperCase(String word)
String word = "odogwu"
for(int count = 0; count <= word.length; count++){

word[count] = word.toUpperCase();


}


}


public static void String toLowerCase(String word){
String word = "odogwu"
for(int count = 0; count <= word.length; count++){

word[count] = word.toLowerCase();


}


}


public static void String vowels(String word){
String word = "ration";
sum = 0;
for(int count = 0; count <= word.length; count++){
	if(word[count] == "a" || word[count] == "A"){
		sum += 1;}

	elseif (word[count]  == "e"|| word[count]  == "E"){
		sum += 1;}
	
	else if word[count]  == "i" || word[count]  == "I"{
		sum += 1;}

	else if (word[count]  == "o" || word[count]  == "O"){
		sum += 1;}

	else if (word[count]  == "u" || word[count]  == "U"){
		sum += 1;}

}
System.out.print(sum);

}

public static void String digits(String number){

String number = "123455378181010";
sum = 0;
for(int count = 0; count <= number.length; count++){

sum += 1;

}

System.out.print(sum);
}



public static void int sumDigits(int [] number){
sum = 0;
for(int count = 0; count <= number.length; count++){

sum += number[count];


}
System.out.print(sum);

}


public static void int largestDigits(int [] number){
largest = number[0];
for(int count = 0; count <= number.length; count++){
if(largest < number[count]){
largest = number[count];}


}
System.out.print(largest);

}



public static void int smallestDigits(int [] number){
smallest = number[0];
for(int count = 0; count <= number.length; count++){
if(smallest > number[count]){
smallest = number[count];}


}
System.out.print(smallest);

}

































}