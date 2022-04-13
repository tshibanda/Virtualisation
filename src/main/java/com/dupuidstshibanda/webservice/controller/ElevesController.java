package com.dupuidstshibanda.webservice.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dupuidstshibanda.webservice.model.Eleve;
import com.dupuidstshibanda.webservice.service.EleveService;


@Controller
@RequestMapping("/eleves")
class ElevesController
{
	
	@Autowired
	private EleveService service;

	@RequestMapping(method = RequestMethod.GET)
    ModelAndView
    getEleves(Model model)
    {
		Iterable<Eleve> eleves = service.getEleves();
        ModelAndView mav = new ModelAndView("eleves");
        model.addAttribute("eleves", eleves);
        model.addAttribute("showAll", true);
        return mav;
    }

	@RequestMapping("/{id}")
	public ModelAndView getEleve(Model model, @PathVariable("id") final Long id)
    {
		Optional<Eleve> eleve = service.getEleve(id);
        ModelAndView mav = new ModelAndView("eleves");
        model.addAttribute("showAll", false);
        model.addAttribute("eleve", eleve.get());
        return mav;
    }

	@RequestMapping("/supprimer/{id}")
	public String deleteEleve(Model model, @PathVariable("id") final Long id)
    {
		service.deleteEleve(id);	
        return "redirect:/eleves";        
    }

	/*@RequestMapping("/supprimer/{id}")
	public String saveEleve(Model model,
			@PathVariable("p") String p,
			@PathVariable("p") String n,
			@PathVariable("p") String e,
			@PathVariable("p") String m)
    {
		//service.deleteEleve(id);	
        return "redirect:/eleves";        
    }*/

	@RequestMapping("/ajouter")
	public ModelAndView saveEleve(@ModelAttribute Eleve eleve) {
	    return new ModelAndView("ajoutEleve");        
	}

	//@RequestMapping(value = "/saveEleve", method = RequestMethod.POST)
	@PostMapping("/saveEleve")
	public String checkAndSaveEleve(@ModelAttribute Eleve eleve) {
	    service.saveEleve(eleve);
        return "redirect:/eleves";        
	}
	

	
}