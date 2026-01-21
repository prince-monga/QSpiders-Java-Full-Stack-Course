import React from 'react'

export let MyContext3 = React.createContext();
const ContextAPI3 = (props) => {
    let data="Global data"

  return (
    <div>
        <h1>Context API 3</h1>
        <MyContext3.Provider value={{data}}>
       {props.children}
        </MyContext3.Provider>
    </div>
  )
}

export default ContextAPI3