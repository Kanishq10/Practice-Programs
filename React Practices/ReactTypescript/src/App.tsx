import { useState } from 'react'
import reactLogo from './assets/react.svg'
import viteLogo from '/vite.svg'
import './App.css'
import {Greet} from './components/Greet'
import { Mbutton } from './components/Button'
import { Person } from './components/Person'
import {dl} from './components/ReactNodee'
import { Heading } from './components/HeadingProps'
import {User} from './components/UseState'

function App() {
  const [count, setCount] = useState(0)
  const name = [
    {
      fn: "Kanishq",
      ln: "Sharma",
    },
    {
      fn: "Harishab",
      ln: "Kumar",
    },
    {
      fn: "Anand",
      ln: "Pandey",
    },
  ];
  return (
    <div className="App">
      <Greet name='Kanishq'></Greet>
      <Mbutton name='Ram' color='red'></Mbutton>
      <Person name={name}></Person>
      <dl>
        <Heading>Hello Baby</Heading>
      </dl>
      <User></User>
    </div>
  )
}

export default App
