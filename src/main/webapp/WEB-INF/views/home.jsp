<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
    <head>
        <title>Talker</title>
        <link rel="stylesheet"
              type="text/css"
              href="<c:url value="/resources/style.css" /> " >
    </head>
    <body>
        <h1> Welcome to Talker! </h1>
        <a href="<c:url value="/talks" /> " >Talks</a> |
        <a href="<c:url value="talker/register"/> ">Registration</a>
    </body>
</html>