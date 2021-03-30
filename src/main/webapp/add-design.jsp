<%--
  Created by IntelliJ IDEA.
  User: Akila Samarawickrama
  Date: 10/27/2020
  Time: 3:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<c:if test="${userId == null}">
    <c:redirect url="login.jsp"></c:redirect>
</c:if>

<html>
<head>
    <title>Add Design</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/forms.css">
</head>
<body>
<div id="form-container">
    <h2>Add New Item</h2>
    <form id="user-form" action="StoreRegServlet" method="post">
        <input type="text" name="design_name" placeholder="Enter Item Name"><br>
        <%--            <input type="text" name="design_type" placeholder="design_type"><br>--%>
        <textarea name="design_description" id="design_description" cols="30" rows="10" placeholder="Item Description"></textarea><br>
        <select name="designtype_id" id="" >
            <option value="none">Select a Category</option>
            <option value="1">Graphic Design</option>
            <option value="5">Handi-Craft</option>
            <option value="2">Fashion</option>
            <option value="4">Video/Audio</option>
            <option value="3">Art</option>
            <option value="6">Greeting Cards</option>
            <option value="7">Other</option>
        </select><br>
        <label id="filename" for="filename">Upload an Image</label><br>
        <input type="file" name="filename"><br>
        <button type="submit" name="submit">Add to My Designs</button>
    </form>
</div>
</body>
</html>
