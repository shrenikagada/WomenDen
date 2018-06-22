<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd ">

<html>
<head style="background-color: pink;">

<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WomenDen</title>

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
    @media (min-width:576px;)
    {
    .jumbotron{
    margin-bottom:0;
    margin-top:0;
    padding-bottom:0;
    }
    }
    </style>
</head>

<body style="background-color: #A7ABAE;">
<div class="container-fuild">
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

        <li><a href="HomePage.jsp"> PostProblems </a></li>
        <li><a href="PostComments.jsp"> ReportMisfortune </a></li>
      </ul>
      
    </div>
  </div>
</nav>
 <!-- <header class="page-heading"> -->
 <div class="jumbotron">
	<img src=".\Images\WomenDen.jpg" class="img-responsive" style="width:100%" alt="Image">
</div>
<!-- </header>-->
 
  
  
<div class="container-fluid bg-3 text-center">    
  <!--<h3><b>YOU GET</b></h3><br>-->
  <div class="row">
   
    <div class="col-sm-4"  style="width:33%;height:100%"> 
   	  
     <a href="PoliceStations.html"> <img src=".\Images\policestation1.jpeg" class="img-rounded"  alt="Image" style="width:60%;height:195px" ></a>
   
   <!--  <p>
    <a href="#" class="btn btn-default" role="button">button</a>
    </p>-->
    </div>
    <div class="col-sm-4" style="width:33%;height:50%"> 
      
     <a href="DisplayCrowd"> <img src=".\Images\CrowdZone.jpg" class="img-rounded" alt="Image" style="width:60%;height:60%" ></a>
    </div>
    <div class="col-sm-4" style="width:33%;height:50%"> 
     
     <a href="DisplayCrime"> <img src=".\Images\Crimes.jpg" class="img-rounded"  alt="Image" style="width:58%;height:58%" ></a>
    </div>
      </div>
</div><br>
<br>
<br>
<div class="container-fluid bg-3 text-center">    
  <div class="row ">
  
   <div class=" col-xs-4 col-md-2 ">
  </div>
  
  <div class="col-xs-4 col-md-2" style="width:33%;height:50%">    
      <a href="PostComments.jsp"><img src=".\Images\reportmisfortune.jpeg" class="img-rounded"  alt="Image" style="width:59%;height:185px" ></a>
    </div>
  
    <div class="col-xs-4 col-md-2 " style="width:33%;height:50%"> 
     <a href="HomePage.jsp"> <img src=".\Images\postproblem.jpeg" class="img-rounded"  alt="Image" style="width:59%;height:185px" ></a>
    </div>  
  </div>
</div><br><br>
</div>


<footer class="container-fluid text-center">
<center>
  <p>@copyright 2016-2018 </p>
  </center>
</footer>

</body>
</html>