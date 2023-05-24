type HeadingProps={
    children:string      //keyword children
}

export const Heading=(props:HeadingProps)=>{
    return <h1>{props.children}</h1>
}