

function gets(){
    const energia = ["3","8001","100","20011"];
    return energia;
}

let input = gets();

let qtdEntradas = gets().length;



let nivelEnergia;

for(let i = 0; i < qtdEntradas; i++){
    input = gets();
    
    nivelEnergia = parseInt(input[i]);
    
    
    if(nivelEnergia >= 8000){
        console.log ("Mais de 8000" );
    }else{
        console.log("Inseto");
    }
}


