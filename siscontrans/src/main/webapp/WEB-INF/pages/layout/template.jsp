<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>  
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ page session="true"%>
<!DOCTYPE html>
<html lang="pt-BR">
	<head>
	    <!-- Meta, title, CSS, favicons, etc. -->
	    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	    <meta charset="utf-8">
	    <meta http-equiv="X-UA-Compatible" content="IE=edge">
	    <meta name="viewport" content="width=device-width, initial-scale=1">
	
	    <title>SisConTrans - Sistema de Controle de Transporte</title>

		<!-- Bootstrap core CSS -->
		<link href="${pageContext.servletContext.contextPath}/resources/core/css/bootstrap.min.css" rel="stylesheet"/>
		<link href="${pageContext.servletContext.contextPath}/resources/core/fonts/css/font-awesome.min.css" rel="stylesheet"/>
		<link href="${pageContext.servletContext.contextPath}/resources/core/css/jquery-ui.min.css" rel="stylesheet">

	    <!-- Custom styling plus plugins -->
	    <link href="${pageContext.servletContext.contextPath}/resources/core/css/custom.css" rel="stylesheet"/>
	    <!-- <link href="${pageContext.servletContext.contextPath}/resources/core/css/icheck/flat/green.css" rel="stylesheet"> -->
	    
		<script src="${pageContext.servletContext.contextPath}/resources/core/js/jquery.min.js"></script>
		<script src="${pageContext.servletContext.contextPath}/resources/core/js/jquery-ui.min.js"></script>
		<script src="${pageContext.servletContext.contextPath}/resources/core/js/jquery.mask.min.js"></script>

        <!--[if lt IE 9]>
        <script src="../assets/js/ie8-responsive-file-warning.js"></script>
        <![endif]-->

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
    </head>
    <body class="nav-md">
        <div class="container body">
			<div class="main_container">
				<!-- menu -->
				<tiles:insertAttribute name="menu" />  
				<!-- menu -->

				<!-- top navigation -->
				<tiles:insertAttribute name="header" />
				<!-- /top navigation -->
				
				<div class="clearfix"></div>

				<!-- page content -->
				<div class="right_col" role="main">
					<div>
						<div class="row">
							<div class="col-md-12 col-sm-12 col-xs-12">
								<div class="x_panel" style="">
									<div class="x_title">
										<h2><tiles:insertAttribute name="title" /></h2>
										<ul class="nav navbar-right panel_toolbox">
											<li><a class="collapse-link"><i class="fa fa-chevron-up"></i></a></li>
										</ul>
										<div class="clearfix"></div>
									</div>
									<!-- mensagem alerta -->
									<tiles:insertAttribute name="alerta" />
									<!-- mensagem alerta -->
									<div class="x_content">
										<tiles:insertAttribute name="body" />
									</div>
								</div>
							</div>
						</div>
					</div>

					<!-- footer content -->
					<tiles:insertAttribute name="footer" />
					<!-- /footer content -->
				</div>
				<!-- /page content -->
			</div>
		</div>

		<!-- Bootstrap Core -->
		<script src="${pageContext.servletContext.contextPath}/resources/core/js/bootstrap.min.js"></script>
		
		<!-- Timepicker -->
		<script src="${pageContext.servletContext.contextPath}/resources/core/js/jquery-ui-timepicker-addon.js"></script>
		
		<!-- daterangepicker -->
		<script type="text/javascript" src="${pageContext.servletContext.contextPath}/resources/core/js/datepicker/daterangepicker.js"></script>
		
		<!-- chart js -->
		<!-- <script src="${pageContext.servletContext.contextPath}/resources/core/js/chartjs/chart.min.js"></script> -->

		<!-- bootstrap progress js -->
		<!-- <script src="${pageContext.servletContext.contextPath}/resources/core/js/progressbar/bootstrap-progressbar.min.js"></script> -->
		<!-- <script src="${pageContext.servletContext.contextPath}/resources/core/js/nicescroll/jquery.nicescroll.min.js"></script> -->

		<!-- icheck -->
		<!-- <script src="${pageContext.servletContext.contextPath}/resources/core/js/icheck/icheck.min.js"></script> -->
				
		<script src="${pageContext.servletContext.contextPath}/resources/core/js/custom.js"></script>
		<script src="${pageContext.servletContext.contextPath}/resources/core/js/siscontrans.js"></script>
	</body>
</html>