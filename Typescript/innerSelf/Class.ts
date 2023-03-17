class Person{
    private readonly name:string;
    age: number;
    futureUse!: string;     //assertion , not initialising right now
    public static count:number=0;   //it does not appply to instaneous of a class, it applies to class directly 
    public static  inCount(){
        count+=1;
    }

    constructor(name: string);
    constructor(name: string, age: number);
    constructor(name: string, age: number);
    constructor(name: string, age?: number,) {
      this.name = name;
      this.age = age || 0;
      count=count+2;
    }

    greet(){
        console.log("Welcome");
    }

}

const p=new Person("Kani");
p.greet();
Person.inCount();
Person.inCount();
console.log(Person.count);
