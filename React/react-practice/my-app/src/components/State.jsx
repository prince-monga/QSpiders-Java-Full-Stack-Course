import React from 'react'

const State = () => {
    const inc=()=>{
        setCount(count+1);
    }
     const dec=()=>{
        setCount(count-1);
    }

    const [count,setCount]=React.useState(9);
  return (
<>
<h3>Increment and Decrement counter</h3>
<p>Counter value: {count}</p>
<hr/>
<button onClick={inc}>Increment</button>
<button onClick={dec}>Decrement</button>

</>
  )
}

export default State