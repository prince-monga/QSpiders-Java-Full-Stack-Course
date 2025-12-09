//Nested  function
//in which a function is defined inside another function
function grandPar(){
    console.log("I am grand parent");
   return function parent(){
         console.log("I am  parent");
    return    function child(){
              console.log("I am  child");
        }
        // child();
    }
    // parent();

}
// grandPar();

grandPar()()()  // it will give error because grandPar is not returning any function

//JAVAScirpt cuuring
//when function is return anothor function is known as javaScript cuuring


//What is closure in JavaScript?
//In the Nested function  when the inner function is trying to access the data which is present in the inner  function then closure is created

//closure it is an object
//closure is created when function is returned from another function


//Recurive Function
//-function which calls itself again and again is known as recursive function
function sum(num){
    //base condition

    if(num===1){
        return 1;
    }
    else{
        return num+ sum(num-1);
    }   
}
console.log(sum(5));

//Genrative Function
//-function which return the iterator is known as genrative function

// it returns multiple values
// it uses yield keyword to return the value

//.next() method is used to get the value from the genrative function

//the vale: which is ygilted is stored in the value property
//the done: it tells whether the function is completed or not it is stored in done property
//when all the yield statements are executed then done will be true otherwise false

function* genFun(){

    console.log("I am genrative function");
    yield 145;
    yield 244;
    yield 456;
}
let res=genFun()
console.log(res.next());
console.log(res.next());
console.log(res.next());
console.log(res.next());


function f1(){

}

//function 