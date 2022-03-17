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
    <script src='main.js'></script>
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
</head>
<body style="background-color:rgb(206, 203, 36); background-image:url('log.jpeg'); background-size: cover;">
    <!-- Option 1: Bootstrap Bundle with Popper -->
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
    
    <div  class="container-fluid" >
        <div class="row" style="min-height: 40px;">
        </div>
       <!--- <div class="row">
            <div class="text-center">
                <h4>WELCOME</h4>
            </div>--->
        </div>
       
        
    </div>
    <div class="container-fluid" >
        <div class="row">
            <div class="col-md-3">

            </div>
            <div class="col-md-6" >
                <div class="row">
                    <h4 style=" text-align: center;font-style: italic; color: rgb(55, 13, 243);">REGISTER NEW VENDOR</h4>
                </div>
                <div class="row" style="min-height: 7px;">
                </div>

                <form class="row g-15" name="f1" method="post" action="addvendor" style="background-color: azure;">
                      <div class="row" style="min-height: 10px;">
                      </div>
                     
                      <div class="col-md-6">
                        <label for="txtvname" class="form-label">Name</label>
                        <input type="text" class="form-control" name="vendorname" id="vendorname" placeholder="Enter Vendor Name">
                      </div>
                      <div class="col-md-6">
                        <label for="txtvemail" class="form-label">Email</label>
                        <input type="text" class="form-control" name="email" id="email" placeholder="Enter Vendor Email">
                      </div>
                      <div class="col-md-6">
                        <label for="txtwebid" class="form-label">Website Id</label>
                        <input type="text" class="form-control" name="websiteid" id="websiteid" placeholder="Enter Website Id">
                      </div>
                      <div class="col-6">
                        <label for="txtvloc" class="form-label">Location</label>
                        <input type="text" class="form-control" name="location" id="location" placeholder="Enter location">
                      </div>
                      <div class="col-12">
                        <label for="txtvpass" class="form-label">Password</label>
                        <input type="text" class="form-control" name="password" id="password" placeholder="Enter Password">
                    </div>
                      <div class="col-md-6">
                        <label for="vendortype" class="form-label">Vendor Type</label>
                        <select name="vendortype" id="vendortype" class="form-select">
                                <option value="-1" >Select</option>
                                <option value="Takeaway">Take away</option>
                                <option value="Buffet">Buffet</option>
                                <option value="Alacarte">Alacarte</option>
                        </select>
                    </div>
                    <div class="col-md-6">
                        <label for="cusinetype" class="form-label">Cusine Type</label>
                        <select name="cusinetype" id="cusinetype" class="form-select">
                                <option value="-1" >Select</option>
                                <option value="NorthIndian">North Indian</option>
                                <option value="South Indian">South Indian</option>
                                <option value="Italian">Italian</option>
                                <option value="Chinese">Chinese</option>
                                <option value="Multicusine">Multicusine</option>
                        </select>
                    </div>
                      
                      <div class="col-6">
                          <label for="menucard" class="form-label">MenuCard</label>
                          <input type="file" class="form-control" name="uploadmenucard" id="uploadmenucard">
                      </div>

                      <div class="col-6">
                        <label for="photo" class="form-label">Photo</label>
                        <input type="file" class="form-control" name="uploadphoto" id="uploadphoto">
                    </div>
                      
                      
                      
                      <div class="row" style="min-height: 15px;">
                      </div>
                      <div class="col-12" style="text-align: center;">
                        <button type="submit" name="submitvend" id="submitvend"  class="btn btn-success">Add Vendor</button>
                      </div>
                      <div class="row" style="min-height: 20px;">
                      </div>
                </form> 
                <div>
                    <h5 style="color:green">${msg }</h5>
                </div>
                
            </div>
            
            <div class="col-md-3">
                
            </div>
            
        </div>
        
    </div>
    
    
</body>
</html>