import React from 'react'
import Contect3Parent from './Contect3Parent'
import ContextAPI3 from './ContextAPI3'
const ContextGrandparent = () => {
  return (
    <div>
<h1>Grand parent</h1>
<ContextAPI3>
    <Contect3Parent/>
</ContextAPI3>
    </div>


  )
}

export default ContextGrandparent