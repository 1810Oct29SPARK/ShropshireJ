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
		populateReimbursement();
		// check whether there was a user returned
		
	});

	// define behavior for user returned
	// define behavior for no user returned
}
var storedReimbursement;

	function populateReimbursement() {
		console.log('sean is the best');
		// send a get request to
		// localhost:7001/Reimbursement_System/getuserreimbursement
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
		   ret+='</td><td>'+ item.u_id;
		   ret+='</td><td>'+ item.created_date;
		   ret+='</td>  <td>'+item.r_description;
		  console.log(storedUser.role_id)
		   if (storedUser.role_id===2){
               ret+=`<td>
               <div id="imgbox1" class="btn-group">
                   <div class="btn-group">
                       <button type="button" class="btn btn-secondary dropdown-toggle"
                           data-toggle="dropdown">
                           Pending <span class="caret"></span></button>
                       <ul class="dropdown-menu" role="menu">
                           <li id="acc-${item.r_id}" onclick="approve(event)" class="btn-lg btn-outline-success">Approve</li>
                           <li id="dn-${item.r_id}" onclick="deny(event)"class="btn-lg btn-outline-danger">Decline</li>
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

			   // Loop through all table rows, and hide those who don't match
				// the search query
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
			function approve(e){
				let splitid= e.target.id.split('-');
				let params='r_id='+splitid[1];
				console.log(params);
				fetch("http://localhost:7001/Reimbursement_System/approve.serv?"+params, {
					method : "POST",
						body:params
				}).then(function(response) {
					populateReimbursement();
				});
		
			}
			function deny(e){
				let splitid= e.target.id.split('-');
				let params='r_id='+splitid[1];
				console.log(params);
				fetch("http://localhost:7001/Reimbursement_System/deny.serv?"+params, {
					method : "POST",
						body:params
				}).then(function(response) {
					populateReimbursement();
				});
			}
			