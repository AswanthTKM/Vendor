<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link rel='stylesheet' type='text/css' media='screen' href='main.css'>
    <script src='main.js'></script>

    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body style="background:url(https://cognizantonline-my.sharepoint.com/:i:/r/personal/2080232_cognizant_com/Documents/Microsoft%20Teams%20Chat%20Files/log.jpeg?csf=1&web=1&e=ZRPJB6);background-size:100% 500%;">
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->

<p style="text-align:center;font-weight:bold;">
        <a href="ahome">Vendor Request</a>&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;
		<a href="class">Vendor Detail</a>&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;
		<a href="showf">Foodie Detail</a>&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;
		<a href="addNewf">View Review</a>&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;
		<a href="addclassfaculty">View Complaint</a>&nbsp;&nbsp;&nbsp;/&nbsp;&nbsp;&nbsp;
		<a href="ab">Generate Report</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<a href="ab">Logout</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	</p>
	
	<div class="container-fluid">
	<div class="row">
		<div class="col-md-2"></div>
		<div class="col-md-8">
			<div class="m-3">
				<table class="table table-striped caption-top" style="background-color:#f8f9fa;border-radius:5px;">
				<caption style="color:#ffffff;font-weight:bold">Foodie List</caption>
				<thead>
				<tr>
					<th scope="col">Foodie Id</th>
					<th scope="col">First Name</th>
					<th scope="col">Last Name</th>
					<th scope="col">Gender</th>
					<th scope="col">Address</th>
					<th scope="col">DOB</th>
					<th scope="col">Phone</th>
					<th scope="col">Email</th>
					
				</tr>
				</thead>
				<tbody>
				<c:forEach var="foodie" items="${flist }">
				<tr>
					<td>${foodie.foodieid }</td>
					<td>${foodie.firstname }</td>
					<td>${foodie.lastname }</td>
					<td>${foodie.gender }</td>
					<td>${ffoodie.address }</td>
					<td>${foodie.dob}</td>
					<td>${foodie.phone }</td>
					<td>${foodie.emailid }</td>
				</tr>
				</c:forEach>
				</tbody>
				</table>
			</div>
		</div>
		<div class="col-md-2"></div>
	</div>
</div>

</body>
</html>