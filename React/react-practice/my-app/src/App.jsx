import AgeChecker from "./components/ConditionalRendering.jsx/AgeChecker.jsx";
import Condition from "./components/ConditionalRendering.jsx/Condition.jsx";
import Password from "./components/ConditionalRendering.jsx/Password.jsx";
import Task1 from "./components/ControlledCompontent.jsx/Task1.jsx";
import EventHandling from "./components/EventHandling.jsx";
import Form from "./components/Form.jsx";
import Header from "./components/Header.jsx";
import Skills from "./components/Map/Skills.jsx";
import StudentList from "./components/Map/StudentList.jsx";
import State from "./components/State.jsx";
import ToggleText from "./components/ToggleText.jsx";
import { UserProps } from './components/UserProps';

function App() {
  return (
    <div>
        <Header/>

      <h1>Hello, World!</h1>
      <p>Welcome to my React app.</p>
      <h1>Topic 1 - Props </h1>
       <h2>User Login </h2>
      

      <UserProps name="karan" age="24" city="sirsa" isLogin={true} skills={["JS","React","Spring"]}/>
       
       
      <UserProps name="Prince" age="30" city="delhi" isLogin={false} skills={["Python","Django"]}/>
      
     <EventHandling/>
     <Form/>
     <State/>
     <ToggleText/>
     <Condition/>
     <AgeChecker/>
     <Password/>
<Skills/>
<StudentList/>
<Task1/>
    </div>
  );
}

export default App;