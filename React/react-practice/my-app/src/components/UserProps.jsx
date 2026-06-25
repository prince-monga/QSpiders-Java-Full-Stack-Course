import React from 'react'

export const UserProps = ({name,age,city,isLogin,skills}) => {
  return (
    <div>
        
     {/* Name: {props.name}
        Age: {props.age}
        City: {props.city} */}


    <h1>Destructuring</h1>
      Name: {name}
        Age: {age}
        City: {city}

<h2>Login Status</h2>
<p>Is Login: {isLogin ? 'Yes' : 'No'}</p>


<h2>USer Skills</h2>
{
skills.map((skill,index)=>{
    return <p key={skill}> {index+1} - {skill}</p>
})
}

    </div>
  )
}
