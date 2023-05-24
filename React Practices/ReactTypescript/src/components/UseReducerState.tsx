import { useReducer } from "react"
type counterState={
    count:number;
}
type counterAction={
    count:string,
    payload?:number
}

const initialState={
    count:0
}

function reducer(state )