<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page session="true"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	    <!-- Meta, title, CSS, favicons, etc. -->
	    <meta charset="utf-8">
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	
	    <title>SisConTrans - Sistema de Controle de Transporte</title>
	    
	    <!-- Bootstrap core CSS -->
		<link href="resources/core/css/bootstrap.min.css" rel="stylesheet"/>
		<link href="resources/core/fonts/css/font-awesome.min.css" rel="stylesheet"/>

	    <!-- Custom styling plus plugins -->
	    <link href="resources/core/css/custom.css" rel="stylesheet"/>
	    
		<script src="resources/core/js/jquery.min.js"></script>
	
	    <!--[if lt IE 9]>
	        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
	        <![endif]-->
	
	    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
	    <!--[if lt IE 9]>
	          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
	          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
	        <![endif]-->
	        
		<style>
			body {
				background-image: url("resources/core/images/background.jpg");
				background-repeat: no-repeat;
				background-size: 100% !important;
				-moz-background-size: 100% 100% !important;
				-webkit-background-size: 100% 100%;
			}
			
			.error {
				padding: 15px;
				margin-bottom: 20px;
				border: 1px solid transparent;
				border-radius: 4px;
				color: #a94442;
				background-color: #f2dede;
				border-color: #ebccd1;
			}
		
			.msg {
				padding: 15px;
				margin-bottom: 20px;
				border: 1px solid transparent;
				border-radius: 4px;
				color: #31708f;
				background-color: #d9edf7;
				border-color: #bce8f1;
			}
		</style>
	</head>

	<body>
		<div id="wrapper">
        	<!-- content -->
            <div id="login" class="animate form">
            	<section class="login_content">
            		<c:if test="${not empty error}">
						<div class="error">${error}</div>
					</c:if>
					<c:if test="${not empty msg}">
						<div class="msg">${msg}</div>
					</c:if>
            		<!-- form -->
            		<form name="loginForm" action="<c:url value='/login' />" method="POST">
            			<input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}" />
            			
            			<h1>SISCONTRANS</h1>
					    <div>
					        <!-- <input type="text" class="form-control" placeholder="Login" required="" /> -->
					        <input type="text" name="username" class="form-control" placeholder="Login" required/>
					    </div>
					    <div>
					        <!-- <input type="password" class="form-control" placeholder="Senha" required="" /> -->
					        <input type="password" name="password" class="form-control" placeholder="Senha" required/>
					    </div>
					    <div>
					    	<input type="submit" value="Acessar" class="btn btn-default submit"/>
					        <a class="reset_pass" href="#">Esqueceu sua senha?</a>
					    </div>
					    <div class="clearfix"></div>
					    <br/>
					    <div class="separator">
					        <div class="clearfix"></div>
					        <div>
					            <p>©2016 TSM - Trans Souza Mariano. Todos direitos reservados.</p>
					        </div>
					    </div>
            		</form>
            		<!-- form -->
            	</section>
            </div>
            <!-- content -->
		</div>
	</body>
</html>