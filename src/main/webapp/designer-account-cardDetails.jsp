<!DOCTYPE html>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login form</title>
    <link rel="stylesheet" href="./assets/css/designer_account.css" >

</head>
<body>

<div class="move">
    <div class="wrapper">
        <div class="title-text">
            <div class="title login">Card Details</div>
        </div>

        <div class="form-container">
            <div class="form-inner">
                <form action="PaymentDetails" class="login">

                    <div class="field">
                        <input type="text" name="accountNo" placeholder="Account Number" required>
                    </div>
                    <div class="field">
                        <input type="text" name="nameOnCard" placeholder="Name On Card" required>
                    </div>
                    <div class="field">
                        <input type="text" name="email" placeholder="CVV" required>
                    </div>
                    <div class="field">
                        <input type="submit" value="Register">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>