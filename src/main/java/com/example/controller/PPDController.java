package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/ppd")
public class PPDController {

	@RequestMapping("/dashboard")
    public String ppdDashboardPage() {
        return "ppd_dashboard";
    }
	
	@RequestMapping("/createCompetition")
    public String createCompetitionPage() {
        return "create_competition";
    }
	
	@RequestMapping("/validateTVPSSInfo")
    public String validateTVPSSInfoPage() {
        return "tvpss_validation";
    }
	
	@RequestMapping("/monitorTVPSSResource")
    public String monitorTVPSSResourcePage() {
        return "monitor_tvpss_resource";
    }
}
