let main = console.log("1. Display Equations");

const prompt = require('prompt-sync')();

console.log("Enter 1 to start");
let operation = prompt("Enter operation: ");
let index = 0;
switch(operation){

case "1":
for (let count = 0; count <= 9; count++) {
let number1 = Math.floor(Math.random(50 , 100) * 100);
let number2 = Math.floor(Math.random(1 , 50) * 50);
let result = prompt("what is " + number1 + "-" + number2 + "? ");
let solution = number1 - number2;


for(let counter = 0; counter <= 2; counter++){
if(result == solution){
index += 1;}
}

if(result != solution){console.log("You're wrong!");
result = prompt("Last chance what is " + number1 + "-" + number2 + "? ");


if(result == solution){console.log("You're correct!");
		
}
	
		



}

else{console.log("You're correct!");
}	










}


console.log("You scored " + index + " out of ten");







}




