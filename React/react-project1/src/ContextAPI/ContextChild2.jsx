import React from 'react'
import MyContext from './Context'

export const ContextChild2 = () => {
   let contextdata= React.useContext(MyContext)
console.log(contextdata);
  return (
    <div>ContextChild2:
        {contextdata}
    </div>
 
    
  )
}
       