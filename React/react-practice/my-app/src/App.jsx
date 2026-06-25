import Header from "./components/Header.jsx";

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
      
     
    </div>
  );
}

export default App;