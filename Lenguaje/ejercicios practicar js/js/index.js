
function cambiartext(){
document.getElementById("boton").innerText ="Ha cambiado";
}
function cambiarcolor(){
    document.getElementById("paragraf2").style.color="orange"; 
}
function desaparecer(){
    let temp = document.getElementById("paragraf3");
    if(    temp.style.opacity==1){
        temp.style.opacity=0

    }   
else{
    temp.style.opacity=1
}
}
function añadir(){
  let contenedor =document.getElementById("lista")
let nuevoElemento = document.createElement("li")
nuevoElemento.innerText="NuevoElemento";
contenedor.appendChild(nuevoElemento);
}
let numero=0;
function numeromas(){
    
    numero++
    document.getElementById("num").innerText=numero
}
function fondo(){
    let num = Math.random()
    document.getElementById("fondos").style.backgroundColor="blue"
}

function contador() {
    let temps = document.getElementById("temps").value;
    let contador = document.getElementById("contador");
    let interval = setInterval(function() {
        contador.textContent = temps;
        temps--;

        if (temps < 0) {
            clearInterval(interval);
            contador.textContent = "Tiempo terminado";
        }
    }, 1000);
}