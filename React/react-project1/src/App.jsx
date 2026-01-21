
import React from 'react'
import Fbc from './typeOfComponent/fbc'
import Cbc from './State/Cbc'   
import { StateInFbc } from './typeOfComponent/StateInFbc'
import StateInFbc2 from './State/StateInFbc2'
import Grand from './Props/Grand'
import PropsParent from './Props/PropsParent'
import { AssinmentParent } from './Props/AssinmentParent'
import PopsParent from './Props/Props-Assinment/PopsParent'
import DefaultParent from "./Props/DefaultProps/DefaultParent";
import ContextParent from './ContextAPI/ContextParent'
import Con2Parent from './ContextAPI/Con2API/Con2Parent'
import ContextGrandparent from './ContextAPI/Con3API/ContextGrandparent'

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
      {/* <PropsParent/> */}
      {/* <AssinmentParent/>  */}

      {/* <PopsParent/> */}
    

   {/* <DefaultParent/> */}
   {/* <ContextParent/>
     */}

{/* 
     <Con2Parent/> */}
     <ContextGrandparent/>
    </div>
  )
}

export default App
