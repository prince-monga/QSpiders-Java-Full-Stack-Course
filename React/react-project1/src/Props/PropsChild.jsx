import React, { Fragment } from 'react'

function PropsChild({data}) {
    console.log(data)
  return (
   <Fragment>
    props child
    {
        data.map((data)=>{
            console.log(data)
            let {id,name,sal}=data
            return(
                <Fragment key={id}>
                    <p>{id}</p>
                    <p>{name}</p>
                    <p>{sal}</p>
                </Fragment>
            )
        })
    }
   </Fragment>
  )
}

export default PropsChild