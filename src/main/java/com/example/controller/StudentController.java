package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.java.Application;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/viewTVPSSContent")
    public String viewTVPSSContentPage() {
        return "viewTVPSSContent";
    }
	
	@RequestMapping("/applycrew")
	public String applyCrewPage(Model model) {
        // Add an empty Application object to the model for form binding
        model.addAttribute("application", new Application());
        return "crew_application";
    }
}
