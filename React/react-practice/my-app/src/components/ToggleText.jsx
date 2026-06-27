import React from 'react'

const ToggleText = () => {
    const [show,setShow]=React.useState(true);
    
  return (
    <>
     <p>{show ? "This text is visible" : "This text is hidden"}</p>
     <button onClick={() => setShow(!show)}>
       {show ? "Hide" : "Show"} Text
     </button>
    </>
  )
}

export default ToggleText