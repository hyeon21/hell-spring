package hell.hellspring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HellController {

    @GetMapping("hell")
    public String hell(@RequestParam(value = "name", required = false) String name, Model model) {
        if (name == null) {
            name = "Spring";
        }
        model.addAttribute("name", name);
        return "hell";
    }

    @GetMapping("hellAPI")
    @ResponseBody
    public String hellAPI(@RequestParam(value = "name", required = false) String name) {
        if (name == null) {
            name = "Spring";
        }

        return name;
    }



}
