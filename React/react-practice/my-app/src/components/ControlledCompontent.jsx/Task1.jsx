import React, { useState } from 'react'
import Password from './../ConditionalRendering.jsx/Password';

const Task1 = () => {
 const [name,setName]=React.useState("");
 const [email,setEmail]=React.useState("");
 const [password,setPassword]=React.useState("");
 const [phone,setPhone]=React.useState("");
 const change=(e)=>{
                setName(e.target.value);
              }
  return (
    <div>
        <h2>Task 1: Controlled Component</h2>
        <form >
            <input type="text" placeholder='Enter your name' value={name} onChange={change}/>
            <input type="email" value={email} onChange={(e)=>setEmail(e.target.value)}  />
            <input type="password" value={password}  onChange={(e)=>setPassword(e.target.value)}  />
            <input type="number" placeholder='Enter your Phone Number' value={phone} onChange={(e)=>setPhone(e.target.value)}  />  
            <input type="submit" value="Submit" />
        </form>
      <h3>Hello, {name}!</h3>
      <h3>Email: {email}</h3>
      <h3>Phone: {phone}</h3>
      <h3>Password: {password}</h3>
      

    </div>
  )
}

export default Task1