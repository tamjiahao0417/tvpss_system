package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/teacher")
public class TeacherController {

    @RequestMapping("/dashboard")
    public String teacherDashboardPage() {
        return "teacher_dashboard";
    }
    
    @RequestMapping("/availablecompetitions")
    public String availableCompetitions() {
        return "available_competitions";
    }
    
    @RequestMapping("/crewapplications")
    public String viewTVPSSCrewApplication() {
        return "view_tvpss_crew_application";
    }
    
    @RequestMapping("/updateinformation")
    public String updateTVPSSInformation() {
        return "update_school_tvpss_information";
    }
}
