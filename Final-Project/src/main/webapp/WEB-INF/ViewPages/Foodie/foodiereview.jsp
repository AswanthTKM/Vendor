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
    <!--<script src='main.js'></script>-->
    <script type="text/javascript">
      function addFeedback(){
          
          document.getElementById("t").innerHTML="sd";
          return false;
      }
  </script>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">

</head>
<body style="background-color:rgb(206, 203, 36); background-image:url('log.jpeg'); background-size: cover;">
    <!-- Optional JavaScript; choose one of the two! -->

    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>

    <!-- Option 2: Separate Popper and Bootstrap JS -->
    <!--
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.10.2/dist/umd/popper.min.js" integrity="sha384-7+zCNj/IqJ95wo16oMtfsKbZ9ccEh31eOz1HGyDuCQ6wgnyJNSYdrPa03rtR1zdB" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.min.js" integrity="sha384-QJHtvGhmr9XOIpI6YVutG+2QOK9T+ZnN4kzFN1RtK3zEFEIsxhlmWl5/YESvpZ13" crossorigin="anonymous"></script>
    -->

    <div  class="container-fluid" >
        <div class="row" style="min-height: 20px;">
        </div>
        <div class="row">
            <div class="text-center">
                 <h2 style="color: rgb(240, 93, 9);">GIVE REVIEW</h2>
            </div>
        </div>
    
          <nav class="navbar navbar-expand-lg navbar-light bg-light">
            <div class="container-fluid">
              <a class="navbar-brand" href="#">FOODIE</a>
              <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
              </button>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;
              <div div class="collapse navbar-collapse" id="navbarSupportedContent">
                <ul class="navbar-nav me-auto mb-2 mb-lg-0">
                  
                  <li class="nav-item">
                    <a class="nav-link active"  href="fhome">Home</a>
                  </li>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
                  <li class="nav-item">
                    <a class="nav-link active"  href="freview">Review</a>
                  </li>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
                 <li class="nav-item">
                    <a class="nav-link active"  href="viewfreview">View Reviews</a>
                  </li>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
                  <li class="nav-item">
                    <a class="nav-link active"  href="ab">View Profile</a>
                  </li>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
                  
                    <a class="btn btn-block btn-secondary mb-2"    href="ab">Logout</a>
                  </li>&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp;&nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp; &nbsp;&nbsp;
                </ul>
               </div>
            </div>
        </nav>
          
    </div>

    <div class="container-fluid">
        <div class="row" style="min-height: 40px;">
        </div>
    	<div class="row">
    		<div class="col-md-2">
		    </div>
	    	<div class="col-md-8" >
            	 
                <div class="row"  >
                    <div class="col-md-3"></div>
                    <div class="col-md-6" style="text-align: center;background-color:rgb(172, 199, 110)">
                        <h5 style="color: maroon;text-decoration: underline; ">GIVE REVIEW HERE ${f.firstname }</h5>
                    </div>
                    <div class="col-md-3"></div>
                </div>
               
                <table width="100%" class="table table-striped" border="1" style="text-align:center; background-color:wheat; border-spacing:12px;">
                    <tr>
                        
                        <th>Vendor ID</th>
                        <th>Vendor Name</th>
                        <th>Location</th>
                        <th>Give Review</th>
                        <th>Add Ratings</th>
                        <th></th>
                    </tr>
                    <c:forEach  var="v" items="${venderacAll }">
                    <form  name="f3" method="post" action="addreview/${v.vendorid }/${v.vendorname }/${v.location }" >
                    <tr>
                        <td id="vid" name="vendorid">${v.vendorid }</td>
                        <td name="vendorname"><a href="vendshow/${v.vendorname }" >${v.vendorname }</a></td>
                        <td name="location">${v.location }</td>
                        
                        <td>
                            <input type="text" class="form-control" name="review" id="review" placeholder="Enter review" required="true">
                        </td>
                        <td>
                          <td>
                            <select class="form-select" name="ratings" id="ratings"  aria-label="Default select example">
                            
                              <option value="1">1</option>
                              <option value="2">2</option>
                              <option value="3">3</option>
                              <option value="4">4</option>
                              <option value="5">5</option>
                            </select>
                          </td>
                          
                        
                
                        <td>
                          <div class="col-12" style="text-align: center;">
                            <button type="submit" name="submitreview" id="submitreview"  class="btn btn-success">Submit Review</button>
                          </div>
                        </td>
                        
                    </tr>
                    </form>
                    </c:forEach>
                </table>
                <div>
                    <h6 style="color:green;text-align: center;">${msg }</h>
                </div>
                <div>
                  <table>
                    <tr>
                      <td>Id</td>
                      <td>Name</td>
                      <td>Email</td>
                      <td>Webid</td>
                      <td>Location</td>
                      <td>Type</td>
                      <td>Cusine Type</td>
                    </tr>
                    <tr>
                      <td id="t"></td>
                      <td></td>
                      <td></td>
                      <td></td>
                      <td></td>
                      <td></td>
                    </tr>
                  </table>
                </div>
                
            </div>
            <div class="col-md-2">
              
		        </div>
    	</div>
    </div>
</body>
</html>