import React from 'react'
import { MyContext } from './Con2Parent'

const Con2Child2 = () => {
    let {data,data2}=React.useContext(MyContext);
  return (
    <div>
        <h1>Con2Child2:</h1>
        <h2>{data}</h2>
        <h2>{data2}</h2>
    </div>
  )
}

export default Con2Child2