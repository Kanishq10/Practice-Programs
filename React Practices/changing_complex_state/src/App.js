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
      return{
        ...prevValue,
        [name] :value      //add value of name with this syntax , otherwise it will take name as string and treat as key and will not take value in it
      }
    });
  }
  
  
  const[items,setItems]=useState([]);
  const [counter,upadateCounter]=useState(0);

  function addItem(prevItem){
    upadateCounter(counter=> counter+1);
    setItems((prevItem)=>{
	      return [...prevItem,counter];  //adding random value
	    })
      console.log(items);
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
      <button onClick={addItem}>ADD Item</button><br/>
      <button type="submit">Submit</button>
    </div>
  );
}

export default App;
