package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@RequestMapping("/viewTVPSSContent")
    public String viewTVPSSContentPage() {
        return "viewTVPSSContent";
    }
	
	@RequestMapping("/applycrew")
    public String applyCrewPage() {
        return "crew_application";
    }
}
