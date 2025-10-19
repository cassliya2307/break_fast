let year = 0;

for(year = 1900; year <= 2025; year++){

if(year % 4 == 0 && year % 100 != 0){
console.log(year);

}

else if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0){
console.log(year);
}         

else if(year % 4 == 0 && year % 100 == 0 && year % 400 != 0){
console.log(year);

}
