//~Map
//! Calls a define calback function on eaxh element off an array, and returns an array conatons the result

//! It doesn't  modifies the orginal array


// let arr=  [10,20,50,100,250]

// let res=arr.map((m)=>{
//     return m                //itrate the array vales
// })

// console.log(res)

// function cb(m){
//     return m+" JavaScript"
// }

// let res2=arr.map(cb)
// {
//      console.log(res2)
// }



//Filter() -- returns the elements of an array that meet the condition specified in a callback function.
//! It doesn't  modifies the orginal array
// let marks=[56,37,23,88,91,65]
// let passingMarks=marks.filter((m)=>{
//     return m>40
// })
// console.log(passingMarks)


// let no=[3,5,8,10,15,21,30,46]

// console.log(no)

// let even=np.filter((m)=>{
//     return m%2===0 //check even when even then store even varivble
// })

// console.log(even)
// console.log(no)


//! reduce(callbackfn, initialVal (optional) )
// it returns single value
//callback(accumulator,curent,cureentVal)

// let no=[1,2,5,7,10]
// let res=no.reduce((acc,currVal)=>{
//     return acc+currVal
// },20)
// console.log(res)



//Accending order
arr=[4,5,12,1,5,7,34]
let res=arr.sort((a,b)=>{
    return a-b
})
console.log(res)
let res1=arr.sort((a,b)=>{
    console.log(a+" "+b)
    return b-a
})
console.log(res1)



//Object -->>>>>>It is non-primitve data type
               // - It stores the data in the form of  key and value pairs 
               // - key and value paires are sperated by colon
               // - key and value paies together known as property 
               // -  two property are sperated by coma (,)



let empDetails={
    empId:1,
    empName:"Prince",
    age:22,
    isMarried:false,
    skills: ["html","css","js","react","java","sql",{exp:"null"}],
    adress:{
        pincode:125102,
        hNo:23,
        city:"Sirsa",
        details:[{details:()=>{
            console.log("mujhe sona h neend aa rhi ")
        }}]
    },
        printName:()=>{
        console.log("my name is prince")
    }
}

//read data
console.log(empDetails)
     
console.log(empDetails.skills[3])

console.log(empDetails.skills[6].exp)

console.log(empDetails.adress.details[0].details())

//update data
console.log(empDetails.empName)
empDetails.empName="Priy"      //upadte
console.log(empDetails.empName) 


//delete data
delete empDetails.age
console.log(empDetails)
 