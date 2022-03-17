<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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

    
    <div class="container-fluid">
        <div class="row" style="min-height: 20px;">
        </div>
        <div class="row" style="min-height: 40px; text-align: center;">
            <h2 style="color:mediumseagreen">VENDOR REVIEW SYSTEM</h2>
        </div>
    
        <div class="row" style="min-height: 15px;">
        </div>
        
        
        <div class="row">
            <div class="col-md-3"></div>
            <div class="col-md-6">

                <div  style="background-color:bisque">
                    <div class="card-header" style=" font-style: italic;font-weight: bold;">
                        Login Here
                    </div>
                    <div class="card-body" style="text-align: center;">
                    	<form name="f1" method="post" action="loginprocess">
                    	<label for="forUser" class="form-label" >Username</label>
                        <input type="text"  name="txtuser" id="txtuser" class="form-control"><br>
                        <label for="forPassword" class="form-label">Password</label>
                        <input type="password"  name="txtpass" id="txtpass" class="form-control"><br>
                        <label for="forUserType" class="form-label">User Type</label>
                    
                        <select class="form-select" name="usertype" id="usertype"  aria-label="Default select example">
                            
                            <option value="-1">Select</option>
                            <option value="Admin">Admin</option>
                            <option value="Vendor">Vendor</option>
                            <option value="Foodie">Foodie</option>
                          </select>
                    <br />
                        <div class="row">
                            <div class="col-md-12" style="text-align: center;">
                                <input type="submit" value="Login" name="submit" class="btn btn-primary" />
                            </div>
                        </div>
                        <div class="row" style="min-height: 10px;">
                        </div>
                        <div class="row">
                            <div class="col-md-4">
                                <a href="" style="color: rgb(201, 41, 89);">Forgot Password?</a>
                            </div>
                            <div class="col-md-4">

                            </div>
                            <div class="col-md-4">
                                <a href="" style="color: rgb(201, 41, 89);">Forgot Username?</a>
                            </div>
                            
                        </div>
                        <h5 style="font-style:italic;color:red">${msg }</h5>
                    	</form>
                        
                    </div>
                </div>
                <div class="row">
                    <div class="row" style="min-height: 15px;">
                    </div>
                    <div class="row" style="text-align: center;">
                        
                            <div class="col-md-4" style="text-align: center;">
                                    <a style="color:darkblue" href="foodieReg">Register New Foodie</a>
                            </div>
                            <div class="col-md-4" style="text-align: center;">
                                <a style="color:darkblue;" href="vendorReg">Register New Vendor</a>
                            </div>
                            <div class="col-md-4" style="text-align: center;">
                                <a style="color:darkblue;" href="">View  Review</a>
                            </div>
                            
                    </div>
                </div>

            </div>
            <div class="col-md-3"></div>
        </div>

        
    </div>
    
</body>
</html>
