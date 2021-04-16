package dfdf.sdfsdf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/init")
public class InitController {

    @GetMapping("index")
    public String initIndex(){
        return "this is InitController index Method";
    }
}
