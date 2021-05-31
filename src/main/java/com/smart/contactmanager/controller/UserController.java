package com.smart.contactmanager.controller;

import com.smart.contactmanager.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class UserController {

 @RequestMapping("/")
    public String home(Model model)
{
    model.addAttribute("title","home- this is smart contact Manager");
    return "home";
}
    @RequestMapping("/about")
    public String about(Model model)
    {
        model.addAttribute("title","about- this is smart contact Manager");
        return "about";
    }
    @RequestMapping("/register")
    public String signup (Model model)
    {
        model.addAttribute("title","register- this is smart contact Manager");
        model.addAttribute("user",new User());
        return "signup";
    }

    @PostMapping(path="/do_register")
    public String registerUser(@ModelAttribute("user") User user, @RequestParam(value="agreement",defaultValue="false") boolean agreement,Model model)
    {
        if(!agreement)
        {
            System.out.println("Your have not agreed term and condition");
        }
        System.out.println("Agreement"+agreement);
        System.out.println("User"+user);
        return "signup";
    }
}

