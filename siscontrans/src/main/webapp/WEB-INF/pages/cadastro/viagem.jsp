<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" session="true"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<div role="tabpanel" data-example-id="togglable-tabs">
	<!-- start form for validation -->
	<form:form id="viagem-form" action="viagem" method="post" commandName="viagem">
		<ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
			<li role="presentation" class="active"><a href="#tab_cadastro_viagem" id="cadastro_viagem_tab" role="tab" data-toggle="tab" aria-expanded="true">Viagem</a></li>
			<li role="presentation" class=""><a href="#tab_cadastro_abastecimento" role="tab" id="cadastro_abastecimento_tab" data-toggle="tab"  aria-expanded="false">Abastecimento</a></li>
		</ul>
		<div id="myTabContent" class="tab-content">
			<div role="tabpanel" class="tab-pane fade active in" id="tab_cadastro_viagem" aria-labelledby="cadastro_viagem_tab">
				<form:input id="viagem_id" type="hidden" path="id"/>
				<div class="col-md-12">
					<div class="col-md-2 form-group">
						<label for="fullname">Data *</label>
						<form:input  id="viagem_data" type="text" path="data" required="required" class="form-control"/>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Veículo *</label>
						<form:select id="viagem_veiculo" path="veiculo.id" required="required" class="form-control">
                    		<form:option value="" label="Selecione"/>
                    		<!--<form:options items="${veiculos}" itemValue="id" itemLabel="placa"/>-->
                    		<c:forEach var="veiculo" items="${veiculos}">
        						<form:option value="${veiculo.id}"><c:out value="${veiculo.placa} - ${veiculo.marca} / ${veiculo.modelo}"/></form:option>
    						</c:forEach>
                		</form:select>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Funcionário *</label>
						<form:select id="viagem_funcionario" path="funcionario.id" required="required" class="form-control">
                    		<form:option value="" label="Selecione"/>
                    		<form:options items="${funcionarios}" itemValue="id" itemLabel="nome"/>
                		</form:select>
					</div>
				</div>
				<div class="col-md-12">
					<div class="col-md-2 form-group">
						<label for="fullname">Km Inicial *</label>
						<form:input id="viagem_km_inicial" path="kmInicial" required="required" class="form-control"/>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Origem *</label>
						<form:select id="viagem_origem" path="origem.id" class="form-control">
                    		<form:option value="" label="Selecione"/>
                    		<form:options items="${origens}" itemValue="id" itemLabel="nome"/>
                		</form:select>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Destino *</label>
						<form:select id="viagem_destino" path="destino.id" required="required" class="form-control">
                    		<form:option value="" label="Selecione"/>
                    		<form:options items="${destinos}" itemValue="id" itemLabel="nome"/>
                		</form:select>
					</div>
				</div>
				<div class="col-md-12">
					<div class="col-md-2 form-group">
						<label for="fullname">CTE 1 *</label>
						<form:input id="viagem_cte_1" path="cte1" required="required" class="form-control"/>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Container 1 *</label>
						<form:input id="viagem_container_1" path="container1" required="required" class="form-control"/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="col-md-2 form-group">
						<label for="fullname">CTE 2 *</label>
						<form:input id="viagem_cte_2" path="cte2" required="required" class="form-control"/>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Container 2 *</label>
						<form:input id="viagem_container_2" path="container2" required="required" class="form-control"/>
					</div>
				</div>
			</div>
			<div role="tabpanel" class="tab-pane fade" id="tab_cadastro_abastecimento" aria-labelledby="cadastro_abastecimento_tab">
				<div class="col-md-12">
					
				</div>
				<div class="col-md-12">
					<div class="ln_solid"></div>
					<button type="submit" class="btn btn-primary right">Adicionar</button>
				</div>
			
			
				<div class="col-md-12 col-sm-12 col-xs-12">
	              	<div class="x_panel">
	              		<c:if test="${not empty viagem.abastecimentos}">
		              		<div class="x_title">
		                  		<h2>Abastecimentos</h2>
		                  		<div class="clearfix"></div>
		                	</div>
		                	<div class="x_content">
			                  	<table class="table table-striped">
		                    		<thead>
		                      			<tr>
		                        			<th>#</th>
		                        			<th>Data</th>
		                        			<th>Tipo Combustivel</th>
		                        			<th>Quantidade (lts)</th>
		                        			<th>Posto</th>
		                      			</tr>
		                    		</thead>
		                    		<tbody>
										<c:forEach items="${viagem.abastecimentos}" var="abastecimento" varStatus="abastecimentoStatus">
											<tr>
			                        			<th scope="row">${abastecimentoStatus.count}</th>
			                        			<td><fmt:formatDate value="${abastecimento.data}" type="both" pattern="dd/MM/yyyy" /></td>
			                        			<td>${abastecimento.tipoCombustivel.descricao}</td>
			                        			<td>${abastecimento.quantidade}</td>
			                        			<td>${abastecimento.posto}</td>
			                      			</tr>
										</c:forEach>
									</tbody>
		                  		</table>
			                </div>
						</c:if>
	              	</div>
	            </div>
			</div>
			<button type="submit" class="btn btn-primary right">Salvar</button>
		</div>
	</form:form>
</div>	