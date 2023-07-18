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


    @PostMapping("/strl")
    public int empfängtStringLength(@RequestBody StrLength text){ //Müssen Objekt erstellen (bzw.Klasse)
                                                                  // weil halt über JSON nur Objekt oder Array
                                                                    //übergeben werden können.

        return text.getText().length();
    }
}
