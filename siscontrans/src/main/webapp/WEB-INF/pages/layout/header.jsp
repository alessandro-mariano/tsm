<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<c:url value="/perform_logout" var="logoutUrl" />
<form action="${logoutUrl}" method="post" id="logoutForm">
	<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
	<div class="top_nav">
		<div class="nav_menu">
			<nav class="" role="navigation">
			
				<div class="nav toggle">
					<a id="menu_toggle"><i class="fa fa-bars"></i></a>
				</div>

				<ul class="nav navbar-nav navbar-right">
					<li role="presentation" class="dropdown">
						<a id="drop4" href="javascript:formSubmit();" class="dropdown-toggle" role="button">
							<i class="fa fa-power-off"></i>
						</a>
					</li>
				</ul>
			</nav>
		</div>
	</div>
</form>

<script>
	function formSubmit() {
		document.getElementById("logoutForm").submit();
	}
</script>