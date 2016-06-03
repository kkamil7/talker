<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="s" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page contentType="text/html; charset=UTF-8" %>

<html>
    <head>
        <title>Talk</title>
        <link rel="stylesheet" type="text/css" href="<c:url value="/resources/style.css"/> ">
    </head>
    <body>
        <div class="listTitle">
            <h1>the last talks</h1>
            <ul class="talkList">
                <c:forEach items="${talkList}" var="talk">
                    <li id="talk_<c:out value="talk.id"/> ">
                        <div class="talkMessage">
                            <c:out value="${talk.message}"/>
                        </div>
                        <div>
                            <span class="talkTime"><c:out value="${talk.time}"/></span>
                            <span class="talkLocation">
                                (<c:out value="${talk.latitude}"/>,
                                <c:out value="${talk.longitude}"/>)
                            </span>
                        </div>
                    </li>
                </c:forEach>
            </ul>
        </div>
    </body>
</html>