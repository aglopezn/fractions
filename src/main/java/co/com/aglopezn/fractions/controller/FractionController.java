package co.com.aglopezn.fractions.controller;

import co.com.aglopezn.fractions.service.Fraction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class FractionController {

    @GetMapping("/ping")
    public ResponseEntity<String> ping(){
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }

    @GetMapping("/sum")
    public ResponseEntity<String> sum(@RequestParam(defaultValue = "1") int a, @RequestParam(defaultValue = "1") int b,
                                      @RequestParam(defaultValue = "1") int c, @RequestParam(defaultValue = "1") int d){
        Fraction f1 = new Fraction(a, b);
        Fraction f2 = new Fraction(c, d);
        return new ResponseEntity<>(f1.plus(f2).toString(), HttpStatus.OK);
    }

    @GetMapping("/substract")
    public ResponseEntity<String> substract(@RequestParam(defaultValue = "1") int a, @RequestParam(defaultValue = "1") int b,
                                      @RequestParam(defaultValue = "1") int c, @RequestParam(defaultValue = "1") int d){
        Fraction f1 = new Fraction(a, b);
        Fraction f2 = new Fraction(c, d);
        return new ResponseEntity<>(f1.minus(f2).toString(), HttpStatus.OK);
    }

    @GetMapping("/multiply")
    public ResponseEntity<String> multiply(@RequestParam(defaultValue = "1") int a, @RequestParam(defaultValue = "1") int b,
                                      @RequestParam(defaultValue = "1") int c, @RequestParam(defaultValue = "1") int d){
        Fraction f1 = new Fraction(a, b);
        Fraction f2 = new Fraction(c, d);
        return new ResponseEntity<>(f1.times(f2).toString(), HttpStatus.OK);
    }

    @GetMapping("/divide")
    public ResponseEntity<String> divide(@RequestParam(defaultValue = "1") int a, @RequestParam(defaultValue = "1") int b,
                                      @RequestParam(defaultValue = "1") int c, @RequestParam(defaultValue = "1") int d){
        Fraction f1 = new Fraction(a, b);
        Fraction f2 = new Fraction(c, d);
        return new ResponseEntity<>(f1.dividedBy(f2).toString(), HttpStatus.OK);
    }

    @GetMapping("/simplify")
    public ResponseEntity<String> simplify(@RequestParam(defaultValue = "1") int a, @RequestParam(defaultValue = "1") int b){
        Fraction f1 = new Fraction(a, b);
        return new ResponseEntity<>(f1.simplify().toString(), HttpStatus.OK);
    }

}

