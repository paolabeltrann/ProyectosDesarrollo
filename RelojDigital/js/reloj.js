const mostrarReloj = () => {
    let fecha = new Date(); //fecha actual
    let hr = formatoHora(fecha.getHours()) ; //Trae la hora
    let min = formatoHora(fecha.getMinutes()); //Trae los minutos
    let seg = formatoHora(fecha.getSeconds()); // Trae los segundos
    document.getElementById('hora').innerHTML = `${hr}:${min}:${seg}`; //innerHTML: Modificamos el valor del elemento

    const meses =['Ene', 'Feb', 'Mar','Abr', 'May', 'Jun','Jul', 'Ago', 'Sep' ,'Oct','Nov','Dic'];
    const dias = ['Dom', 'Lun','Mar','Mie','Jue','Vie', 'sab'];

    let diaSemana = dias[fecha.getDay()];
    let dia = fecha.getDay(); //Nos regresa el dia en valor numerico
    let mes = meses[fecha.getMonth()];
    let fechaTexto = `${diaSemana}, ${dia}, ${mes}`;
    document.getElementById('fecha').innerHTML = fechaTexto;

    document.getElementById('contenedor').classList.toggle('animar'); //Devuelve todas las listas que se esten usando en html.

}
 
const formatoHora = (hora)=>{
    if(hora<10)
    hora = '0' + hora;
    return hora;
}

setInterval(mostrarReloj, 1000);
