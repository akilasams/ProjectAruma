<%@ page import="java.util.Date" %>
<%@ page import="java.time.LocalDate" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Add Design</title>
    <link rel="stylesheet" href="assets/css/style.css">
    <link rel="stylesheet" href="assets/css/forms.css">
    <script src="assets/js/forms.js"></script>
</head>
<body>

<%
    String design_id = (String) request.getParameter("design_id");
    Date date = new Date();
    LocalDate myObj = LocalDate.now();


%>

<div id="form-container">
    <h2>Add Specifics for selected design</h2>
    <form action="storeServlet" method="post">

        <input type="hidden" name="design_id" value="<%=design_id%>" placeholder="Stock" ><br>
        <input type="text" name="stock" placeholder="Stock"   ><br>
        <input type="text" name="unit_price"  placeholder="Unit Price" ><br>
        <textarea name="additional_details" placeholder="Additional Details" cols="30" rows="10" placeholder="Write Something About the Course" ></textarea><br>
        <input type="hidden" name="published_date" value="<%=myObj%>" placeholder="Published Date" ><br>


        <button type="submit" name="submit">Add Specifics to My Designs</button>
    </form>
</div>
</body>
</html>
