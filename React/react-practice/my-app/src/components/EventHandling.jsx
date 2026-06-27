import React from 'react'

const EventHandling = () => {
    const onchange=(e)=>{
        console.log(e.target.value);
    }
    const click=()=>{
        alert("Button Clicked");
    }
  return (
    <div>
      <button onClick={click} >
        Click Me
      </button>

      <input type="text" onChange={onchange} />
      <hr />
      
    </div>
  )
}

export default EventHandling