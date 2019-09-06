/***** Cadastro Viagem *****/
$(document).ready(function() {
	
	/** Data **/
	$('#viagem_data').datepicker({
		dateFormat: 'dd/mm/yy',                
		language: 'pt-BR'
	});
	$('#viagem_data').mask("00/00/0000");

	/** Km Inicial **/
	$('#viagem_km_inicial').mask("0.000.000", {reverse: true});
	
	/** CTE **/
	$('#viagem_cte').mask("0.000.000", {reverse: true});

	/** Container 1 **/
	$('#viagem_container_1').keyup(function() {
		this.value = this.value.toUpperCase();
	});
	$('#viagem_container_1').mask("SSSS 000.000-0 TM", {translation: {'T': {pattern: /[2,4]/},'M': {pattern: /[0]/}}});
	
	/** Container 2 **/
	$('#viagem_container_2').keyup(function() {
		this.value = this.value.toUpperCase();
	});
	$('#viagem_container_2').mask("SSSS 000.000-0 TM", {translation: {'T': {pattern: /[2,4]/},'M': {pattern: /[0]/}}});
	
});
