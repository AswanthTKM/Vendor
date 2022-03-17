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
            <div class="col-md-4">

            </div>
           <form class="row g-10" name="f1" method="post" action="sub" style="background-color: azure; padding-left: 30%;">
            
            <div class="col-md-4" >
                <div class="row" style="background-color: aliceblue;">
                    <h4 style=" text-align: center;font-style: italic; color: rgb(55, 13, 243);">PAYMENT PAGE</h4>
                </div><br>
                <div class="row" style="background-color: honeydew;">
                    <table style="text-align: center;">
                        <tr>
                            <td>Vendor ID</td>
                            <td>
                            	<input type="text" class="form-control" name="vendorid" id="vendorid">
                            </td>
                        </tr>
                       
                    </table>
                </div>
                
                <div style="text-align: center;color: maroon;background-color: darkgray; ">SELECT SUBSCRIPTION</div>

                        <div class="row" style="min-height: 10px;">
                        </div>
                        <div class="form-check" >
                            <input class="form-check-input" type="radio" id="onemonth" name="subsc" value="one">
                            <label class="form-check-label" for="onemonth">1 Month Subscription</label>
                        </div><br><br>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" id="threemonth" name="subsc" value="three">
                            <label class="form-check-label" for="threemonth">3 Month Subscription</label>
                        </div><br><br>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" id="sixmonth" name="subsc" value="six">
                            <label class="form-check-label" for="sixmonth">6 Month Subscription</label>
                        </div><br><br>
                        <div class="form-check">
                            <input class="form-check-input" type="radio" id="twelvemonth" name="subsc" value="twelve">
                            <label class="form-check-label" for="twelvemonth">12 Month Subscription</label>
                        </div>
                        <div class="row" style="min-height: 20px;">
                        </div>
                        <div class="col-12" >
                            <button type="submit" name="submitpay" id="submitpay"  class="btn btn-success">Click her to Pay</button>
                        </div>
                        <div class="row" style="min-height: 10px;">
                        </div>

                      
                </form> 
                <div>
                    <div class="row" style="min-height: 10px;">
                    </div>
                    <h5 style="color:green">${msg }</h5>
                </div>
                
            </div>
            <div class="col-md-1"></div>
            
            <div class="col-md-3">
                <div><br><br><br><br><br><br><br><br><br><br><br>
                    <div style="text-align: center; color: rgb(243, 16, 27); font-weight: bold;">FEE DETAILS</div>
                    <table style="
                    border-collapse: collapse; width:100%; text-align: center;background-color: beige;">
                        
                        <tr style="font-weight: bold;">
                            <th>Months</th>
                            <th>Fee</th>
                        </tr>
                        <tr>
                            <td>1</td>
                            <td>1000</td>
                        </tr>
                        <tr>
                            <td>3</td>
                            <td>2000</td>
                        </tr>
                        <tr>
                            <td>6</td>
                            <td>5000</td>
                        </tr>
                        <tr>
                            <td>12</td>
                            <td>9000</td>
                        </tr>
                    </table>
                   
                </div>
                
            </div>
            
        </div>
        
    </div>
    
    
</body>
</html>