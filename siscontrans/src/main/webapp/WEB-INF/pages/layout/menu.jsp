<div class="col-md-3 left_col">
	<div class="left_col scroll-view">
		<div class="navbar nav_title" style="border: 0;">
			<a href="index.html" class="site_title"><i class="fa fa-cam"></i> <span>SisConTrans</span></a>
		</div>
		<!-- menu prile quick info -->
		<div class="profile">
			<div class="profile_pic">
				<img src="${pageContext.servletContext.contextPath}/resources/core/images/user.png" alt="..." class="img-circle profile_img">  
			</div>
			<div class="profile_info">
				<span>Bem vindo,</span>
				<h2>${usuario.nome}</h2>
			</div>
		</div>
		<!-- /menu prile quick info -->
		<br />
		<!-- sidebar menu -->
		<div id="sidebar-menu" class="main_menu_side hidden-print main_menu">
			<div class="menu_section">
				<ul class="nav side-menu">
					<li><a><i class="fa fa-home"></i> Home <span class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu" style="display: none">
							<li><a href="${pageContext.servletContext.contextPath}/dashboard">Dashboard</a></li>
						</ul>
					</li>
					<li><a><i class="fa fa-edit"></i> Cadastro <span class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu" style="display: none">
							<li><a href="${pageContext.servletContext.contextPath}/cadastro/funcionario">Funcionário</a></li>
							<li><a href="${pageContext.servletContext.contextPath}/cadastro/veiculo">Veículo</a></li>
							<li><a href="${pageContext.servletContext.contextPath}/cadastro/viagem">Viagem</a></li>
						</ul>
					</li>
					<li><a><i class="fa fa-bar-chart"></i> Relatório <span class="fa fa-chevron-down"></span></a>
						<ul class="nav child_menu" style="display: none">
							<li><a href="${pageContext.servletContext.contextPath}/relatorio/viagem">Viagem</a></li>
							<li><a href="${pageContext.servletContext.contextPath}/relatorio/pagamento">Pagamento</a></li>
						</ul>
					</li>
				</ul>
			</div>
		</div>
		<!-- /sidebar menu -->
	</div>
</div>