document.addEventListener("DOMContentLoaded", function() {
	
	const form = document.querySelector("form");
	form.addEventListener("submit", function(event) {
		
		event.preventDefault();
		const charactername = document.querySelector("fname").value;
		const characterclassname = document.querySelector("lname").value;
		const characterrace = document.querySelector("email").value;
		const character = document.querySelector("password").value;
		
		const accountInfo = new FormData();
		accountInfo.append("firstname", fName);
		accountInfo.append("lastname", lName);
		accountInfo.append("email", email);
		accountInfo.append("password", password);
		
		const request = new XMLHttpRequest();
		request.open("POST", form.action, true);
		request.onreadystatechange = function() {
			if(request.readyState === 4) {
				
				if(request.status === 200) {
					
					alert(request.responseText);
					window.location.href = "http://localhost:8080/index";
					
				} else {
					
					alert(request.responseText);
					
				}
				
			}