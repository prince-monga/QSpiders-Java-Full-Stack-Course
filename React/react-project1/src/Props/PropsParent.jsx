import React from 'react'
import PropsChild from './PropsChild'

const PropsParent = () => {
    let data=[
        {id:1,name:"abc",sal:1234},
        {id:2,name:"xyz",sal:1674},
        {id:3,name:"def",sal:1244},
        {id:4,name:"irr",sal:1764},
    ]
  return (
    <>
    <h1>qwert</h1>
    <h1>rtyu</h1>
    <PropsChild data={data}/>
    </>
  )
}

export default PropsParent