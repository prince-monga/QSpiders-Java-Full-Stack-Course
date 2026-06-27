import React from 'react'

const Condition = () => {
    const [show,setShow]=React.useState(false);
  
  return (
    <>
    {
        show ? <h1>Welcome Prince</h1> : <h1>Please Login</h1>
    }
    <button onClick={()=>setShow(!show)}>{show ? "Logout" : "Login"}  </button>
    </>
  )
}

export default Condition