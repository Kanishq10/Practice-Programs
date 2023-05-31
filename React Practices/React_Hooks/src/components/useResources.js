import {useEffect, useState} from 'react';
import axios from 'axios';

//custom hook 
const useResources=(resourceName)=>{
    const [resources,setResource]= useState([]);
  
    const fetchResources= async (resourceName)=>{
      const response= await axios.get(`https://jsonplaceholder.typicode.com/${resourceName}`);
      setResource(response.data);
    }
  
    useEffect(()=>{
      fetchResources(resourceName)
    },[resourceName])  //it only runs when this value changed
    // using array is necessary otherwise it will give some error
  
    return resources;
  }

  export default useResources;