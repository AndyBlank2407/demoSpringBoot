package de.neuefische.demospringboot;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/status")
public class HelloWorldController {

    public String helloWorld(){
        return "Hello World";
    }

    @GetMapping
    public String begrüßung(@RequestParam(required = false) String name){
        return "Hallo, lieber "+name;
    }


    @PostMapping
    public int empfängtStringLength(@RequestBody String string){
        return string.length();
    }
}
