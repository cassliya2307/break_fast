let minimum = 0;
let GCD = 1;
let firstNumber = 12;
let secondNumber = 8;

if(firstNumber < secondNumber){
minimum = firstNumber;
}

else{minimum = secondNumber;}

for(int counter = 1; counter <= minimum; counter++){
if(firstNumber % counter == 0 && secondNumber % counter == 0){GCD = counter;}


}

console.log(GCD)