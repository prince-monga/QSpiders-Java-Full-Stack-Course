import React from 'react'
import Child from './Child'

const Parent = (props) => {
    let {str,obj,isDev}=props;
  return (
    <div>
        <h3>---div from Parent---</h3>
        <h1>{str}</h1>
        <h2>{obj.name} : {obj.age}</h2>
        <h2>{isDev.toString()}</h2>
      <Child str={str} obj={obj} isDev={isDev}/>
    </div>  
  )
}

export default Parent