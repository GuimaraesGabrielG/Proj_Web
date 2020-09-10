function guardar(){
	

	document.getElementById('loading').innerHTML = "CARREGANDO...";
	
	httpRequest = new XMLHttpRequest();
	
	if (!httpRequest) {
		return false;
	}
	
	
	httpRequest.open('GET', 'user');
	httpRequest.responseType = 'User';
	httpRequest.send();
	
	httpRequest.onreadystatechange = function() {
	
		if (httpRequest.readyState === XMLHttpRequest.DONE) {
		
			document.getElementById('loading').innerHTML = "INSERIR!";
			
			if (httpRequest.status === 200) {
			
				var array = httpRequest.response;
				console.log(array)
				var splits = array.split('*');
				console.log(splits[4]);
				for (var i=0; i< splits.length-2; i++) {
					var splitsdiv = splits[i].split('-');
					var table = document.getElementById('idtable');
					var row = table.insertRow(table.rows.length);
					var cell1 = row.insertCell(0);
					var cell2 = row.insertCell(1);
					var cell3 = row.insertCell(2);
					var cell4 = row.insertCell(3);
					var nome = document.createTextNode(splitsdiv[0]);
					var email = document.createTextNode(splitsdiv[1]);
					var senha = document.createTextNode(splitsdiv[2]);
					var cpf = document.createTextNode(splitsdiv[3]);
					cell1.appendChild(nome);
					cell2.appendChild(email);
					cell3.appendChild(senha);
					cell4.appendChild(cpf);

				}
			} else {
			}
		
		}
	}


}