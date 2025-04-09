async function cambioPerro() {
    let raza = document.getElementById("texto");
    let url = "https://dog.ceo/api/breed/" + raza.value + "/images/random";
    fetch(url)
    .then(response => response.json())
    .then(data => {
      document.getElementById("perro").src = data.message;;
    })
    .catch(error => {
      console.error("Error al obtener la imagen:", error);
    });
}