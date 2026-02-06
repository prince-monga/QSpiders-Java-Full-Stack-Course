
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
import LifeCycleCbc from './lifeCycle/LifeCycleCbc'
import { useState } from 'react'
import { ConditionRendering } from './Condition-Rendering/ConditionRendering'
import ConditionRendering2 from './Condition-Rendering/ConditionRendering2'
import { ConditionRendering3 } from './Condition-Rendering/ConditionRendering3'
// import { InlineCSS } from './CSS/InlineCSS'
import InternalCSS from './CSS/InternalCSS'
import { Nav } from './CSS/MyntraTask/Nav'
import ExternalCss from './CSS/External-Folder/ExternalCss';
import Button from './CSS/ModuleBaseCSS/Button'
import ControlForm1 from './ControlledAndUnControlled/ControlForm1'
import ReactMemoParent from './Memoization/ReactMemo/ReactMemoParent'
import { UseMemo } from './Memoization/useMemo/UseMemo'
import UseCallBackParent from './Memoization/useCallback/UseCallBackParent'
const App = () => {

  let  [toggle, setToggle] = useState(true)
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
     {/* <ContextGrandparent/> */}

  {/* {toggle ? <LifeCycleCbc/> :"Component remove"}
  <br></br>
  <button onClick={()=>setToggle(!toggle)}>Toggle Component</button> */}
  {/* <ConditionRendering/>
  <ConditionRendering2/>
   <ConditionRendering3/> */}

   {/* <InlineCSS/> */}
   {/* <InternalCSS/> */}
   {/* <Nav/> */}
   {/* <ExternalCss/>
   <Button/> */}
{/* 
   <ControlForm1/> */}
{/* 
   <ReactMemoParent/>
   <UseMemo/> */}

   <UseCallBackParent/>
    </div>
  )
}

export default App
