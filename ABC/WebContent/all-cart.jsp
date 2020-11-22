<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@include file="header-bar.jsp"%>

<head>
	<link rel="stylesheet" href="tables.css">
</head>

<div class="table-wrapper">
    <table>
        <caption>My Cart</b></caption>

        <tr>
            <th>Design Number</th>
            <th>Quantity</th>
            <th>Price</th>
             <th>Description</th>
             
            
        </tr>

        <c:forEach var="item" items="${itemList}">
        <tr>
            <td><c:out value="${item.design_id}"/></td>
            <td><c:out value="${item.quantity}"/></td>
            <td><c:out value="${item.unit_price}"/></td>
            <td><c:out value="${item.additional_details}"/></td>
         
            
        </tr>
        </c:forEach>
    </table>
</div>


<%@include file="footer-bar.jsp"%>