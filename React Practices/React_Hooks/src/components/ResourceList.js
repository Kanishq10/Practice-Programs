import useResources from './useResources';
import React from 'react';
const ResourceList=({resourceName})=>{

  const resource=useResources(resourceName);
    return (
      <ul>
        {resource.map(resource => (
          <li key={resource.id}>{resource.title}</li>
        ))}
      </ul>
    )
  }

export default ResourceList;
