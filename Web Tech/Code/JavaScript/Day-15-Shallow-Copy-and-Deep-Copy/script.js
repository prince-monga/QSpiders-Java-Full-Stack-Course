//!----------------- Shallow Copy and Deep Copy in JavaScript -----------------!
// - In JavaScript, objects are reference types, which means that when you assign an object to a variable, you are assigning a reference to that object in memory, not the actual object itself. This can lead to unintended consequences when you try to copy an object, as changes made to the copied object can also affect the original object. To avoid this, we can use shallow copy and deep copy techniques to create copies of objects.

let obj={
    id:1,
    name:"prince",
    age:15,
    skills:["HTML","CSS","JS"],
    sal:36788,
    companyDetails:{
        companyName:"Qspider",
        location:"Bangalore"
    }
}
console.log(obj)

//! Shallow Copy:- It creates a new object which is a copy of the original object, but the nested objects are still referenced to the original object.
// - It means that if we change a nested object in the copied object, it will also change in the original object.
//! 1st way of shallow copy
let shallowCopy=Object.assign({},obj)
console.log("Shallow Copy before change:")
console.log(shallowCopy) 

shallowCopy.companyDetails.companyName="Infosys"

//it will reflect in both original and shallow copy
obj.companyDetails.location="Hyderabad"
shallowCopy.skills.push("ReactJS")
console.log("After changing nested object in original object:")
console.log("location in Original Object:",obj.companyDetails.location)
console.log("location in Shallow Copy:",shallowCopy.companyDetails.location)
console.log("skills in Original Object:",obj.skills)
console.log("skills in Shallow Copy:",shallowCopy.skills)

//it will not reflect in both original and shallow copy because we are changing the primitive value
obj.name="prince Arora"
console.log(obj.name)
console.log(shallowCopy.name)

//! 2nd way of shallow copy
let shallowCopy2={...obj}
console.log("Shallow Copy 2 before change:")
console.log(shallowCopy2)

//! 3rd way of shallow copy
let shallowCopy3={}
for(let key in obj){
    shallowCopy3[key]=obj[key]
}


//! Deep Copy:- It creates a new object which is a copy of the original object, including all nested objects.
// - It means that if we change a nested object in the copied object, it will not change in the original object.
//1st way to create deep copy 
let deepCopy2=structuredClone(obj)

//2nd way to create deep copy
let deepCopy=JSON.parse(JSON.stringify(obj))

console.log("Deep Copy before change:")
console.log(deepCopy)

deepCopy.companyDetails.companyName="TCS"
deepCopy.skills.push("NodeJS")

//it will not reflect in both original and deep copy
console.log("After changing nested object in Deep Copy:")
console.log("companyName in Original Object:",obj.companyDetails.companyName)   
console.log("companyName in Deep Copy:",deepCopy.companyDetails.companyName)
console.log("skills in Original Object:",obj.skills)
console.log("skills in Deep Copy:",deepCopy.skills)
//it will not reflect in both original and deep copy because we are changing the primitive value
obj.age=16
console.log(obj.age)
console.log(deepCopy.age)

//& Note:- 
//In JavaScript, shallow copy creates a new object but shares references to nested objects, while deep copy creates a completely independent copy of the original object, including all nested objects.
// - Shallow copy is faster and uses less memory, but can lead to unintended consequences when modifying nested objects. Deep copy is slower and uses more memory, but provides complete independence between the original and copied objects.
// - The choice between shallow copy and deep copy depends on the specific use case and requirements of the application.
// - For simple objects with no nested objects, shallow copy is sufficient. For complex objects with nested objects, deep copy is recommended to avoid unintended consequences.
// - Common methods for creating shallow copies include Object.assign() and the spread operator (...), while common methods for creating deep copies include JSON.parse(JSON.stringify()) and structuredClone().

//!Shallow Copy and Deep Copy Summary Table:
//| Aspect               | Shallow Copy                          | Deep Copy                             |
//|----------------------|--------------------------------------|---------------------------------------|
//| Definition           | Creates a new object with references | Creates a completely independent     |
//|                      | to nested objects                    | copy of the original object           |
//| Nested Objects       | Shares references to nested objects  | Copies all nested objects             |
//| Performance          | Faster and uses less memory          | Slower and uses more memory           |
//| Use Case             | Simple objects with no nested objects| Complex objects with nested objects   |

//! Shalow copy-- 
//outer->different memory
//inner->same memory
//! Deep copy--
//outer->different memory
//inner->different memory

//!----------------- End of Shallow Copy and Deep Copy in JavaScript -----------------!



//! Call Method in JavaScript
// - The call() method is a built-in method in JavaScript that allows you to invoke a function with a specified this value and arguments provided individually.
// - It is a method of Function.prototype, which means that it can be called on any function in JavaScript.
// - The syntax for the call() method is as follows:
// functionName.call(thisArg, arg1, arg2, ...)
let person1={
    name:"Prince"
}
let person2={
    name:"Rohit"
}
let person3={
    name:"Ankit"
}

function makeBill(sal,address){
    console.log(`Bill for ${this.name}: Salary is ${sal} and Address is ${address}`);
}

makeBill.call(person1,12345,"xyz")  //Bill for Prince: Salary is 12345 and Address is xyz
makeBill.call(person2,23456,"abc")  //Bill for Rohit: Salary is 23456 and Address is abc
makeBill.call(person3,34567,"pqr")  //Bill for Ankit: Salary is 34567 and Address is pqr

//! Apply Method in JavaScript
// - The apply() method is a built-in method in JavaScript that allows you to invoke a function with a specified this value and arguments provided as an array (or an array-like object).
// - It is similar to the call() method, but instead of passing arguments individually, you pass them as an array.  
// - The syntax for the apply() method is as follows:
// functionName.apply(thisArg, [arg1, arg2, ...])

makeBill.apply(person1,[12345,"xyz"])  //Bill for Prince: Salary is 12345 and Address is xyz
makeBill.apply(person2,[23456,"abc"])  //Bill for Rohit: Salary is 23456 and Address is abc
makeBill.apply(person3,[34567,"pqr"])  //Bill for Ankit: Salary is 34567 and Address is pqr

//! Bind Method in JavaScript
// - The bind() method is a built-in method in JavaScript that creates a new function that, when called, has its this keyword set to the provided value, with a given sequence of arguments preceding any provided when the new function is called.
// - It is similar to the call() and apply() methods, but instead of invoking the function immediately, it returns a new function that can be called later.
// - The syntax for the bind() method is as follows:
// functionName.bind(thisArg, arg1, arg2, ...)

let billForPerson1=makeBill.bind(person1,12345,"xyz")
let billForPerson2=makeBill.bind(person2,23456,"abc")
let billForPerson3=makeBill.bind(person3,34567,"pqr")

billForPerson1()  //Bill for Prince: Salary is 12345 and Address is xyz
billForPerson2()  //Bill for Rohit: Salary is 23456 and Address is abc
billForPerson3()  //Bill for Ankit: Salary is 34567 and Address is pqr

//difference between call,apply and bind
//| Method | Invocation Time       | Arguments Format               | Return Value                  |
//|--------|-----------------------|-------------------------------|-------------------------------|
//| call   | Immediately invokes   | Individual arguments          | Result of the function call    |
//| apply  | Immediately invokes   | Array or array-like object    | Result of the function call    |
//| bind   | Returns a new function| Individual arguments          | New function with bound this   |
//& Note:-
// - The call() and apply() methods are used to invoke functions immediately, while the bind() method is used to create a new function that can be called later.
// - The call() method takes individual arguments, while the apply() method takes an array or array-like object as arguments.
// - The bind() method returns a new function with the specified this value and arguments bound to it.

//!----------------- End of Call, Apply and Bind Method in JavaScript -----------------!


//! Date Object in JavaScript
// - The Date object in JavaScript is a built-in object that provides methods for working with dates and times.
// - It allows you to create, manipulate, and format dates and times in various ways.
// - You can create a new Date object using the Date() constructor, which can take various arguments to specify the date and time.

let date1=new Date() //current date and time
console.log(date1)

//methods of Date object
console.log("Get Date:",date1.getDate()) //Get Date
console.log("Get Month:",date1.getMonth()+1) //Get Month (0-11, so we add 1)
console.log("Get Full Year:",date1.getFullYear()) //Get Full Year
console.log("Get Hours:",date1.getHours()) //Get Hours
console.log("Get Minutes:",date1.getMinutes()) //Get Minutes
console.log("Get Seconds:",date1.getSeconds()) //Get Seconds
console.log("Get Day:",date1.getDay()) //Get Day (0-6, 0=Sunday, 1=Monday, ..., 6=Saturday)


let d1=new Date()
let d2=new Date("2026-12-25") //Specific date and time
let d3=new Date(0) //Epoch time (January 1, 1970)
console.log(d1)
console.log(d2)
console.log(d3)

 let bd1=new Date("2004-09-13")
 let bd2=new Date("2003-05-08")

 console.log(bd1-bd2) //difference in milliseconds

//!----------------- End of Date Object in JavaScript -----------------!
