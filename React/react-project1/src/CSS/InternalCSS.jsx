import React from 'react'

const InternalCSS = () => {
  return (
   <>
   
   <style>
    {`
      .internalcss{
        color: green;
        font-size: 40px;
      }
    `}
   </style>

   <h1 className="internalcss">Internal CSS Example</h1>
   </>
  )
}

export default InternalCSS