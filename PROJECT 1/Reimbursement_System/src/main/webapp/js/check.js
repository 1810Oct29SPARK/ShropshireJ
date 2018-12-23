/**
 * 
 */

window.onload = function() {
	populateUser();
}
var storedUser;

function populateUser() {
	// send a get request to localhost:7001/Reimbursement_System/employeeuser
	fetch("http://localhost:7001/Reimbursement_System/getsessionuser.json", {
		method : "POST"
	}).then(function(response) {

		return response.json();
	}).then(function(data) {

		// parse the response as JSON
		storedUser = data;
		console.log(data);
		profileDisplay();
		// check whether there was a user returned
		
	});

	// define behavior for user returned
	// define behavior for no user returned
}

   function profileDisplay(){
	   document.title= storedUser.firstName +' '+ storedUser.lastName+'\'s Reimbursements';
	   document.getElementById('name').innerHTML=storedUser.firstName +' '+ storedUser.lastName;
	   document.getElementById('username').innerHTML=storedUser.username;
	   document.getElementById('email').innerHTML=storedUser.email;
	   if (storedUser.role_id === 2){
	   document.getElementById('role').innerHTML="Admin";
	   }else{
		   document.getElementById('role').innerHTML="Employee";
		   
		   

	   } populateReimbursement();

   }

	var storedReimbursement;

	function populateReimbursement() {
		// send a get request to localhost:7001/Reimbursement_System/employeeuser
		fetch("http://localhost:7001/Reimbursement_System/getuserreimbursement.json", {
			method : "POST"
		}).then(function(response) {

			return response.json();
		}).then(function(data) {
 
		
				document.getElementById('tbody').innerHTML = '';
				let block = '';
				for(i = 0; i < data.length; i++){
					block += rbDisplay(data[i]);
				}
				document.getElementById('tbody').innerHTML = block;
			});
   

		
		

		// define behavior for user returned
		// define behavior for no user returned
	}

	   function rbDisplay(item){
		   let ret='<tr><td> $'+ item.amount;
		   ret+='</td><td>'+ item.username;
		   ret+='</td><td>'+ item.created_date;
		   ret+='</td>  <td>'+item.Description;
		  
		   if (storedUser.role===2){
               ret+=`<td>
               <div id="imgbox1" class="btn-group">
                   <div class="btn-group">
                       <button type="button" class="btn btn-secondary dropdown-toggle"
                           data-toggle="dropdown">
                           Pending <span class="caret"></span></button>
                       <ul class="dropdown-menu" role="menu">
                           <li class="btn-lg btn-outline-success">Approve</li>
                           <li class="btn-lg btn-outline-danger">Decline</li>
                       </ul>
           </td>`
		   }else{
			   ret+='</td> <td>'+item.status_id;
		   }
		   
		  return ret +'</td> </tr>';
		   }
		   function myFunction() {
			   // Declare variables 
			   var input, filter, table, tr, td, i, txtValue;
			   input = document.getElementById("myInput");
			   filter = input.value.toUpperCase();
			   table = document.getElementById("myTable");
			   tr = table.getElementsByTagName("tr");

			   // Loop through all table rows, and hide those who don't match the search query
			   for (i = 0; i < tr.length; i++) {
			     td = tr[i].getElementsByTagName("td")[0];
			     if (td) {
			       txtValue = td.textContent || td.innerText;
			       if (txtValue.toUpperCase().indexOf(filter) > -1) {
			         tr[i].style.display = "";
			       } else {
			         tr[i].style.display = "none";
			       }
			     } 
			   }
			 }
			

