package com.example.employeemanagement.controller;


import com.example.employeemanagement.domain.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
public class EmployeeController {
    @GetMapping({"/","/addEmp"})
    public String getEmpForm(@ModelAttribute("emp") Employee emp){
        return "empForm";
    }

    @PostMapping("/addEmp")
    public String saveEmp(@Valid @ModelAttribute("emp") Employee emp, BindingResult result,RedirectAttributes ra){
        if(result.hasErrors()){
            return "empForm";
        }
        ra.addFlashAttribute("savedEmployee",emp);
        return "redirect:/detail"; //BECARE IN THIS AREA
    }

    @GetMapping("/detail")
    public String detail(){
        return "empDetail";
    }
}
