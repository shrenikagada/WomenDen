<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>HomePage</title>
<meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  <style>
    .navbar {
      margin-bottom: 0;
      border-radius: 0;
    }
    
    footer {
      background-color:black;
      padding: 20px;
      color:white;
    }
    
    body { 
background-image: url("https://i.pinimg.com/736x/c6/d3/7a/c6d37a8492b9b0319ddcd13bb667721e--proverbs--paintings-of-flowers.jpg");
 -webkit-background-size: cover;
 -moz-background-size: cover;
 -o-background-size: cover;
 background-size: cover;
   
 height:100%;
 width:100%;
}
.footer{
	position:fixed;
	width:100%;
	bottom:0;
	left:0;
	background-color:black;
	color:white;
	text-allign:center;
}
#message {
    display:none;
    background: #f1f1f1;
    color: #000;
    position: relative;
    padding: 20px;
    margin-top: 10px;
}

#message p {
    padding: 10px 35px;
    font-size: 18px;
}

.valid {
    color: green;
}

.valid:before {
    position: relative;
    left: -35px;
    content: "✔";
}


.invalid {
    color: red;
}

.invalid:before {
    position: relative;
    left: -35px;
   content: "✖";
}


    </style>

</head>
<body>
<nav class="navbar navbar-inverse ">
	
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>                        
      </button>
      <a class="navbar-brand" href="#">WomenDen</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav navbar-center">
        <li><a href="MainHomePage.jsp">   Home   </a></li>
        <li><a href="PoliceStations.html"> PoliceStation </a></li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Crowd<span class= "caret"></span></a>
        <ul class="dropdown-menu">
      <li><a href="DisplayCrowd">View Crowd Zones</a></li>
      <li><a href="AddCrowdZones.jsp">Add Crowd Zones</a> </li>
      </ul>
      </li>
        <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Crime<span class= "caret"></span></a>
        <ul class="dropdown-menu">
      <li><a href="DisplayCrime">View Crime</a></li>
      <li><a href="AddCrimes.jsp">Add Crime</a> </li>
      </ul>
      </li>
        <li><a href="HomePage.jsp"> PostProblems
         </a></li>
        <li><a href="PostComments.jsp"> ReportMisfortune </a></li>
      </ul>
      
    </div>
  </div>
</nav>
<div class="container-fluid bg-3 text-center">
<br><br><br><br><br><br>
<div class="row">
<div class="col-xs-7 col-sm-6 col-lg-8" style="width:50%;height:50%"> 
	<div class="label1" style="text-align: right" >
      <h1 class="diaplay-1 font-weight-bold font-italic">VICTIM :</h1>
     
   </div>
</div>
<div class=" col-xs-5 col-sm-6 col-lg-4">

                        <a class="btn btn-default btn-lg" href="#" data-toggle="modal" data-target=".login-register-form">
                           SignIn / Registration
                        </a>

                       
                        <div class="modal fade login-register-form" role="dialog">
                            <div class="modal-dialog modal-md">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">
                                            <span class="glyphicon glyphicon-remove"></span>
                                        </button>
                                        <ul class="nav nav-tabs">
                                            <li class="active"><a data-toggle="tab" href="#login-form"> SignIn <span class="glyphicon glyphicon-user"></span></a></li>
                                            <li><a data-toggle="tab" href="#registration-form"> Register <span class="glyphicon glyphicon-pencil"></span></a></li>
                                        </ul>
                                    </div>
                                    <div class="modal-body">
                                        <div class="tab-content">
                                            <div id="login-form" class="tab-pane fade in active">
                                                <form action="VictimLogin" data-toggle="validator" role="form">
                                                    <div class="form-group">
                                                        <label for="name" class="control-label">UserName:</label>
                                                      <center>  <input type="text" class="form-control" id="userName"style="width:300px" placeholder="Enter UserName"  name="uname" required  ></center>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="pwd" class="control-label" >Password:</label>
                                                       
                                                     <center>   <input type="password" class="form-control" data-minlength="8" pattern=".{8,}" title="Must contain at least 8 or more characters"  id="victimPassword" style="width:300px" placeholder="Enter password" name="pwd" required></center>
                                                    <div class="help-block">Minimum of 8 characters</div>
                                                    
                                                    </div>
                                                    
                                                    <div class="checkbox">
                                                        <label><input type="checkbox" name="remember"> Remember me</label>
                                                    </div>
                                                    <button type="submit" class="btn btn-default">SignIn</button>
                                                </form>
                                            </div>
                                            <div id="registration-form" class="tab-pane fade">
                                                <form action="VictimRegister">
                                                    <div class="form-group">
                                                        <label for="name" class="control-label">Full Name:</label>
                                                       <center> <input type="text" class="form-control" id="victimFullName" style="width:300px" placeholder="Enter your full name" name="fname" required ></center>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="name" class="control-label">User Name:</label>
                                                       <center> <input type="text" class="form-control" id="victimUserName"  style="width:300px"placeholder="Enter your user name" name="uname" required ></center>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="mobilenum" class="control-label">Mobile Number:</label>
                                                       <center> <input type="number" class="form-control" id="victim"  style="width:300px" placeholder="Enter your number" name="number" required></center>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="newemail"class="control-label">Email:</label>
                                                      <center>  <input type="email" class="form-control" id="VictimEmailId" style="width:300px" placeholder="Enter new email" name="email" data-error="enter a valid email-address" required ></center>
                                                   <div class="help-block with-errors"></div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="newpwd" class="control-label">Password:</label>
                                                      <center>  <input type="password" data-minlength="8" pattern=".{8,}" title="Must contain at least 8 or more characters" class="form-control" id="victimPassword" name="pwd"style="width:300px" placeholder="New password" required ></center>
                                                    <div class="help-block">Minimum of 8 characters</div>
                                                   
                                                    </div>
                                                    <button type="submit" class="btn btn-default">Register</button>
                                                </form>
                                            </div>

                                        </div>
                                    </div>

                                </div>
                            </div>
                        </div>
</div>

</div>
</div>
<br><br><br><br><br><br><br>

<div class="container-fluid bg-3 text-center">
<div class="row">
<div class="col-xs-7 col-sm-6 col-lg-8" style="width:50%;height:50%"> 
	<div class="label1" style="text-align: right;" >
      <h1 class="diaplay-1 font-weight-bold font-italic">PROFESSIONAL: </h1>
   </div>
           
     <!-- INSERT PROFESSIONAL IMAGE HERE AND SAME AS ABOVE -->
</div>
<div class=" col-xs-5 col-sm-6 col-lg-4">
<a class="btn btn-default btn-lg" href="#" data-toggle="modal" data-target=".login-register-form1">
                           SignIn / Registration
                        </a>

                        
                        <div class="modal fade login-register-form1" role="dialog">
                            <div class="modal-dialog modal-md">
                                <div class="modal-content">
                                    <div class="modal-header">
                                        <button type="button" class="close" data-dismiss="modal">
                                            <span class="glyphicon glyphicon-remove"></span>
                                        </button>
                                        <ul class="nav nav-tabs">
                                            <li class="active"><a data-toggle="tab" href="#login-form1"> SignIn <span class="glyphicon glyphicon-user"></span></a></li>
                                            <li><a data-toggle="tab" href="#registration-form1"> Register <span class="glyphicon glyphicon-pencil"></span></a></li>
                                        </ul>
                                    </div>
                                    <div class="modal-body">
                                        <div class="tab-content">
                                            <div id="login-form1" class="tab-pane fade in active">
                                                <form action="ProfessionalLogin"data-toggle="validator" role="form">
                                                    <div class="form-group">
                                                        <label for="name" class="control-label">UserName:</label>
                                                     <center>  <input type="text" class="form-control" id="professionalUserName" name="uname" style="width:300px"placeholder="Enter username" required></center>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="pwd" class="control-label">Password:</label>
                                                       <center>  <input type="password" data-minlength="8" pattern=".{8,}" title="Must contain at least 8 or more characters" class="form-control" name="pwd"id="professionalPassword" style="width:300px" placeholder="Enter password" required></center>
                                                   <div class="help-block">Minimum of 8 characters</div>
                                                    </div>
                                                    <div class="checkbox">
                                                        <label><input type="checkbox" name="remember"> Remember me</label>
                                                    </div>
                                                    <button type="submit" class="btn btn-default">Login</button>
                                                </form>
                                            </div>
                                            <div id="registration-form1" class="tab-pane fade">
                                                <form action="ProfessionalRegister">
                                                <div class="form-group">
                                                    <label for="name"class="control-label">Full Name:</label>
                                                      <center>   <input type="text" class="form-control" id="professionalUserName" name="fname" style="width:300px"placeholder="Enter your full name" required></center>
                                                    </div>
                                                    
                                                    <div class="form-group">
                                                    <label for="name"class="control-label">User Name:</label>
                                                      <center>   <input type="text" class="form-control" id="professionalUserName" name="uname"style="width:300px"placeholder="Enter your user name" required></center>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="id"class="control-label">User Id:</label>
                                                      <center>   <input type="text" class="form-control" id="professionalUserId"  name="uid"style="width:300px"placeholder="Enter your Id" required></center>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="newemail"class="control-label">Email:</label>
                                                       <center>  <input type="email" class="form-control" id="professionalEmailId" name="email"style="width:300px"placeholder="Enter new email" data-error="enter a valid email-address" required></center>
                                                      <div class="help-block with-errors"></div>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="newpwd"class="control-label">Password:</label>
                                                      <center>   <input type="password"  data-minlength="8"class="form-control"pattern=".{8,}" title="Must contain at least 8 or more characters"  name="pwd"id="professionalPassword"style="width:300px" placeholder="New password" required></center>
                                                <div class="help-block">Minimum of 8 characters</div>
                                                              </div>
                                                    <button type="submit" class="btn btn-default">Register</button>
                                                </form>
                                            </div>

                                        </div>
                                    </div>                                
                                </div>
                            </div>
                        </div>
</div> 

</div>
</div>
<div id="message">
  <h3>Password must contain the following:</h3>
  
  <p id="length" class="invalid">Minimum <b>8 characters</b></p>
</div>
				
<script>

var length = document.getElementById("length");
myInput.onfocus = function() {
    document.getElementById("message").style.display = "block";
}

myInput.onblur = function() {
    document.getElementById("message").style.display = "none";
}
 
  if(myInput.value.length >= 8) {
    length.classList.remove("invalid");
    length.classList.add("valid");
  } else {
    length.classList.remove("valid");
    length.classList.add("invalid");
  }

</script>



<div class="footer">
<center>
 <p>@copyright 2016-2020</p>
  </center>
</div>

</body>
</html>