<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="full" lang="en">
<!-- Make sure the <html> tag is set to the .full CSS class. Change the background image in the full.css file. -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">
     <title>deal1</title>

    <!-- Bootstrap Core CSS -->
    <link href="css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="css/thumbnail-gallery.css" rel="stylesheet">

  
    <style>
	<!-- background image -->
	
body { 
  background: rgb(245,126,182) 
  -webkit-background-size: cover;
  -moz-background-size: cover;
  -o-background-size: cover;
  background-size: cover;
}

.container{
padding: 25px;   
}    
	<!-- end background image-->
	<!-- search box -->
	#search {
    float: right;
    margin-top: 9px;
    width: 250px;
}

.search {
    padding: 5px 0;
    width: 230px;
    height: 30px;
    position: relative;
    left: 10px;
    float: left;
    line-height: 22px;
}

    .search input {
        position: absolute;
        width: 0px;
        float: Left;
        margin-left: 210px;
        -webkit-transition: all 0.7s ease-in-out;
        -moz-transition: all 0.7s ease-in-out;
        -o-transition: all 0.7s ease-in-out;
        transition: all 0.7s ease-in-out;
        height: 30px;
        line-height: 18px;
        padding: 0 2px 0 2px;
        border-radius:1px;
    }

        .search:hover input, .search input:focus {
            width: 200px;
            margin-left: 0px;
        }

.btn {
    height: 30px;
    position: absolute;
    right: 0;
    top: 5px;
    border-radius:1px;
}

	<!-- search box -->
	</style>

  <script>
    function myFunction() {
    var input, filter, ul, li, a, i;
    input = document.getElementById("myInput");
    filter = input.value.toUpperCase();
    ul = document.getElementById("myUL");
    li = ul.getElementsByTagName("li");
    for (i = 0; i < li.length; i++) {
        a = li[i].getElementsByTagName("a")[0];
        if (a.innerHTML.toUpperCase().indexOf(filter) > -1) {
            li[i].style.display = "";
        } else {
            li[i].style.display = "none";

        }
    }
}
</script> 
</head>

<body>
    <!-- Page Content -->
    <div class="container" style="background-color:rgb(245,126,182)">
    		
             <!--banner-->
             <div id="myCarousel" class="carousel slide" data-ride="carousel">
    
      <!-- Wrapper for slides -->
      <div class="carousel-inner">
      
        <div class="item active">
        
          <img src="images/deal_img.png" style="margin-left:270px">
          
           <div class="carousel-caption">
            <h3><font color=red><b>दिवा Stay</font></b></h3>
            <p><b></b><font color=black>Find nearest and best deals on hostels</b></font></p>
          </div>
        </div><!-- End Item -->
        </div>
   
    <!-- / banner -->
        <!-- /.row -->
    </div>
    <!-- /.container -->
    
     <div class="container">
     
	<div class="row">
	<!---<input type="text" id="myInput" onkeyup="myFunction()" placeholder="Search for city" title="Type in a name">-->
        <div class="search" style="float:right;">
			<input type="text" id="myInput" onKeyUp="myFunction()" class="form-control input-sm" maxlength="64" placeholder="Search cities"/>
 			<button type="submit" class="btn btn-primary btn-sm">Search</button>
		</div>
   </div>
        <div class="row">

            <div class="col-lg-12">
                <h1 class="page-header">Choose Cities</h1>
            </div>
<ul id="myUL">

            <div class="col-lg-3 col-md-4 col-xs-6 thumb">
              <li>  <a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_aurangabad.png" alt="">
                    
                  <div class="caption">
                    <p>Aurangabad</p>
                    </div>  
                </a></li>
            </div>
            
            <div class="col-lg-3 col-md-4 col-xs-6 thumb">
               <li> <a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_mumbai.png" alt="">
                    <div class="caption">
                    <p>Nashik</p>
                    </div>
                </a></li>
            </div>
          <div class="col-lg-3 col-md-4 col-xs-6 thumb">
              <li>  <a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_pune2.png" alt="">
                    <div class="caption">
                    <p>Pune</p>
                    </div>
                </a></li>
            </div>
            <div class="col-lg-3 col-md-4 col-xs-6 thumb">
              <li>  <a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_mumbai.png" alt="">
                    <div class="caption">
                    <p>Mumbai</p>
                    </div>
                </a></li>
            </div>
           <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                <li><a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_pune (2).png" alt="">
                    <div class="caption">
                    <p>Pune</p>
                    </div>
                    
                </a></li>
            </div>
           <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                <li><a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_nagpur.png" alt="">
                    
                    <div class="caption">
                    <p>Nagpur</p>
                    </div>
                </a></li>
            </div>
           <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                <li><a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_mumbai.png" alt="">
                    <div class="caption">
                    <p>Mumbai</p>
                    </div>
                </a></li>
            </div>
            <div class="col-lg-3 col-md-4 col-xs-6 thumb">
               <li> <a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_pune-city.png" alt="">
                    <div class="caption">
                    <p>Pune</p>
                    </div>
                </a></li>
            </div>
           <div class="col-lg-3 col-md-4 col-xs-6 thumb">
                <li><a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_pune2.png" alt="">
                    <div class="caption">
                    <p>Pune</p>
                    </div>
                    
                </a></li>
            </div>
            <div class="col-lg-3 col-md-4 col-xs-6 thumb">
               <li> <a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_solapur.png" alt="">
                    <div class="caption">
                    <p>Solapur</p>
                    </div>
                </a></li>
            </div>
            <div class="col-lg-3 col-md-4 col-xs-6 thumb">
               <li> <a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_pune-city.png" alt="">
                    <div class="caption">
                    <p>Pune</p>
                    </div>
                </a></li>
            </div></li>
            <div class="col-lg-3 col-md-4 col-xs-6 thumb">
               <li> <a class="thumbnail" href="#">
                    <img class="img-responsive" src="images/deal1_kolhapur.png" alt="">
                    <div class="caption">
                    <p>Kolhapur</p>
                    </div>
                </a></li>
            </div>
        </div>

        <hr>
    </ul>

   
  
</body>

</html>
