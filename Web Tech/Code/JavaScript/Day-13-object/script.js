//! object

//~ object literal way
let obj={
    name:"John",    
    age:30,
    city:"New York"
};
console.log(obj)

//~ constructor Way
let obj2 =new Object({sal:1234,address:"xyz"})
console.log(obj2)

//~ Object.create way - creates a new object, using an existing object as the prototype of the newly created object.
let obj3=Object.create(obj2)

console.log(obj3)  //
console.log(typeof obj3)
console.log(obj3.sal)
console.log(obj3.address)

//Prototype
//- It is an object. In js,every object has an  internal link to another object called prototype.

//- Prototypal Inheritance
//-Prototypal Inheritance is a feature in js where objects inherit properties and methods directly from other objects, forming a prototype chain.

// - It is a feature in js used to add methods and properties in objects.
// - It is a method by which an object can inherit the properties and methods of another object.
// console.log(String.prototype.__proto_) //Object prototype
// console.log(Array.prototype)
// console.log(Object.prototype)

// let obj4=new Object({id:1,fruit:"apple"})
// console.log(obj4.__proto_)


// console.log(obj4.__proto__.__proto__) //null

// let str=new String("hello world")
// console.log(str.__proto__)  //String prototype
// console.log(str.__proto__.__proto__) //Object prototype
// console.log(str.__proto__.__proto__.__proto__) //null

let objj={}


function constructorFn(id,name,add){
    console.log(this)
    this.no=id
    this.name=name
    this.address=add
}
let objn =new constructorFn(101,"Prince","xyz")

console.log(objn)


//! use stick: the purpose of using 'use strict' is to enforce stricter parsing and error handling in your JavaScript code. It helps catch common coding mistakes and "unsafe" actions, such as assigning values to undeclared variables, which can lead to bugs and unintended behavior.
// 'use strict'

// console.log(this) //undefined in strict mode

//! this: pointing mechanism. It will point to the object.
//Under non-stick,inside the function,it will point to the window
//under  strick strick mode,nside the function,it will point to undefined

// "use strict"
// console.log(this)

function abc(){
    console.log(this)
}
abc()

let objjj={
    id:1,
    print:function(){
        console.log(this)
    },
    print2:()=>{
        console.log(this)
    }
}


objjj.print()  //points to objjj
objjj.print2() //points to window/global object because arrow function do not have their own this

//! object.defineProperty():- It is used to define a new property directly on an object, or modify an existing property on an object, and return the object.
let objDef={}
Object.defineProperty(objDef,'id',{
    value:101
})

console.log(objDef)

//! object.defineProperties():- It is used to define new or modify existing properties directly on an object, returning the object.
let objDef2={}
Object.defineProperties(objDef2,{
    "id":{
        value:201
    },  
    "name":{
        value:"prince"
    }
})
console.log(objDef2)

//! Object methods
let objMeth={
    id:1,
    name:"abc",
    city:"xyz"
}
// 1. Object.keys():- It is used to get all the keys of an object as an array.

console.log(Object.keys(objMeth)) //keys
// 2. Object.values():- It is used to get all the values of an object as an array.
console.log(Object.values(objMeth)) //values

// 3. Object.entries():- It is used to get all the key-value pairs of an object as an array of arrays.
console.log(Object.entries(objMeth)) //entries


// 4. Object.fromEntries():- It is used to create a new object from an array of key-value pairs.
//Returns a new object whose properties are given by the entries of the iterable object.
let arr=[["id",1],["name","abc"],["age",15]]
console.log(Object.fromEntries(arr)) //object
