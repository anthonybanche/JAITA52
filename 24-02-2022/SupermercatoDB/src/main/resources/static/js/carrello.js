

window.onload= getCarrello();

function getCarrello(){
	
	let tabella = document.getElementById("carrello");
	let totale = 0;
	if(tabella) {
	
		fetch("http://localhost:8080/api/carrello")
			.then(response => response.json())
			.then(data => {
				
				for(let prodotto of data){
					
					let tr = document.createElement("tr");
					tr.innerHTML =  '<td>' + prodotto.id + '</td>' +
						 			'<td>' + prodotto.nome + '</td>' +
									'<td>' + prodotto.reparto + '</td>' +
									'<td>' + prodotto.prezzo + '</td>' +
									'<td><button onclick="deleteProdotto(' + prodotto.id + ')">Cancella</button></td>' +
									'<td><button onclick="getCanzone(' + prodotto.id + ')">Altro</button></td>'
					tabella.appendChild(tr);				
					totale = totale + prodotto.prezzo;
					
				}
				let trTot = document.createElement("tr");
				let td = document.createElement("td");
				td.className = "color_rosso"
				td.innerText = "Totale spesa: " + totale;
				
				trTot.appendChild(td);
				tabella.appendChild(trTot);
				
			})
			.catch(error => {
				alert("Si e' verificato un errore");
			})
	}
	
}
	function deleteProdotto(id) {
		fetch("http://localhost:8080/api/rimuoviProdotto?id=" + id, {
			method: "DELETE"
		})
		.then(response => location.reload())
		.catch(errore => {
			alert(errore);
		})
		
	}
	
	
	
