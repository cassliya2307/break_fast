
function debugNumber(numbers){
		newArray = [];
	for(let count = 0; count <= numbers.length - 1; count++){
		if(numbers[count] > 0  && numbers[count] < 6){
			newArray.push(numbers[count]);
		}
		
	}

return newArray;
}

function debugGps(numbers){
for(coordinates of numbers){
if(coordinates.longitude == "null" || coordinates.longitude == 0){
coordinates.longitude = 1;

}
if(coordinates.latitude == "null" || coordinates.latitude == 0){
coordinates.latitude = 4;

}


}


return numbers;
} 


function satisfactionScore(scores){
let newArray = [];

for(marks of scores){

if(marks.score >= 80){
	newArray.push(marks);
		
			
	}

	
}
newArray.sort((a , b) => b.score - a.score);
return newArray;
}




let score = [{name :"seun", score : 23} , {name : "nate" , score : 900} , {name : "lakan" , score : 100} , {name : "mike" , score : 120}, {name : "wike" , score : 170}];

let GPS = [{"longitude" : "null" , "latitude" : 2} , {"longitude" : 1  , "latitude" :  "null"}, {"longitude" : 0  , "latitude" :  "null"}, {"longitude" : 8  , "latitude" : 0}]
console.log(satisfactionScore(score));
console.log(debugGps(GPS));


let numbers = [6 , 6 , 1 , 2 , 4 , 6 , 7 , 8 , 0];

