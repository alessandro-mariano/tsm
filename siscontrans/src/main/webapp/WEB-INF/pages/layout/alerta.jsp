<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:if test="${not empty error}">
	<div class="alert alert-danger fade in" style="margin-top:18px;">
		<a href="#" class="close" data-dismiss="alert" aria-label="close" title="close">×</a>
		${error}
	</div>
</c:if>
<c:if test="${not empty msg}">
	<div class="alert alert-success fade in" style="margin-top:18px;">
		<a href="#" class="close" data-dismiss="alert" aria-label="close" title="close">×</a>
		${msg}
	</div>
</c:if>