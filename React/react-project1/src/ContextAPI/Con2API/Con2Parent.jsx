import React, { createContext } from 'react'
import { Con2Child1 } from './Con2Child1'

export const MyContext = createContext();
const Con2Parent = () => {

  let data = "Data1 Hello from Con2Parent";
  let data2="Data2 from Con2Parent";
  return (
    <div>

        <h2>Con2Parent</h2>
{/*Step: 2 Provide the context value to child components */}
        <MyContext.Provider value={{data,data2}}>
        <Con2Child1/>
        </MyContext.Provider>
    </div>
    
  )
}

export default Con2Parent