<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:forEach items="${resultMap}" var="entry">
    ${entry.key}, ${entry.value}<br>
</c:forEach>