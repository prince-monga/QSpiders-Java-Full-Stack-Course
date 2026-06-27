import React from 'react'

const Skills = () => {
    const skills=[
        "Html",
        "CSS",
        "JS",
        "React"
    ]
  return (
    <>
    {
    skills.map((skill)=>{
        return (
            <div key={skill}>
                <h1>{skill}</h1>
            </div>
        )

    })
}
    </>
  )
}

export default Skills