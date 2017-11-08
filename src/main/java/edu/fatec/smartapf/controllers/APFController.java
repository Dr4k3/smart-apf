package edu.fatec.smartapf.controllers;

import java.util.Map;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apf")
public class APFController {

	@RequestMapping(value="/calcular", method=RequestMethod.POST)
    public ModelMap calcular(@RequestBody Map<String, Object> params) {
		ModelMap result = new ModelMap("teste", "valor1");
		result.addAllAttributes(params);
        return result;
    }

}
