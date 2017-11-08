package edu.fatec.smartapf.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import edu.fatec.smartapf.domain.APF;
import edu.fatec.smartapf.domain.ConsultaExterna;

@Service
public class APFCalculadorService {
	
	@Autowired
	private ConsultaExternaService consultaExternaService;
	
	public APF calcular(APF apf) {
		for (ConsultaExterna item : apf.getConsultasExternas()) {
			consultaExternaService.determinarComplexidade(item);
		}
		return apf;
	}

}
