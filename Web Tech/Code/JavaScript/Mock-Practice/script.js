let a=10
let b="20"
console.log(a+b);  //1020
console.log(typeof(a+b));  //string
console.log(a-b); //-10
console.log(typeof(a-b)); //number

//Type Convertion
//-manually converting one data type to another data type is known as type convertion

console.log(a+ Number(b));


//Explicit type convertion
//-manually converting one data type to another data type is known as explicit type convertion

console.log(a+ String(b));


let c=null

console.log(typeof c); //object
console.log(Object(c)); //number ----0
//JavaScript Function
//-A block of code which is used to perform a specific task is known as function

//1. Namsed Function- A name function is a function which conations a specific name and it can called by this name , it knwon as named function

function funName(){
console.log("I am named function");
}
funName();  //function call

//2. Anoymous function - A function which does not have any name is knwown as anymos function

// function(){
//     console.log("I am anoymous function");
// }
// ();  //it will give error because anoymous function should be stored in a variable

let funVar= function(){
    console.log("I am anoymous function");
}

funVar();  //function call

//3. non-parameterized function - A function which does not contain any parameter is known as non-parameterized function

function nonParamFun(){
    console.log("I am non-parameterized function");
}

//4. parameterized function - A function which contains parameter is known as parameterized function

function paramFun(param1, param2){

    console.log("I am parameterized function");
    console.log("The value of param1 is: "+ param1);
    console.log("The value of param2 is: "+ param2);
}   
paramFun(10, 20);  //function call with arguments

//5. Arrow function - It is the shorter way of writting the function in js, in which use => symbol
// to define the function and it is always anoymous function and should be stored in a variable

let arrowFun= (param1, param2) => {
    console.log("I am arrow function");
    console.log("The value of param1 is: "+ param1);
    console.log("The value of param2 is: "+ param2);
}
arrowFun(30, 40);  //function call with arguments

//JavaScript Curring
//-When a function is returning another function is known as JavaScript curring
function grandPar(){
    return function parent(){
         console.log("I am  parent");
    return    function child(){
              console.log("I am  child");
        }       
    }
}

grandPar()()()  //function call

// function greet(name) {
//   console.log(name);
// }
// function callMe(callback) {
//   callback("Prince");
// }
// callMe(greet);

// //Callback function:- 
// function fun1(fn){
//     console.log(fn())
// }

// function fn(){
//     console.log("hello")
// }
// fun1()
//BOM

//we have 5 major object
//1. document
function greet(name, callback) {
    console.log("Hello " + name);
    callback();
}

function sayBye() {
    console.log("Goodbye");
}
greet("Prince", sayBye);

console.log(window.location) //it is used to provide cureet url info


console.log(window.navigator) //it is provide info about brwoser

console.log(window.screen) //it is provide info about device and browser

console.log(window.history) //manage broswer sessions

//math Object
//! the math object is built in javascript object. it have contant values and somefunctions that are used for performe mathematical operations

var v=10.3
var v2=10.9
console.log(Math.floor(v))
console.log(Math.floor(v2))
console.log(Math.ceil(v))
console.log(Math.ceil(v2))

//Ways to create an Array
let arr1=[1,36,567]
console.log(arr1)


let arr2=new Array(76,67,97,46);
console.log(arr2)
 arr2.push(5);
 console.log(arr2)
let arr3=Array.of("",6,7,9)
console.log( typeof(arr3))
console.log(arr1.length);

