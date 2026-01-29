import React from 'react'

const ConditionRendering2 = () => {
     let [data,setData]=React.useState("b")

     switch(data){
        case "a":
            return <h1>Data is A</h1>
            break;
        case "b":
            return <h1>Data is B</h1>
            break;
        case "c":
            return <h1>Data is C</h1>
            break;
        case "d":
            return <h1>Data is D</h1>
            break;
        default:
            return <h1>No Matching Data Found</h1>
     }
    
  return (
    <div>ConditionRendering2</div>
  )
}

export default ConditionRendering2