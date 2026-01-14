import React, { useState } from 'react'

const StateInFbc2 = () => {
    let [data, setData] =useState("Add to Cart");
    console.log(data)
    function changeData(){
        if(data==="Add to Cart"){
            setData("Remove from Cart");
        }else{
            setData("Add to Cart");
        }
  return (
    <div>
      <button onClick={changeData}>{data}</button>
    </div>
  )
}
}
export default StateInFbc2