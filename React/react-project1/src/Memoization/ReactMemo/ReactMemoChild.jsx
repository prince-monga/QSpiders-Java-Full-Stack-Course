import React from 'react'

export const ReactMemoChild = React.memo(() => {
  return (
    <div>
    {console.log("Child Component Rendered")}
    
    <h2>ReactMemoChild</h2>
    </div>

  )
})
