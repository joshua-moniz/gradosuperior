let operacion = "";
let resultadoMostrado = false;

function actualizarPantalla() {
    document.getElementById("numero").innerText = operacion;
}

function escribir(boton) {
    console.log(boton)
    if (resultadoMostrado) {
        operacion = "";
        resultadoMostrado = false;
    }
    let numero = boton.innerText;
    if (operacion === "0") {
        operacion = numero;
    } else {
        operacion += numero;
    }
    actualizarPantalla();
}
function operar(simbolo) {
    if (resultadoMostrado) {
        resultadoMostrado = false;
    }
    operacion += " " + simbolo + " ";
    actualizarPantalla();
}

function borrar() {
    operacion = "0";
    actualizarPantalla();
}

function calcular() {
    try {
        operacion = eval(operacion).toString();
        resultadoMostrado = true;
    } catch {
        operacion = "Error";
        resultadoMostrado = true;
    }
    actualizarPantalla();
}
