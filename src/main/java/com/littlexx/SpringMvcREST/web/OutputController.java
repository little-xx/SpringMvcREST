package com.littlexx.SpringMvcREST.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@Controller
public class OutputController {

    @RequestMapping("/output1")
    public String Output1(Map<String, Object> map) {
        map.put("msg", "woshinidie");
        return "output";
    }

    @RequestMapping("/output2")
    public String Output2(Model model) {
        model.addAttribute("msg", "woshinidie");
        return "output";
    }

    @RequestMapping("/output3")
    public String Output3(ModelMap modelMap) {
        modelMap.addAttribute("msg", "woshinidie");
        return "output";
    }
}
