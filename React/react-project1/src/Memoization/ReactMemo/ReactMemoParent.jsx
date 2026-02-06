import React from 'react'
import { ReactMemoChild } from './ReactMemoChild'

const ReactMemoParent = () => {
    let [count, setCount] = React.useState(0)
  return (
    <div>
        <h1>Hello from ReactMemoParent</h1>
        <h2>Parent,count : {count}</h2>
        <button onClick={()=>setCount(count+1)}> Increase  Count</button>
        <ReactMemoChild />
    </div>
  )
}

export default ReactMemoParent