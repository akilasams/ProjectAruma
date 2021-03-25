<%--
  Created by IntelliJ IDEA.
  User: hp
  Date: 22/3/2021
  Time: 8:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Rate-Item</title>
    <link rel="stylesheet" href="assets/css/addRate.css">

    <style>
        input[type=text], select {
            width: 100%;
            padding: 12px 20px;
            margin: 8px 0;
            display: inline-block;
            border: 1px solid #ccc;
            border-radius: 4px;
            box-sizing: border-box;
        }

        input[type=submit] {
            width: 100%;
            background-color: coral;
            color: white;
            padding: 14px 20px;
            margin: 8px 0;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type=submit]:hover {
            background-color: coral;
        }

        /*btns {*/
        /*    border-radius: 5px;*/
        /*    background-color: #f2f2f2;*/
        /*    padding: 20px;*/
        /*}*/
    </style>
</head>
<body>
<form action="addRatings" method="post">

<div class="backgrnd" >
    <div class="center">
        <div class="stars">

            <input type="radio" id="five" name="rate" value="5">
            <label for="five"></label>

            <input type="radio" id="four" name="rate" value="4">
            <label for="four"></label>

            <input type="radio" id="three" name="rate" value="3">
            <label for="three"></label>

            <input type="radio" id="two" name="rate" value="2">
            <label for="two"></label>

            <input type="radio" id="one" name="rate" value="1">
            <label for="one"></label>


        </div>
        <div class="btns" >
            <input type="text" name="review" placeholder="add review ">
            <input type="submit" value="submit">
        </div>
    </div>
</div>
</form>

</body>
</html>


