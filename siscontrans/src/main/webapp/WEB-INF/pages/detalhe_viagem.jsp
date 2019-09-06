<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<div role="tabpanel" data-example-id="togglable-tabs">
	<ul id="myTab" class="nav nav-tabs bar_tabs" role="tablist">
		<li role="presentation" class="active"><a href="#tab_cadastro_viagem" id="cadastro_viagem_tab" role="tab" data-toggle="tab" aria-expanded="true">Viagem</a></li>
		<li role="presentation" class=""><a href="#tab_cadastro_abastecimento" role="tab" id="cadastro_abastecimento_tab" data-toggle="tab"  aria-expanded="false">Abastecimento</a></li>
	</ul>
	<div id="myTabContent" class="tab-content">
		<div role="tabpanel" class="tab-pane fade active in" id="tab_cadastro_viagem" aria-labelledby="cadastro_viagem_tab">
			<!-- start form for validation -->
			<form:form id="viagem-form" action="viagem" method="post" commandName="viagem">
				<div class="col-md-12">
					<div class="col-md-2 form-group">
						<label for="fullname">Data *</label>
						<form:input  id="viagem_data" type="text" path="data" class="form-control"/>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Veículo *</label>
						<form:select id="viagem_veiculo" path="veiculo.id" class="form-control">
                    		<form:option value="0" label="Selecione"/>
                    		<form:options items="${veiculos}" itemValue="id" itemLabel="placa"/>
                		</form:select>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Funcionário *</label>
						<form:select id="viagem_funcionario" path="funcionario.id" class="form-control">
                    		<form:option value="0" label="Selecione"/>
                    		<form:options items="${funcionarios}" itemValue="id" itemLabel="nome"/>
                		</form:select>
					</div>
				</div>
				<div class="col-md-12">
					<div class="col-md-2 form-group">
						<label for="fullname">Km Inicial *</label>
						<form:input id="viagem_km_inicial" path="kmInicial" class="form-control"/>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Origem *</label>
						<form:select id="viagem_origem" path="origem.id" class="form-control">
                    		<form:option value="0" label="Selecione"/>
                    		<form:options items="${origens}" itemValue="id" itemLabel="nome"/>
                		</form:select>
					</div>
					<div class="col-md-5 form-group">
						<label for="fullname">Destino *</label>
						<form:select id="viagem_destino" path="destino.id" class="form-control">
                    		<form:option value="0" label="Selecione"/>
                    		<form:options items="${destinos}" itemValue="id" itemLabel="nome"/>
                		</form:select>
					</div>
				</div>
				<div class="col-md-12">
					<div class="col-md-6 form-group">
						<label for="fullname">Container 1 *</label>
						<form:input id="viagem_container_1" path="container1" class="form-control"/>
					</div>
					<div class="col-md-6 form-group">
						<label for="fullname">Container 2 *</label>
						<form:input id="viagem_container_2" path="container2" class="form-control"/>
					</div>
				</div>
				<div class="col-md-12">
					<div class="ln_solid"></div>
					<button type="submit" class="btn btn-primary right">Salvar</button>
				</div>
			</form:form>
		</div>
		<div role="tabpanel" class="tab-pane fade" id="tab_cadastro_abastecimento" aria-labelledby="cadastro_abastecimento_tab">
				<div class="col-md-12">
					<div class="col-md-2 form-group">
						<label for="fullname">Data *</label>
						<input type="text" class="form-control" data-inputmask="'mask': '99/99/9999'">
					</div>
					<div class="col-md-4 form-group">
						<label for="fullname">Combustível *</label>
						<select id="heard" class="form-control" required>
							<option value="">Escolha...</option>
							<option value="1">Arla</option>
							<option value="2">Diesel</option>
						</select>
					</div>
					<div class="col-md-2 form-group">
						<label for="fullname">Quantidade Lts *</label>
						<input type="text" class="form-control" data-inputmask="'mask': '99/99/9999'">
					</div>
					<div class="col-md-4 form-group">
						<label for="fullname">Posto *</label>
						<select id="heard" class="form-control" required>
							<option value="">Escolha...</option>
							<option value="1">Monte Santo Tavares</option>
							<option value="2">Diesel</option>
						</select>
					</div>
				</div>
		</div>
	</div>
</div>	