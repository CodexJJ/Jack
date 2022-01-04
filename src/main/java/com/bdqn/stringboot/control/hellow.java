package com.bdqn.stringboot.control;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class hellow {
    @RequestMapping("/a")
    @ResponseBody
    public String a(){
        return "hellow String Bool";
    }
}
