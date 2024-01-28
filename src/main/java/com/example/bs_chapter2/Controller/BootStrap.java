package com.example.bs_chapter2.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BootStrap {
    @GetMapping("/button")
    public String button() throws Exception {
        return "button";
    }

    @GetMapping("/groupbutton")
    public String groupbutton() throws Exception {
        return "groupbutton";
    }

    @GetMapping("/table")
    public String table() throws Exception {
        return "table";
    }

    @GetMapping("/page")
    public String page() throws Exception {
        return "pagination";
    }

    @GetMapping("/product")
    public String product() throws Exception {
        return "card";
    }

    @GetMapping("/menu")
    public String menu() throws Exception {
        return "dropdown";
    }

    @GetMapping("/head")
    public String head() throws Exception {
        return "navbar";
    }

    @GetMapping("/member")
    public String member() throws Exception {
        return "form";
    }

    @GetMapping("/select")
    public String select() throws Exception {
        return "checkbox";
    }

    @GetMapping("/option")
    public String option() throws Exception {
        return "radiobutton";
    }
}
