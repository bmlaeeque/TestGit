<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="css/footer.css" rel="stylesheet">
<link href="css/btninfo.css" rel="stylesheet">
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Footer</title>
</head>
<body>
   <footer id="footer" style="background-color: rgb(245,126,182);">
        <div class="container-fluid">
            <div class="row">
               <!--  <div class="col-xs-6 col-sm-3 column">
                    <h4>Information</h4>
                    <ul class="list-unstyled">
                        <li><a href="">Products</a></li>
                        <li><a href="">Services</a></li>
                        <li><a href="">Benefits</a></li>
                        <li><a href="">Developers</a></li>
                    </ul>
                </div>
                <div class="col-xs-6 col-sm-3 column">
                    <h4>About</h4>
                    <ul class="list-unstyled">
                        <li><a href="#">Contact Us</a></li>
                        <li><a href="#">FAQs</a></li>
                        <li><a href="#">Privacy Policy</a></li>
                        <li><a href="#">Terms &amp; Conditions</a></li>
                    </ul>
                </div> -->
                <div class="col-xs-12 col-sm-3 column">
                    <h4>Stay Posted</h4>
                    <form>
                        <div class="form-group">
                          <input type="text" class="form-control" title="No spam, we promise!" placeholder="Tell us your email">
                        </div>
                        <div class="form-group" align="left">
                          <button class="btn btn-info" data-toggle="modal" data-target="#alertModal" type="button" style="background-color: #00B0B9; color: black; border-radius: 25px">Subscribe for updates</button>
                        </div>
                    </form>
                </div>
                <div class="col-xs-12 col-sm-3 column" align="right">
                       <h4>Follow Us</h4>
							<ul class="social-icon">
								<li class="bglight-blue"><i class="fa fa-facebook"></i></li>
								<li class="bgred"><i class="fa fa-google-plus"></i></li>
								<li class="bgdark-blue"><i class="fa fa-linkedin"></i></li>
								<li class="bglight-blue"><i class="fa fa-twitter"></i></li>
							</ul>
						</div>
                </div>
            <br/>
            <span class="pull-right text-muted small"><a href="http://www.bootstrapzero.com">DivaStays</a> ©2017 smsone.co.in</span>
        </div>
    </footer>
    <style>
    .element {
position: relative;
}

/*replace the content value with the
corresponding value from the list below*/

.element:before {
content: "\f000";
font-family: FontAwesome;
font-style: normal;
font-weight: normal;
text-decoration: inherit;
/*--adjust as necessary--*/
color: #000;
font-size: 18px;
padding-right: 0.5em;
position: absolute;
top: 10px;
left: 0;
}
    </style>
</body>
</html>