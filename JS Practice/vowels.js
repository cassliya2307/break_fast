let word = "ration";
let sum = 0;
for(let count = 0; count <= word.length; count++){
	if(word[count] == "a" || word[count] == "A"){
		sum += 1;}

	else if (word[count]  == "e"|| word[count]  == "E"){
		sum += 1;}
	
	else if word[count]  == "i" || word[count]  == "I"{
		sum += 1;}

	else if (word[count]  == "o" || word[count]  == "O"){
		sum += 1;}

	else if (word[count]  == "u" || word[count]  == "U"){
		sum += 1;}

}
System.out.print(sum);
