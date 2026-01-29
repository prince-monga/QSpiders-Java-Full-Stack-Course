import React from 'react'
let data=["Notification","Message","Alert","Warning"]
export const ConditionRendering3 = () => {
    let [message,setMessage]=React.useState(data)
    console.log(message.length);
  return (
    <div>ConditionRendering3:
    {/* //ternary operator */}
    {message.length>1 ? <sup>{message.length}</sup> : "No New Message"}
    {/*  Short-circuit operator */}
    {message.length>1 && <sup>{message.length}</sup>}   
     </div>

  )
}
