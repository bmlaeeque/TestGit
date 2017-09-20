<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <title>Payment Page</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="css/bootstrap.min.css">
  <script src="js/jquery.min.js"></script>
  <script src="js/bootstrap.min.js"></script>
 <style>
 /*button color code*/
 .form-basic button{
   
    border-radius: 2px;
    background-color:#66CC66;
    color: #ffffff;
    font-weight: bold;
    box-shadow: 1px 2px 4px 0 rgba(0, 0, 0, 0.08);
    padding: 5px 32px;
    border: 0;
    margin: 10px 110px 0;
	}
	
	/*select design code*/
	.form-basic select{
    background: none repeat scroll 0 0 #FFFFFF;
    border: 1px solid #E5E5E5;
    border-radius: 5px 5px 5px 5px;
    height: 35px;
    margin: 0 0 0 10px;
    padding: 5px;
 
}
</style>
</head>
<body>
<div class="container">    
  <div class="row">
  
    <div class="bs-example" align="center">
      <h4><font color="#000000">Payment Details</font></h4>
        <ul class="nav nav-tabs">
         <li class="active"><a data-toggle="tab" href="#creditCard">Credit Card</a></li>
         <li><a data-toggle="tab" href="#debitCard">Debit Card</a></li>
         <li><a data-toggle="tab" href="#netBanking">Net Banking</a></li>
         <li><a data-toggle="tab" href="#wallets">Wallets</a></li>
        </ul>    
    </div>

   <div class="tab-content">
   
   <!--credit card code start-->
     <div id="creditCard" class="tab-pane fade in active" >
       <div class="container">
   
         <div class="row">
           <div class="col-xs-12 col-md-5">
            <!-- CREDIT CARD FORM STARTS HERE -->
            <div class="panel panel-default credit-card-box" style="background-color: rgb(243,210,230);">
            
                <div class="panel-heading display-table" >
                    <div class="row display-tr" >
                        <h3 class="panel-title display-td" >Payment Details</h3>
                        <div class="display-td" >                            
                            <img class="img-responsive pull-right" src="images/payment_logoImg.png">
                        </div>
                    </div>                    
                </div>
               <div class="panel-body">
               <form class="form-basic" role="form" id="creditCardForm" method="POST" action="save" name="creditCardForm" onSubmit="return CreditSubmit();" >
               
                 <div class="row">
                    <div class="col-xs-12">
                        <div class="form-group">
                           <label for="name">NAME ON CARD</label>
                              <input type="text" class="form-control" name="creditName" id="creditName" onBlur="CheckCreditName(); return false;" required autocomplete="off"/>
                         </div>
                     </div>                        
                 </div>
                    
                  <div class="row">
                     <div class="col-xs-12">
                        <div class="form-group">
                           <label for="cardNumber">CARD NUMBER</label>
                              <div class="input-group">
                                 <input type="text" class="form-control" name="cardNumber" id="cardNumber" placeholder="Valid Card Number" onBlur="creditCard(document.creditCardForm.cardNumber)" required autocomplete="off"/>
                                  <span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
                              </div>
                         </div>                            
                       </div>
                    </div>
                        
                    <div class="row">
                       <div class="col-xs-8 col-md-8">
                          <div class="form-group">
                     <label>Expiration</label>
                     <br>
                <select required >
                    <option value="">Month</option>
                    <option value="01">January</option>
                    <option value="02">February </option>
                    <option value="03">March</option>
                    <option value="04">April</option>
                    <option value="05">May</option>
                    <option value="06">June</option>
                    <option value="07">July</option>
                    <option value="08">August</option>
                    <option value="09">September</option>
                    <option value="10">October</option>
                    <option value="11">November</option>
                    <option value="12">December</option>
                </select> 
              
                <select required>
                    <option value="">Year</option>
                    <option value="17"> 2017</option>
                    <option value="18"> 2018</option>
                    <option value="19"> 2019</option>
                    <option value="20"> 2020</option>
                    <option value="21"> 2021</option>
                    <option value="22"> 2022</option>
                    <option value="23"> 2023</option>
                    <option value="24"> 2024</option>
                    <option value="25"> 2025</option>
                    <option value="26"> 2026</option>
                    <option value="27"> 2027</option>
                    <option value="28"> 2028</option>
                    <option value="29"> 2029</option>
                    <option value="30"> 2030</option>
                    <option value="31"> 2031</option>
                </select >
                </div>
              </div>
               <div class="col-xs-4 col-md-4 pull-right">
                 <div class="form-group">
                    <label class="col-xs-5 control-label">CVC</label>
                     <input  type="text" class="form-control" name="cardCVC" id="cardCVC" placeholder="CVC" required onBlur="CheckCVV(); return false;" autocomplete="off"/>
                  </div>
               </div>
           </div>
              
               <div class="row">
                  <div class="col-xs-12">
                     <button type="submit" value="Submit">Submit</button>
                  </div>
               </div>
                  </form>
                </div>
            </div>            
            <!-- CREDIT CARD FORM ENDS HERE --> 
        </div>           
     </div>
   </div>
</div>
    <!--credit card code end-->
    
     <!--debit card code start-->
    <div id="debitCard" class="tab-pane">
      <div class="container">
       <div class="row">
         <div class="col-xs-12 col-md-5">
            <!-- DEBIT CARD FORM STARTS HERE -->
           <div class="panel panel-default credit-card-box" style="background-color: rgb(243,210,230);">
              <div class="panel-heading display-table" >
                 <div class="row display-tr" >
                    <h3 class="panel-title display-td" >Payment Details</h3>
                      <div class="display-td" >                            
                          <img class="img-responsive pull-right" src="images/payment_logoImg.png">
                      </div>
                 </div>                    
              </div>
                
          <div class="panel-body">
            <form class="form-basic" role="form" id="debitCardForm" method="POST" action="save" name="debitCardForm" onSubmit="return DebitSubmit();">
              <div class="row">
                <div class="col-xs-12">
                   <div class="form-group">
                      <label for="name">NAME ON CARD</label>
                          <input type="text" class="form-control" name="debitName" id="debitName" onBlur="CheckDebitName(); return false;" required autofocus />
                   </div>
                </div>                        
              </div>
                    
             <div class="row">
               <div class="col-xs-12">
                  <div class="form-group">
                     <label for="debitcardNumber">CARD NUMBER</label>
                       <div class="input-group">
                         <input  type="tel" class="form-control" name="debitcardNumber" id="debitcardNumber" placeholder="Valid Card Number" onBlur="debitCard(document.debitCardForm.debitcardNumber)" required />
                            <span class="input-group-addon"><i class="fa fa-credit-card"></i></span>
                      </div>
                  </div>                            
               </div>
             </div>
             <div class="row">
                <div class="col-xs-8 col-md-8">
                   <div class="form-group">
                     <label>Expiration</label>
                     <br>
                <select required >
                    <option value="">Month</option>
                    <option value="01">January</option>
                    <option value="02">February </option>
                    <option value="03">March</option>
                    <option value="04">April</option>
                    <option value="05">May</option>
                    <option value="06">June</option>
                    <option value="07">July</option>
                    <option value="08">August</option>
                    <option value="09">September</option>
                    <option value="10">October</option>
                    <option value="11">November</option>
                    <option value="12">December</option>
                </select > 
               <select required>
                    <option value="">Year</option>
                    <option value="17"> 2017</option>
                    <option value="18"> 2018</option>
                    <option value="19"> 2019</option>
                    <option value="20"> 2020</option>
                    <option value="21"> 2021</option>
                    <option value="22"> 2022</option>
                    <option value="23"> 2023</option>
                    <option value="24"> 2024</option>
                    <option value="25"> 2025</option>
                    <option value="26"> 2026</option>
                    <option value="27"> 2027</option>
                    <option value="28"> 2028</option>
                    <option value="29"> 2029</option>
                    <option value="30"> 2030</option>
                    <option value="31"> 2031</option>
                </select >
                 </div>
              </div>
              <div class="col-xs-4 col-md-4 pull-right">
                 <div class="form-group">
                    <label for="debitcardCVC">CV CODE</label>
                      <input type="text" class="form-control" name="debitcardCVC" id="debitcardCVC" placeholder="CVC"  onBlur="CheckDebitCVV(); return false;" required />
                 </div>
              </div>
             </div>
                <div class="row">
                    <div class="col-xs-12">
                        <button type="submit" value="Submit">Submit</button>
                     </div>
                </div>
              </form>
                </div>
            </div>            
            <!-- DEBIT CARD FORM ENDS HERE --> 
        </div>           
      </div>
    </div>
 </div> 
      <!--debit card code end-->
        
         <!--net banking code start-->
        <div id="netBanking" class="tab-pane">
          <div class="container">
            <div class="row">
              <div class="col-xs-12 col-md-5">
            <!-- NET BANKING STARTS HERE -->
            <div class="panel panel-default credit-card-box" style="background-color: rgb(243,210,230);">
              <div class="panel-heading display-table" >
                <div class="row display-tr" >
                   <h3 class="panel-title display-td" >Payment Details</h3>
                     <div class="display-td" >                            
                            <img class="img-responsive pull-right" src="images/payment_logoImg.png">
                     </div>
                </div>                    
               </div>
         <div class="panel-body">
           <form class="form-basic" role="form"  method="POST" action="save" name="netBanking" onSubmit="return NetBanking();">
             <h4 align="center">Net Banking</h4>
               <div class="form-row" style="float:left; width:50%;">  
                <label>
                  <input type="radio"  name="sameName" id="andhraBank"  value="andhraBank" ><label>Andhra Bank</label><br>
                  <input type="radio"  name="sameName" id="allahabadBank" value="allahabadBank"><label>Allahabad Bank</label><br>
                  <input type="radio"  name="sameName" id="bankofBaroda" value="bankofBaroda"><label>Bank of Baroda</label><br>
                  <input type="radio"  name="sameName" id="canaraBank" value="canaraBank"><label>Canara Bank</label><br>
                  <input type="radio"  name="sameName" id="idbiBank" value="idbiBank"><label>IDBI Bank</label><br>
                  <input type="radio"  name="sameName" id="iciciBank" value="iciciBank"><label>Icici Bank</label><br>
                  <input type="radio"  name="sameName" id="indianOverseasBank" value="indianOverseasBank"><label>Indian Overseas Bank</label><br>
                  <input type="radio"  name="sameName" id="punjabNationalBank" value="punjabNationalBank"><label>Punjab National Bank</label><br>
                  <input type="radio"  name="sameName" id="southIndianBank" value="southIndianBank"><label>South Indian Bank</label><br>
                  <input type="radio"  name="sameName" id="sbi"  value="sbi"><label>State Bank Of India</label><br>
              </label>  
            </div>
            
           <div class="form-row" style="float:left; width:50%;">  
             <label>
               <input type="radio" name="sameName" id="cityUnionBank"  value="cityUnionBank"><label>City Union Bank</label><br>
               <input type="radio" name="sameName" id="hdfcBank" value="hdfcBank"><label>HDFC Bank</label><br>
               <input type="radio" name="sameName" id="indusIndBank" value="indusIndBank"><label>IndusInd Bank</label><br>
               <input type="radio" name="sameName" id="syndicateBank" value="syndicateBank"><label>Syndicate Bank</label><br>
               <input type="radio" name="sameName" id="deutscheBank" value="deutscheBank"><label>Deutsche Bank</label><br>
               <input type="radio" name="sameName" id="corporationBank" value="corporationBank"><label>Corporation Bank</label><br>
               <input type="radio" name="sameName" id="ucoBank" value="ucoBank"><label>UCO Bank</label><br>
               <input type="radio" name="sameName" id="indianBank" value="indianBank"><label>Indian Bank</label><br>
               <input type="radio" name="sameName" id="fedralBank" value="fedralBank"><label>Federal Bank</label><br>
               <input type="radio" name="sameName" id="ingVysya" value="ingVysya"><label>ING Vysya Bank</label><br>
              </label>  
            </div>
            <div class="row">
               <div class="col-xs-5">
                   <button type="submit" value="Submit">Submit</button>
                </div>
            </div>
                </form>
                </div>
            </div>            
            <!-- NET BANKING ENDS HERE --> 
        </div>           
     </div>
  </div>
</div> 
   <!--net banking code end-->
          
   <!--wallet code start-->  
        <div id="wallets" class="tab-pane">
           <div class="container">
              <div class="row">
                 <div class="col-xs-12 col-md-5">
            <!-- WALLETS STARTS HERE -->
            <div class="panel panel-default credit-card-box" style="background-color: rgb(243,210,230);">
                <div class="panel-heading display-table" >
                    <div class="row display-tr" >
                        <h3 class="panel-title display-td" >Payment Details</h3>
                        <div class="display-td" >                            
                            <img class="img-responsive pull-right" src="img/payment_logoImg.png">
                        </div>
                    </div>                    
                </div>
           <div class="panel-body">
            <form role="form" class="form-basic" id="wallet" name="wallet" method="POST" action="save" onSubmit="return Wallet();">
                         <h4 align="center">Select Your Wallet</h4>
                         
              <div class="form-row" style="float:left; width:50%;">  
                <label>
                 <input type="radio"  name="sameName" id="paytm" value="paytm"> &nbsp;<img src="images/paytm-logo.png">
                 &nbsp;
                 <input type="radio"  name="sameName" id="freecharge" value="freeCharge">&nbsp;&nbsp;<img src="images/freecharge_logo.png"><br>
                </label>  
              </div>
                     
           <div class="row">
               <div class="col-xs-12">
                   <button type="submit" value="Submit">Submit</button>
                </div>
          </div>
               </form>
              </div>
           </div>            
            <!-- WALLETS  ENDS HERE --> 
         </div>           
       </div>
   </div>
</div>
<!--wallet code end-->  
 
     </div>
   </div>
 </div>	  

<hr>
<script src="js/paymentvalidation.js" type="text/javascript"></script>

</body>
</html>