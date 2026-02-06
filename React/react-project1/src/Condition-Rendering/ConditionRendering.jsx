import React from 'react'

export const ConditionRendering = () => {
    let [data,setData]=React.useState("a")

    if(data==="a"){
        return <h1>Data is A</h1>
    }
    else if(data==="b"){
        return <h1>Data is B</h1>
    }
    else if(data==="c"){
        return <h1>Data is C</h1>
    }
    else if(data==="d"){
        return <h1>Data is D</h1>
    }
    else{
        return <h1>No Matching Data Found</h1>
    }
  return (
    <div>ConditionRendering</div>
  )
}
