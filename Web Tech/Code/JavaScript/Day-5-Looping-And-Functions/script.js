console.log("Hey Prince")

//For loop

// for(initlaztion; conadition checking ; updation ){
//     //statements
// }
console.log("For loop")
for(let i=0; i<10;i++){
    console.log(i)
    document.writeln(i+"\n")
}


//While loop  ----Entry control loop
// decaltion or intitialization
// while(condtion){
//     //Statements //block
//     updation;
// }

console.log("While Loop:")
let i=0
while(i<10){
       console.log(i)
     document.writeln(i+"\n")
     i++
}

console.log("Do While Loop:")
let j=0
do{
       console.log(j)
     document.writeln(j+"\n")
     j++
}
while(j<10);



//Function: It is a reusable  block of code it follows DRY  Principle

function functionName(){
    body
}

//functionName ---call the function
//functionName() ----Invoke the function and   access this

function Friend(){
  for(let i=0;i<=500;i++){
    // document.writeln("Sorry !")
  }
}
Friend()  

//Argument- 
//        the valus that are passd, while calling the function,it is called argument.

//Parameter: 
//         The values that are accepted by the function,inside the paranthesis, it is called parameter.

//arguments: It is object or keyword. it stores the data that are passed while calling the function.

function add(a,b){  //Argument pass
  console.log("Sum=")
  console.log(arguments)
  console.log(a+b)
}

add(34,30) //passed parmenter inside the paranthisis 
add(450,100)


//Implicit return : If we not returning anything from the function, then fuction by default returns undefined, it is called implict return.


function impReturn(){
    console.log("implicit  returns")
}
console.log(impReturn())


//Explicit return: If we are explicity returning something,from inside the function,it is called explicit return.

function ExpReturn(){
    console.log("Explicit return")
    return "abc";
}
console.log(ExpReturn())


//Types of function

//1. Named Function:- A function which having some name is called named function
function add(){  //Argument pass

}
//2. Anoymous Function:- A function does not have a name is called anyomous function
// function () {  //Argument pass
  
// }

// Arrow Function => It is shorter way of writing the function code.
   

()=>{
  //arrow function
}

  //1. store in a varible
//   let fun=()=>{
//   //arrow function store in a varible
// }
    //example
       //1.>_ If function is having only 1 parameter , then there is no need of using the paranthesis
       let fun=a=>{
        console.log(a)
  }

  fun(10)


    //2. >_ If function is having more than parameter , then there is need of using the paranthesis.

    //example

       let fun1=(a,b)=>{
        console.log(a+b)
  }

  fun1(10,20)

  //3. >_ if we are writing one statement, inside arrwo function, then there is no need of using the curly brackets
  let f1=()=>
              console.log("Hey")

f1()
 //4. >_ if we are writing more than one  statement, inside arrwo function, then there is  need of using the curly brackets
  let f2=()=>{
              console.log("Hey")
              console.log("Bye bye")
  }

f2()