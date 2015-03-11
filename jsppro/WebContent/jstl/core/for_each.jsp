<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<title> Tag Example</title>
</head>
<body>

<c:forEach var="index" begin="1" end="5">
   Item <c:out value="${index}"/><p>
</c:forEach>

</body>
</html>