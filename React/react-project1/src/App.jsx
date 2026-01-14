
import React from 'react'
import Fbc from './typeOfComponent/fbc'
import Cbc from './State/Cbc'   
import { StateInFbc } from './typeOfComponent/StateInFbc'
import StateInFbc2 from './State/StateInFbc2'
import Grand from './Props/Grand'
import PropsParent from './Props/PropsParent'
import { AssinmentParent } from './Props/AssinmentParent'

const App = () => {
  return (
    <div>
      {/* <h1>React krle bhai yha kya dekh rha</h1>
      <Fbc/>
      <Cbc/> */}
      {/* <StateInFbc/>
      <StateInFbc2/> */}
      {/* <Cbc/>
      <Grand/> */}
      <PropsParent/>
      <AssinmentParent/>
    </div>
  )
}

export default App
