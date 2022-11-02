package com.example.controllers;

import com.example.model.Product;
import com.example.model.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/products")
public class TaskController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String indexPage(Model model) {

        model.addAttribute("products", productRepository.findAll());
        return  "task_views/index";

    }
}
