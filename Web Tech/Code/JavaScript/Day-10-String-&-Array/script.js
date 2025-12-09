// repeat(count): Userd to repeat a string a specified number of times

let str="Qspider"
console.log(str.repeat(5))

// match(): Matches a string with a regulare experssion, and returns an
// array cataining the result of that  serch.

//let str2="I'm java developer";
//console.log(str2.match(a));

//seach(): Finds the first substring match in a regular experssion search.

//if the matching 




//Array: 
//It is non primitive data type.
//it is used to store multiple values, in a single varible.
//it can be homogenous as well as heterogenous,

//!CRUD- Create,read,update,delete

//---literal's way
let arr=[1,2,3,4,5] //Homogenous Array-if we storing similare type of data
let arr2=[1,"Qspider",true,4.5] //Heterogenous Array-if we storing differernt type of data

console.log(arr);
console.log(arr2);

//---Constructor's way
// let arr3=new Array(1,2,3,4,5); //create array
// console.log(arr3);
// let arr4=new Array(10); //Size of Array
// console.log(arr4);
// console.log(arr4.length());

// //---Array.of
// let arr5=Array.of(1,2,3,4,5);
// console.log(arr5);


//read
console.log(typeof arr[2])

//update
arr[3]="prine";
console.log(arr);

//delete
delete arr[2]
console.log(arr);
    
//Array Methods
//1.push(): it is used to add the element at the end of the array
let arr7=[1,2,3,4,5];
arr7.push(6);
console.log(arr7);

//2.pop(): it is used to remove the last element from the array
arr7.pop();
console.log(arr7);  


//3.unshift(): it is used to add the element at the beginning of the array
arr7.unshift(0);
console.log(arr7);

//delete all array elements
arr7.length=0;
console.log(arr7);