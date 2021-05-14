package jp.fp.sample1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import jp.fp.sample1.model.FormModel;


@Controller
public class FormController {
	

	@RequestMapping(value = "/formSample", method = RequestMethod.GET)
	public String form(Model model) {
		FormModel fModel = new FormModel();
		model.addAttribute("formModel", fModel);
		return "disp";
	}

	@RequestMapping(value = "/formSample", method = RequestMethod.POST)
	public String display(@ModelAttribute FormModel fModel, Model model) {
		model.addAttribute("message", fModel.getName() + "‚³‚ñ,‚±‚ñ‚É‚¿‚Í");
		return "disp";
	}

}