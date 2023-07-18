import { useState } from 'react';
import './App.css';

function App() {
  const [name, setName]= useState("");  //state and how we use it
  const [headingText,setHeading]= useState("");
  function handleChange(event){
    console.log(event.target.value);
    setName(event.target.value);
  }

  function handleSubmit(event){
    console.log(event.target);
    event.preventDefault();
    setHeading(name);
  }
  return (
    <div className='container'>
      <h1>Hello {headingText}</h1>
      <form onSubmit={handleSubmit}>
      <input onChange={handleChange} type="text" placeholder="What's your name?" value={name}/>
      <button type="submit">Submit</button>
      </form>
    </div>
  );
}

export default App;
