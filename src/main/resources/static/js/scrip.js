function marcarCliente(){
    let nomes = document.querySelectorAll(".coluna-nome")

    nomes.forEach(function (td){
        td.style.backgroundColor="#ffe599"
    })
}