import React from 'react'

const UsecCalledbackChild = () => {
    console.log("UsecCalledbackChild Rendered")
  return (
    <div>UsecCalledbackChild</div>
  )
}

export default React.memo(UsecCalledbackChild)