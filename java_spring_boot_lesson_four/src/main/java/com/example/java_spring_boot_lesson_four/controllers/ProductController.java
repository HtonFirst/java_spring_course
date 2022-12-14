package com.example.java_spring_boot_lesson_four.controllers;

import com.example.java_spring_boot_lesson_four.entities.Product;
import com.example.java_spring_boot_lesson_four.repositories.ProductRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private ProductRepository productRepository;

    @GetMapping
    public String indexPage(Model model) {

        model.addAttribute("product", productRepository.findAll());
        return  "product_views/index";

    }

    @GetMapping("/{id}")
    public String editProduct(@PathVariable(value = "id") Long id, Model model) {
        model.addAttribute("product", productRepository.findById(id));
        return "product_views/product_form";
    }

    @PostMapping("/product_update")
    public String updateProduct(Product product) {
        productRepository.update(product);
        return "redirect:/product";
    }

    @GetMapping("/delete")
    public String removeProduct(Model model) {
        return "product_views/index";
    }



}
