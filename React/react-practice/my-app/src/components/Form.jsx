import React from 'react'

const Form = () => {
    const onSub=(e)=>{
        alert("Form Submitted");
    }
    const [name,setName]=React.useState("");
    const [age,setAge]=React.useState("");
    const [city,setCity]=React.useState("");
  return (
    <>
    <form onSubmit={onSub}>
        <input type="text" placeholder='Enter Name' value={name} onChange={(e) => setName(e.target.value)} />
        <input type="text" placeholder='Enter Age' value={age} onChange={(e) => setAge(e.target.value)}  />
        <input type="text" placeholder='Enter City' value={city} onChange={(e) => setCity(e.target.value)} />
     
        <input type="submit" value="Submit" />
    </form>

    <h3>Hello, {name}! and age {age} and city {city}</h3>

    </>
  )
}

export default Form