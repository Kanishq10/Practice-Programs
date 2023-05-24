import React, { useState } from 'react';

function App() {
  const [name, setName] = useState('');      //we are destructuring here

  function doThis(event) {
    setName(event.target.value);
  }

  return (
    <div>
      <h1>Hello, {name}!</h1>
      <input type="text" value={name} onChange={doThis} />
    </div>
  );
}

export default App;
