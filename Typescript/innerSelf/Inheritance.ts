class coder {
    constructor(
        public readonly name: string, 
        public music: string, 
        private age: number, 
        protected lang: string = "TypeScript"
        ) {
        this.name = name;
        this.music = music;
        this.age = age;
        this.lang = lang;
    }
    public getAge(){
        return `Hello, I am ${this.age}`;
    }
}

const Dave=new coder('Dave','Roack',42)
console.log(Dave.getAge());


class WebDev extends coder{
    constructor(
        public computer :string,
        name: string,
        music: string,
        age: number
    ){
        super(name,music,age);
        this.computer=computer;
    }
    public getLang(){
        return `I write ${this.lang}`;
    }
}

const sara=new WebDev('Mac','Sara','tantra',43);
console.log(sara.getAge());
console.log(sara.getLang());


