import React from 'react'
import DefaultChild from './DefaultChild';

const DefaultParent = () => {
    let str="parent data";
  return (
    <div>DefaultParent
        <DefaultChild  str={str}/>
    </div>
  )
}

export default DefaultParent