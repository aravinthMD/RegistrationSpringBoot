package com.kg.registration.controller;

import com.kg.registration.model.Catalouge;
import com.kg.registration.repository.RegisterRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * CatalougeController
 */
@RestController
@RequestMapping("/api/register")
public class CatalougeController {
    
    @Autowired
    private RegisterRepository registerRepository;
    @RequestMapping(method=RequestMethod.POST)
    public Catalouge create(@RequestBody Catalouge catalouge)
    {
        catalouge.setUserid(0);
        return registerRepository.saveAndFlush(catalouge);
    }
    @GetMapping("/")
    public @ResponseBody ResponseEntity<List<Catalouge>> all() {
        System.out.println("GET ALL CALLED");
        return new ResponseEntity<>(registerRepository.findAll(), HttpStatus.OK);
    }

}



    


