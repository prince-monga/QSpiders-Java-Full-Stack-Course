import React from 'react'

const ControlForm1 = () => {
    function handleFirstNameChange(e){
        console.log("First Name Changed:",(e.target.value).toUpperCase());
    }
     function handleLastNameChange(e){
        console.log("Last Name Changed:",(e.target.value).toUpperCase());
    }
    function handleSubmit(e){
        e.preventDefault();
        console.log(FirstName,LastName);
    }
  return (
    <div>
        <form onSubmit={handleSubmit}>
    <label >First name:</label>
    <input type="text" id="fname" name="fname" value={FirstName} onChange={handleFirstNameChange}/>
  <label >Last name:</label>
  <input type="text" id="lname" name="lname" value={LastName} onChange={handleLastNameChange}/>
  <br />
  <input type="submit" value="Submit" />
</form>
        </div>
  )
}

export default ControlForm1