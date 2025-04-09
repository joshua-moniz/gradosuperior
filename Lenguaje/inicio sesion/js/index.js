
 async function getInformation() {
    let response = document.getElementById("response");
    let input = document.getElementById("input");
    let pagina = "https://rickandmortyapi.com/api/episode"

    while (pagina != null) {
        await(pagina !=null)
        fetch(pagina)
            .then(response => response.json())
            .then(data => {
                let resultados = data["results"];
                for (let i = 0; i < resultados.length; i++) {
                    let resultado = resultados[i];
                    console.log(i);
                    if (resultado["episode"] === input.value) {
                        response.innerText = resultado["name"];
                        break;
                    }
                }

                pagina = data["info"]["next"];

            })
.catch(pagina=null);

    }
}

function ej1() {

}
/*
fetch("https://rickandmortyapi.com/api/episode/1")
.then(Response => Response.json()
.then(data =>{
let cap1=document.getElementById("cap1");
cap1.innerHTML= data["id"];
cap1.innerHTML  += " "+ data["name"];
})
)
}
*/
function ej2() {
    fetch("https://rickandmortyapi.com/api/character")
        .then(Response => Response.json()
            .then(data => {
                let nump = document.getElementById("nump");
                nump.innerHTML = data["info"]["count"]
            })
        )
}

function ej3() {
    fetch("https://rickandmortyapi.com/api/episode/13")
        .then(Response => Response.json()
            .then(data => {
                let personajesdos = data["characters"];
                for (let i = 0; i < personajesdos.length; i++) {
                    console.log(personajesdos[i])
                    fetch(personajesdos[i])
                        .then(Response => Response.json())
                        .then
                }

            })

        )

}