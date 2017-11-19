package edu.fatec.smartapf.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fatec.smartapf.domain.APF;

@Service
public class APFCalculadorService {
	
	@Autowired
	private ConsultaExternaService consultaExternaService;
	@Autowired
	private ArquivoInterfaceExternoService arquivoInterfaceExternoService;
	@Autowired
	private ArquivoLogicoInternoService arquivoLogicoInternoService;
	@Autowired
	private EntradaExternaService entradaExternaService;
	@Autowired
	private SaidaExternaService saidaExternaService;
	
	public APF calcular(APF apf) {
		consultaExternaService.calcular(apf);
		arquivoInterfaceExternoService.calcular(apf);
		arquivoLogicoInternoService.calcular(apf);
		entradaExternaService.calcular(apf);
		saidaExternaService.calcular(apf);
		apf.setTotalHoraProjeto(99);
		return apf;
	}

}
