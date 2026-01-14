// //& Timing Function in JS
// //~setTimeout() :-

// setTimeout(()=>{
//     console.log("Task1");
// },2000);
// console.log("Task2")
// console.log("Task3")
// let btn=document.querySelector("button");
// // btn.addEventListener("click",()=>{
// //     clearTimeout(clear)
// // })

// //~ setInterval():-

// // let i=0
// // let clr=setInterval(()=>{
// //     i++
// //     console.log("task completed",i)
// // },1000)
// // btn.addEventListener("click",()=>{
// //     clearInterval(clear)
// // })

// //~ callback hell
// setTimeout(()=>{
//     console.log("User logged In")
//     setTimeout(()=>{
//     console.log("User Profile fetched")
//     setTimeout(()=>{
//     console.log("User place an order")
//     setTimeout(()=>{
//     console.log("Payment Succesfully")
//     setTimeout(()=>{
//     console.log("Order Recived")
    
// },1000)
// },1000)
// },1000)
// },1000)
// },1000)

// //~ promises- It is an object it tells the about the eventual completion or failure asynchouners Task
// //It accpets two arrgurments-- 1st is resolve and 2nd is rejeceed
// //it accept one callback function which except two arrgument  1st is resolve and 2nd is rejeceed
// let pro=new Promise((res,rej)=>{
//     setTimeout(()=>{
//     let result=true;
//     if(result){
//         res("promise is resolved")
//     }
//     else{
//         rej("promise is not resolved")
//     }
// },2000)
// })

// console.log(pro)

// //~there are three state of the promises
// //*1st- fullfilled 
// //*2nd- rejected 
// //*3rd- pending


// //~promises instance method
// //* then-It will execute when the promises fulfilled
// //* catch-It will execute when the promises is rejected
// //* finally-It will execute in both condition, either the promises fullfiled or rejected.

// let party=new Promise((res,rej)=>{
//     let partStatus=true;

//     if(partyStatus){
//         rej("You will give the party")
//     }
//     else{
//         rej("You will not give the party")
//     }
// })
// party
//     .then((res)=>console.log(res))
//     .catch((rej)=>console.log(rej))
//     .finally(console.log("First get the placement"))


//& Promises static method
//* Promises static method are the helper method provided by the js to handle multiple promisies together in differnet stategies.
//~Type of Promise Static method
//^ 1. Promise.all
//^ 2. Promise.allsettled
//^ 3. Promise.race
//^ 4. Promise.any

//^ 1. Promise.all:- 
//? This methods  takes many promises together and returns one new promise 
//? If all the promise are successefull then new promise gives as an array of there reults
//? if any one promise is fails then the promise fails imeditaitlly 


let p1=new Promise((res,rej)=>{
    setTimeout(()=>{
        res("task 1 completed")
    },7000);
})

let p2=new Promise((res,rej)=>{
    setTimeout(()=>{
        res("task 2 completed")
    },2000);
})

let p3=new Promise((res,rej)=>{
    setTimeout(()=>{
        rej("task 3 completed")
    },3000);
})

// Promise.all([p1,p2,p3])
// .then((result)=>{
//     console.log(result);
// })
// .catch((error)=>{
//     console.log("error");
// })

//^ 2. Promise.allsettled
//? It waits for all the promise to settled down  no matter it successed of failed 
//? It return an array containing all the result of promises.


// Promise.allSettled([p1,p2,p3])
// .then((result)=>{
//     console.log(result);
// })
// .catch((error)=>{
//     console.log("error");
// })


//^ 3. Promise.race
//? This methods takes multiple promises and reuturns new promises that finshes 1st decides the result of promises it can be resolved or rejected

// Promise.race([p1,p2,p3])
// .then((result)=>{
//     console.log(result);
// })
// .catch((error)=>{
//     console.log("error");
// })

//^ 4. Promise.any
//? This methods takes multiple promises and reuturns new promises that it returns result of the 1st promise that successed 
//? if all the promises fails it returns an error
Promise.any([p1,p2,p3])
.then((result)=>{
    console.log(result);
})
.catch((error)=>{
    console.log("error");
})


//~ fetch :
//? It is the javscript method which is used for fetching the data from the  server.
//? It returns a promise.
// let apiData=fetch("https://api.github.com/users")

// apiData.then((res)=>{
//     return res.json()
// })
// .then(actualData=>{
//     console.log(actualData)
// })


//~ Promise Channing
//? Promise Channing means using multiple .then method one after another where each .then method waits for the pervious promise to settle down.


//~ async await:
//? async is a keyword used before a function to make it returns a promise.
//? await is a keyword which is used inside async function to pause the excution utile the exection rejected 
//? await waits of a promise to settled / finsh and gives the result

async function apiData(){
    try{
    let data=await fetch("https:.github.com/users")
    let actualData=await data.json()
    console.log(actualData)
    }
    catch(error){
        console.log(error)
    }
}
apiData()