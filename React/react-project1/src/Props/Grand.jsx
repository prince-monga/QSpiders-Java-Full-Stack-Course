import React from 'react'
import Parent from './Parent'
const Grand = () => {
    let str="Data from Grand Parent";
    let obj={name:"Princ",age:24};
    let isDev=true
  return (
    <div>
       <h3>----div from Grand---</h3> 
        <h1>{str}</h1>
        <h2>{obj.name} : {obj.age}</h2>
        <h2>{isDev}</h2>
        <Parent str={str} obj={obj} isDev={isDev}/>
    </div>
  )
}

export default Grand