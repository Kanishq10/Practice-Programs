function greet(name: string | null | undefined){
    if(name)
    console.log(name.toUpperCase());
    else
    console.log('Hola');
}

greet(undefined);
greet(null);
greet("hola and HAbibi")