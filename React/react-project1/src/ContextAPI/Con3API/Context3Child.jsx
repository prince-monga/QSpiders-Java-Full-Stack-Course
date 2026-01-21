import React from 'react'
import { useContext } from 'react'
import { MyContext3 } from './ContextAPI3'

const Context3Child = () => {
    let globalData=useContext(MyContext3)
  return (
    <div>Context3Child:
        <h1>Context3Child: {globalData}</h1>
        
    </div>
  )
}

export default Context3Child