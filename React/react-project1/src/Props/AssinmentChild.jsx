import React, { Fragment } from 'react'

const AssinmentChild = ({users}) => {
    console.log(users);
  return (
 <>
 <h1>Props child</h1>
  {users.map((user)=>(
   <Fragment key={user.id}> 
    <h2>{user.name} </h2>
   </Fragment> 

  ))}
 </>
  )
}

export default AssinmentChild