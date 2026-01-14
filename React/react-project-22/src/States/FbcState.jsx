import { useState } from 'react'

export default function FbcState() {
    let a=0;
    let [data,setData]=useState(a);
   
 function increment(){
    setData(data+1);
    console.log(data);
 }
  return (
    <div>
      <h1> {data} </h1>  
    <button onClick={increment}>Increment</button>
    </div>
  )
}
