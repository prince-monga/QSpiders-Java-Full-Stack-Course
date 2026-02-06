import React, { useMemo } from 'react'

export const UseMemo = () => {
    let [count, setCount] = React.useState(0)
    let [display, setDisplay] = React.useState(0)
    console.log("UseMemo Component Rendered:"+setDisplay)
    let expensiveCalculation = ()=>{
        console.log("Expensive Calculation")

        let res = 0;
        for(let i=0; i<1000000; i++){
            res += i;
        }
        return res;
    } // dependency array is empty, so this calculation will only run once when the component mounts, and the result will be memoized and reused on subsequent renders, unless the dependencies change. In this case, since there are no dependencies, the expensive calculation will only run once and its result will be reused on every render of the component.
    //res()

    useMemo(expensiveCalculation, [count]) // we can also write like this
  return (
    <div>
        <h1>UseMemo Component</h1>
        <h2>Count: {count}</h2>
        <button onClick={()=>setCount(count+1)}>Increase Count</button>
        
        <h2>Display: {display}</h2>
        <button onClick={()=>setDisplay(display+1)}>Increase Display</button>
    </div>
  )
}
