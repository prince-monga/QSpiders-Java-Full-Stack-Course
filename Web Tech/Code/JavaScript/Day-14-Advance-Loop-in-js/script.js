//! Advance For loop in js

// - It is a feature in js used to iterate over iterable objects like arrays, strings, maps, sets, etc.


//~! for...of loop
// - It is used to iterate over iterable objects like arrays, strings, maps, sets, etc.
// - It returns the value of the iterable object.


// //! for-in :- It is used itreate object only
// let obj={
//     id:1,
//     eName:"A",
//     age:12,
//     sal:12345,
//     skills:"HTML"
// }

// for(let key in obj){
//     console.log(key," : ",obj[key])
// }


// //! for of -- it is use in arr,string, set

// //~ array
// let arr=[1,"A",true,null,"qwerty"]
// for(let element of arr){
//     console.log(element)
// }


// //~ string
// let str="qwerty"

// for(let abc of str){
//     console.log(abc)
// }


// //~ Set- it is store unique values not allow duplicate values

// let newSet=new Set([1,2,3,3,3,4,6,9,2])
// for(let data of newSet){
//     console.log(data)
// }


//! forEach()
// let arr=["A","B","C","D","E"]

// arr.forEach((val,index,element)=>{
//     console.log(val,index,element)
// })

//! Destructuring in for...of loop
// - It is used to unpack values from arrays or properties from objects into distinct variables.


//~ array destructuring
let arr=[1,3,"Prince",true,["Html","CSS","JS"],true,null]


let [a,b,c]=arr
console.log(a,b,c) //1 3 "Prince"

let [a1,b1,c1,...rest]=arr
console.log(a,b,c,rest) //1 3 "Prince" [true, Array(3), true, null]
// - Here ...rest is used to collect the remaining elements of the array into a new array.


let [a2,b2,c2,...remaining]=arr
console.log(a,b,c,rest) //1 3 "Prince" [true, Array(3), true, null]
// - Here ...remaining is used to collect the remaining elements of the array into a new array.


//spread operator in for...of loop
let arr2=[...arr]
console.log(arr2) //[1, 3, "Prince", true, Array(3), true, null]


// ... - spreading operator is used to spread the elements of an array into individual elements.


//! Object Destructuring-
// let objDef={
//     id:1,
//     name:"prince",
//     age:15,
//     skills:["HTML","CSS","JS"]
// }

// let {id,name,age}=objDef
// console.log(id,name,age) //1 "prince" 15
// console.log(objDef) //{id: 1, name: "prince", age: 15, skills: Array(3)}


// - Here {id,name,age} is used to unpack the properties of the object into distinct variables.


//! destructing inside function
let obj={
    id:1,
    name:"prince",
    age:15,
    skills:["HTML","CSS","JS"]
} 

function fun(data){
    let {obj}   =data
    console.log(obj)
    let{name}=obj
    console.log(name)
}

fun(obj)


//! rest  parmeter in destructuring
let objRest={
    id:1,

    name:"prince",
    age:15,
    skills:["HTML","CSS","JS"],
    city:"xyz",
    sal:12345
}

function funRest({id,name,...rest}){
    console.log(id,name,rest)
}
funRest(objRest) //1 "prince" {age: 15, skills: Array(3), city: "xyz", sal: 12345}
// - Here ...rest is used to collect the remaining properties of the object into a new object.
//! spread operator in object destructuring
