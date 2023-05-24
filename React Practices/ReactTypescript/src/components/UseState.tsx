import { useState } from "react"

type AuthUser={
    name:string;
    password:number;
}

export const User=()=>{
    const [user,SetUser]=useState<AuthUser|null>(null) //explicit type casting
    const handleLogin=()=>{
        SetUser({name:"Kanishq",password:23738})
    }
    const handleLogout=()=>{
        SetUser({} as AuthUser);
    }

    return(
        <div>
            <div>{user}</div>
            <button onClick={handleLogin}>Login</button>
            <button onClick={handleLogout}>Logout</button>
        </div>
    )
}