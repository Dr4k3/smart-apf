package edu.fatec.smartapf.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import edu.fatec.smartapf.business.APFCalculadorService;
import edu.fatec.smartapf.domain.APF;

@RestController
@RequestMapping("/apf")
public class APFController {
	
	@Autowired
	private APFCalculadorService service;

	@RequestMapping(value="/calcular", method=RequestMethod.POST)
    public APF calcular(@RequestBody APF apf) {
        return service.calcular(apf);
    }

}
