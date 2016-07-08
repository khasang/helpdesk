<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div class="row">
    <div class="col-md-4">
        <%--logo--%>
        <a href="<c:url value="/"/>">
            <img class="img-responsive img-rounded" src="<c:url value="/resources/images/logo.jpg"/>">
        </a>
    </div>
    <div class="col-md-8 sile-description">
        <%--site description--%>
        <h3><spring:message code="header.description.title"/></h3>
        <p><spring:message code="header.description.text"/></p>
    </div>
</div>