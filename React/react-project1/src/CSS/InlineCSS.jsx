import React from 'react'
import { InlineCSS } from './InlineCSS';

export const InlineCSS = () => {
    let h1style={
        color:"blue",
        fontSize:"30px",
        border:"2px solid blue",
        padding:"20px"
    }
  return (
    <div>
        <h1 style={{color:"red",fontSize:"20px",border:"2px dotted red",padding:"10px"}}>
            Inline Css Example 1
        </h1>
        {/* <h1 style={h1style}>
            Inline Css Example 2
        </h1> */}
    </div>
  )
}
