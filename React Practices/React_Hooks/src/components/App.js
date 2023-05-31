import React ,{useState} from 'react';

import ResourceList from './ResourceList';


const App=()=>{
  const [resourceName,setResource]=useState('posts');

  return(
    <React.Fragment>
    <button onClick={()=> {setResource('posts' )}}>Posts</button>      {/* if using inline function first use arrow function to wrap it otherwise it will run infinitly*/}
    <button onClick={()=> {setResource('todos')}}>Todos</button>
    <ResourceList resourceName={resourceName}/>
    </React.Fragment>
  )
}
export default App;