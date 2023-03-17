interface Musician{
    name:string,
    instrument:string,
    play(action: string): string
}

class guitarist implements Musician{
    name: string
    instrument: string

    constructor(name:string , instrument:string){
        this.name=name
        this.instrument= instrument
    }

    play(action: string){
        return `${this.name} ${action} the ${this.instrument}`
    }
}

const page= new guitarist('Jim','guitar')
console.log(page.play('strums'));
