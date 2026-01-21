import React, { Fragment } from 'react'

const ProsChild = ({userMedia}) => {
    console.log(userMedia);
    const {id,description,likes,type} = userMedia[0];
    console.log(id);
  return (
    <Fragment>
     <h1>hey child</h1>
    {
        userMedia.map((data)=>(
            <Fragment key={data.id}>
                <h1>{data.id}</h1>
                <h2>{data.description}</h2>
                <h3>{data.likes}</h3>
                <h3>{data.type}</h3>
                <Fragment>
                {data.comments.map((comm,index)=>(
                    <Fragment key={index}>
                        <h4>{comm.userId}</h4>  
                </Fragment>
                ))}
                </Fragment>
            </Fragment> 

        ))
    }
    </Fragment>
  )
}

export default ProsChild