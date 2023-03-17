class Bands{
    private dataState:string[]

    constructor(){
        this.dataState=[]
    }
//these doesn't need to be called they will automatically call when interacting
    public get data():string[]{
        return this.dataState
    }

    public set data(value: string[]){
        if(Array.isArray(value) && value.every(el=>typeof el==='string')){
                this.dataState=value
                return
            }
            else throw new Error('Param is not an array of string')
    }
}

const MyBands= new Bands()
MyBands.data=['Neil','led zep']
console.log(MyBands.data);    //automatically cal getter, no need to call
MyBands.data=[...MyBands.data,"Rope"]
MyBands.data=[...MyBands.data,'Carl']
console.log(MyBands.data);
