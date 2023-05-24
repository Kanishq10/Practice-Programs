type NewDiv={
    children:React.ReactNode   //it can handle Tag in Tag
}

export const dl=(props:NewDiv)=>{
    return <h2>{props.children}</h2>
}