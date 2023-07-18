import { useState } from "react";
import "./App.css";

function App() {
  //multiple states in one line
  const [fullName, setFullName] = useState({
    fname: "",
    lname: "",
  });

  function handleChange(event) {
    // let input=event.target.name;
    // let output=event.target.value;
    // console.log(input,output);
    // if(input==="fname"){
    //   setFullName({fname:output});
    // }
    // else if(input==="lname"){
    //   setFullName({lname:output});
    // }

    const { value, name } = event.target; //destructuring the value from target using object destructuring

    setFullName((prevValue) => {
      //prevValue have old record of old state
      //if you don't write it in this way it will replace other variable value with empty
      if (name === "fname") {
        return {
          fname: value,
          lname: prevValue.lname,
        };
      } else if (name === "lname") {
        return {
          fname: prevValue.fname,
          lname: value,
        };
      }
    });
  }

  return (
    <div className="container">
      <h1>
        Hello {fullName.fname+" "+fullName.lname}
      </h1>
      <input
        onChange={handleChange}
        name="fname"
        type="text"
        placeholder="What's your first name?"
        value={fullName.fname}
      />
      <br/>
      <input
        onChange={handleChange}
        name="lname"
        type="text"
        placeholder="What's your last name?"
        value={fullName.lname}
      />
      <button type="submit">Submit</button>
    </div>
  );
}

export default App;
