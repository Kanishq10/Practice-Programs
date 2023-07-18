const animals = [
  {
    name: "cat",
    sound: "meow",
    feedingRequirement:{
        food:2,
        water:4
    }
  },
  { name: "dog",
   sound: "bow",
   feedingRequirement:{
    food:2,
    water:4
   }
 },
];

function useAnimals(animal){
    return [
        animal.name,
        function(){
            console.log(animal.sound);
        }
    ]
}
export default animals;
export {useAnimals};
