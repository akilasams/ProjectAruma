<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="A.css">

</head>
<body>
		 <b>
  <div class="row">
  <div class="col-75">
    <div class="container">
    <br><br>
    
      <form action="Payment" method="post">

        <div class="row">
          <div class="col-50">
            <h2>Card Details</h2>
            <label for="acc_no"><i class="fa fa-user"></i>Account_no</label>
            <input type="text"  name="account_no">
            <label for="cardname"><i class="fa fa-envelope"></i>Card Name</label>
            <input type="text"  name="name_on_card" >
            <label for="cvcode"><i class="fa fa-address-card-o"></i>CV Code</label>
            <input type="text" name="cv_code" >
            
            </div>
          </div>
          <input type="submit" value="Submit" class="btn">

  
  </div>
</div>
	
</body>
</html>