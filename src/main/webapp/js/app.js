console.log("¡App cargada!");

document.addEventListener("DOMContentLoaded", () => {
    const btn = document.getElementById("btn-saludar");
    const output = document.getElementById("output");

    btn.addEventListener("click", async () => {
        const nombre = document.getElementById("nombre").value;

        const res = await fetch(`/mi-app-web/api/saludo?nombre=${encodeURIComponent(nombre)}`);
        const data = await res.json();

        console.log({ data });

        try {
            
            const responseJson = await fetch(`/mi-app-web/api/post/service`, {
                method: 'POST',
                body: JSON.stringify(data)
            });
    
            const dataResponse = await responseJson.json();

            console.log(dataResponse);
            

        } catch (error) {

            console.error(error);
            
            
        }


        output.textContent = data.mensaje;
    });
});