package jp.fp.sample1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import jp.fp.sample1.model.FormModel;


@Controller
public class AnotherFormController {
	

	@RequestMapping(value = "/anotherFormSample", method = RequestMethod.GET)
	public ModelAndView form() {
		
		ModelAndView modelAndView = new ModelAndView("disp");
		FormModel fModel = new FormModel();
		modelAndView.addObject("formModel", fModel);
		return modelAndView ;
	}

	@RequestMapping(value = "/anotherFormSample", method = RequestMethod.POST)
	public ModelAndView display(@ModelAttribute FormModel fModel) {
		
		ModelAndView modelAndView = new ModelAndView("disp");
		modelAndView.addObject("message", fModel.getName() + "‚³‚ñ,‚±‚ñ‚É‚¿‚Í");
		modelAndView.addObject("formModel", fModel);
		return modelAndView  ;
		
	}
	
}