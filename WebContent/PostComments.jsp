<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Report Misfortune</title>

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
.fontstyle{
font-style:oblique;
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
        <li><a href="HomePage.jsp">   Home   </a></li>
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
<div class="container">
<br><br>
<center>
<form action = "CommentPost" method="POST">
	
		<textarea class="fontstyle" name = "text" placeholder="type here..." style="width:600px;height:250px;" ></textarea>
									 <br><br>
									  
		<button type="submit"class="btn btn-success green" >Comment</button>
	
				</form><br>
				<form action="DisplayComments">
				<button type="submit"class="btn btn-success green" >Display Comments</button>
				</form>
				</body>
							</center>		
									</div>
									<p>${commentList}</p>
<div class="footer">
<center>
 <p>@copyright 2016-2020</p>
  </center>
</div>
									
</html>