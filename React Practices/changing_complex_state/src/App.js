import { useState } from "react";
import "./App.css";

function App() {
  //multiple states in one line
  const [contact, setContact] = useState({
    fname: "",
    lname: "",
    email: ""
  });

  function handleChange(event) {
    const { value, name } = event.target; //destructuring the value from target using object destructuring

    setContact((prevValue) => {
      //prevValue have record of old state
      //if you don't write it in this way it will replace other variable value with empty
      if (name === "fname") {
        return {
          fname: value,
          lname: prevValue.lname,
          email: prevValue.email
        };
      } else if (name === "lname") {
        return {
          fname: prevValue.fname,
          lname: value,
          email:prevValue.email
        };
      }
      else if(name==="email"){
        return{
          fname: prevValue.fname,
          lname: prevValue.lname,
          email: value
        }
      }
    });
  }

  return (
    <div className="container">
      <h1>
        Hello {contact.fname+" "+contact.lname}
      </h1>
      <p>
        {contact.email}
      </p>
      <input
        onChange={handleChange}
        name="fname"
        type="text"
        placeholder="What's your first name?"
        value={contact.fname}
      />
      <br/>
      <input
        onChange={handleChange}
        name="lname"
        type="text"
        placeholder="What's your last name?"
        value={contact.lname}
      /><br/>
      <input
        onChange={handleChange}
        name="email"
        type="email"
        placeholder="What's your Email?"
        value={contact.email}
      /><br/>
      <button type="submit">Submit</button>
    </div>
  );
}

export default App;
