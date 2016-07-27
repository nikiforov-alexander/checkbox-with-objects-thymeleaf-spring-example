package com.example.bug.controller;

import com.example.bug.model.Project;
import com.example.bug.model.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class ProjectController {
    @RequestMapping("/")
    public String listRoles(Model model) {
        // create simple list of roles with 2 roles
        // add all roles to model
        model.addAttribute("allRoles", Role.values());
        // add empty project to model
        model.addAttribute("project", new Project());
        return "index";
    }

    @RequestMapping("/add-project")
    public String addProject(@Valid Project project,
                             BindingResult result,
                             Model model) {
        // print project as it is from thymeleaf
        System.out.println(project);
        return "redirect:/";
    }
}
