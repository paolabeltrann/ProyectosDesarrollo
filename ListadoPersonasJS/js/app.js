const personas =[
    new Persona('Paola', 'Beltran'),
    new Persona('Emma', 'Rodriguez'),
    new Persona('Julian' , 'Castillo')

];

function mostrarPersonas(){
    console.log('Mostrar Personas...')
    let texto ='';
    for(let persona of personas){
        console.log(persona);
        texto += `<li>${persona.nombre} ${persona.apellido}</li>`;

    }

    document.getElementById('personas').innerHTML = texto;
}