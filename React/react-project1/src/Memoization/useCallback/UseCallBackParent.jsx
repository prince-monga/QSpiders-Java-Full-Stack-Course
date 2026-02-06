import React from 'react'


import UsecCalledbackChild from "./UsecCalledbackChild";


const UseCallBackParent = () => {
    let [count, setCount] = React.useState(0)

    // let expensiveCalculation = ()=>{
    //     console.log("Expensive Calculation")
    // }
    let expensiveCalculation = React.useCallback(()=>{
        console.log("Expensive Calculation")
    }, []) // dependency array is empty, so this calculation will only run once when the component mounts, and the result will be memoized and reused on subsequent renders, unless the dependencies change. In this case, since there are no dependencies, the expensive calculation will only run once and its result will be reused on every render of the component.

  return (
    <div>

        <h1>UseCallBackParent Component</h1>
        <h2>Parent, count : {count}</h2>
        <button onClick={()=>setCount(count+1)}> Increase  Count</button>
        <UsecCalledbackChild expensiveCalculation={expensiveCalculation}/>
    </div>
  )
}

export default UseCallBackParent