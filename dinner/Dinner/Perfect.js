let number = 6;
let sum = 0;
boolean isPerfect = True;
for(let count = 1; count < number; count++) {
if(number % count == 0) sum += count;
}

if(sum == number){isPerfect = True;

console.log(isPerfect);
}
else{
isPerfect = False;

console.log(isPerfect);



}
