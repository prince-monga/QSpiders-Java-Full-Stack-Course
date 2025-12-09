// let arr=["priya","Diya","siya","muskan","roshni"]
// console.log(arr)
//Slice (start,end)

//it doenot affects the original array.
//it is used to remove elements from the array.


// let res=arr.slice(1,4)
// console.log(res) // ["Diya","siya","muskan"]


// let res1=arr.slice(1) //ending not define then start with index 1 and end last index 
// console.log(res1) //["Diya","siya","muskan","roshni"]


//splice
//it is  used for adding and removeing the elements
//it affects the original array

// let res=arr.splice(2,3)
// console.log(res)

// let res2=arr.splice(1,2,"abc","xyz","qwert")
// console.log(res2)


//flat(): It is used for converting the multi-dimensional array into a single dimensional array
// let arr2=[[[[[1,2,,"abc"]]]]]
// let res22=arr2.flat(Infinity)
// console.log(res22)

// //Reverse array

// let arr_orginal=[1,2,3,4,5,6]
// console.log(arr_orginal)
// console.log(arr_orginal.reverse())




//--------------Advanced Array Method------------//

//find() method- It return first matching element.
              //-If the elememnt is not found,it returnsundefined. It doesn't affects the original array.
              


// let arrr=[10,20,30,40,50,60]

// console.log(arrr)

// let ress=arrr.find((m)=>
// {
//     return m>22
// }
// )

// console.log(ress)

// console.log(arrr)
// let str ="Qspider"
// let rev=str.split("").reverse().join("") // "redipSQ" 
// console.log(rev)

//some(callbackfn): It checks whether at least one element in the array passes the test implemented by the provided function. 
// It returns a Boolean value.
//if condition is not matched then it returns false 
// let arr=[10,15,20,25,30]
// let res=arr.some((a)=>
// {
//     return a>18
// }

// )
// console.log(res) //true


//if condition is not matched then it returns false
// let arr=[10,15,20,25,30]
// let res=arr.some((a)=>
// {
//     return a>50
// }


// )
// console.log(res) //false


//Every(): It checks whether all elements in an array pass a test (provided as a function).
// It returns a Boolean value.
//if all the elements are matched then it returns true,otherwise false.
let arr=[10,15,20,25,30]
let res=arr.every((a)=>
{
    return a>5
}    
)
console.log(res) //true

