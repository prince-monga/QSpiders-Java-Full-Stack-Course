//Primitive DataTypes

//Number
let no=12;
console.log("Value of no:",no);
console.log("Data type of no:",typeof no);

//String
let str="Hello World";
console.log(typeof str);
//bigInt
let bn=45784n;
console.log(typeof bn);
//boolean
let bool=true;
console.log(typeof bool);

//undefined
let un;
console.log(typeof un);
//null --It repersent empty value
let n=null;
console.log(typeof n); 
//Symbol
let sym=Symbol("a");
console.log(typeof sym);


//Non-Primitive datatype/Mutable
//Functions ---------+++-----
function sum(){ 
    //body of function
}
console.log(typeof sum); //Function
//Array
let arr=[];
console.log(typeof arr); //object
//Object
let obj={}
console.log(typeof obj); //object


//type of NaN (Not a number but it give 'number' in console)

console.log(typeof NaN); //number



//typecasting

//Implicit type casting

console.log(10+10); //20 (number)
console.log(10+"10"); //1010 (string)
console.log(10 + typeof 10) //10string (string)
console.log(10*"2"); //20 (number)
console.log(10*"abc"); //NaN
console.log(10+"hii"); //10hii (string)
console.log(10+ typeof window) //10object (string)
console.log(2+3*"5"+10-"5"); //20 (number)
console.log(10-"10") //0 (number)

console.log(typeof(10+typeof window)) //string
console.log(true-0.5*2 +"5")

