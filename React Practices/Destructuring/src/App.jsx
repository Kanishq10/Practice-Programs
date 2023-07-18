import './App.css'
import Animals from './data'

function App() {
  console.log(Animals);
  const [cat, dog] = Animals;   //destructuring the array ,cat=arr[0]

  const [animal, makeSound] = useAnimals(cat);   //destructuring the return type of function, mark this hooks use like this
  console.log(cat);
  makeSound();

  console.log(useAnimals(cat));

  // const {sound,name,nothing}=cat;  //destructuring the object, name should be same as properities insided objects, name=cat.name
  // const {name:catName,sound: catSound} =cat;   //giving aliasing
  // console.log(catSound,catName,nothing);

  // const {name="Fluffy" ,sound= "Purr"}=cat;  //making and giving it default values , so if it not present we should have some values.

  console.log(name, sound);
  const { name, sound, feedingRequirements: { food, water } } = cat;  //extended destructuring

  console.log(food);


  return (
    <h1>Use Console, click F12</h1>
  )
}

export default App
