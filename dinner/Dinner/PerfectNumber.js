let number = 6;
let sum = 0;
let count = 0;
boolean isPerfect = true;
for(let count = 1; count < number; count++) {
if (number % count == 0) sum += count;
}

if(sum == number){isPerfect = true;

console.log(isPerfect);
}
else{
isPerfect = false;

console.log(isPerfect);



}
