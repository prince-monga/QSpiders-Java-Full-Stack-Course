import React from 'react'

const StudentList = () => {
    const students=[
        {id:1,name:"prince"},
        {id:2,name:"Arun"},
        {id:3,name:"Ravi"},
    ]
  return (
    <div>
        {
            students.map((student)=>{
                return(
                    <div key={student.id}>
                        <h3>{student.name}</h3>
                    </div>
                )
            })
        }
    </div>
  )
}

export default StudentList