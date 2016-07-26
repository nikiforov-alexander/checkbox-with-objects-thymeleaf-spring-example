package com.example.bug.controller;

import com.example.bug.model.Project;
import com.example.bug.model.Role;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ProjectController {
    @RequestMapping("/")
    public String listRoles(Model model) {
        // create simple list of roles with 2 roles
        Role role1 = new Role();
        Role role2 = new Role();
        role1.setName("role1");
        role2.setName("role2");
        List<Role> roles = Arrays.asList(role1, role2);
        // add all roles to model
        model.addAttribute("allRoles", roles);
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
        // filter non-null roles
        List<Role> nonNulRoles =
                project.getRoles().stream().filter(
                role -> role.getName() != null).collect(Collectors.toList());
        // print selected roles: only name is saved
        System.out.println(nonNulRoles);
        return "redirect:/";
    }
}
