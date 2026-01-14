import React, { Fragment } from 'react'

const AssinmentChild = (users) => {
  return (
   <Fragment key={users.id}>
      {users.map(user => (
        <div key={user.id}>
          <h2>{user.name}</h2>
          <p>Email: {user.email}</p>
          <p>Age: {user.profile.age}</p>
          <p>Gender: {user.profile.gender}</p>
          <p>Address: {user.profile.address.street}, {user.profile.address.city}, {user.profile.address.zip}</p>
          <p>Hobbies: {user.hobbies.join(', ')}</p>
          <p>Active: {user.isActive ? 'Yes' : 'No'}</p>
          <p>Roles: {user.roles.join(', ')}</p>
        </div>
      ))}
   </Fragment>
  )
}

export default AssinmentChild