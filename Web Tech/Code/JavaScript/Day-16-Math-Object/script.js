//!Math Objet

console.log(Math.PI)
console.log(Math.E) //2.718281828459045 //universal constant
console.log(Math.sqrt(81))

//& power
console.log(Math.pow(2,3)) //2^3=8
console.log(2**3) //2^3=8 

//& floor- returns the greater interger
console.log(Math.floor(4.3))  //4.3 -> 4
console.log(Math.ceil(4.3))   //4.3 -> 5
console.log(Math.round(4.3))  //4.3 -> 4
console.log(Math.round(4.6))  //4.6 -> 5

//& ceil- returns the smallest integer greater than or equal to a given number
console.log(Math.ceil(5.6))  //5.6 -> 6
// console.log(Math.floor(5.6)) //5.6 -> 5



//& abs method: returns the absolute value of a number
console.log(Math.abs(-4))  //4
console.log(Math.abs(-4.6))  //4.6
console.log(Math.abs(-5.6))  //5.6

//& Math.trunc() - returns the integer part of a number by removing any fractional digits
console.log(Math.trunc(4.3))  //4

//& min and max
console.log(Math.min(4,1,6,9,-3,0)) //-3
console.log(Math.max(4,1,6,9,-3,0)) //9


//& Math.random() - returns a random number between 0 (inclusive) and 1 (exclusive)
console.log(Math.random()) 
//-when we get six digit number  randomly
console.log(Math.trunc(Math.random()*1000000))
console.log(Math.floor(Math.random()*900000)+1000) 
//- OTP between 1000 to 9999
console.log(Math.floor(Math.random()*900)+100)



//! JavaScript Engine
//? A JavaScript engine is a program or interpreter that executes JavaScript code. 
//? It takes the JavaScript source code, parses it, and converts it into machine code that can be executed by the computer's processor. 
//? Some popular JavaScript engines include V8 (used in Google Chrome and Node.js), SpiderMonkey (used in Mozilla Firefox), and JavaScriptCore (used in Safari). 
//? Each engine has its own optimizations and features, but they all aim to efficiently execute JavaScript code.


