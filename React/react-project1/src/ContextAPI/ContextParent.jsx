import React from 'react'
import { ContextChild1 } from './ContextChild1'
import MyContext from './Context'

const ContextParent = () => {
    let data="Global Data from Parent using Context API"
  return (
    <div>
        <h1>ContextParent</h1>
        <MyContext.Provider value={data}>
            <ContextChild1/>
        </MyContext.Provider>
      
    </div>
  )
}

export default ContextParent