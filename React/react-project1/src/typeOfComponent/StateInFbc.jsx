import React,{useState} from 'react'

export const StateInFbc = () => {
    //
   // let count = 0;  // variable
//    const increment =()=>{
//     count++;
//     console.log("Incremented Value:",count);
//    }
   
   //---useState Hook---
   let [count,updateCount] = useState(0); // state variable
   function increment(){
    updateCount(++count);
   }
  function decrement() {
    updateCount(--count);
   }
   
  return (
    <div>
        <h1>StateInFbc</h1>
        <h2>Counter: {count}</h2>
        <button onClick={increment}>Increment</button>
         <button onClick={decrement}>Decrement</button>
          <button onClick={()=>updateCount(0)}>Reset</button>
    </div>
  )
}
