package edu.fatec.smartapf.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fatec.smartapf.domain.APF;

@Service
public class APFCalculadorService {
	
	@Autowired
	private FuncaoTransacaoService funcaoTransacaoService;
	@Autowired
	private FuncaoTipoDadosService tipoDadosService;
	
	public APF calcular(APF apf) {
		funcaoTransacaoService.calcular(apf);
		tipoDadosService.calcular(apf);
		apf.setTotalHoraProjeto(99);
		return apf;
	}

}
