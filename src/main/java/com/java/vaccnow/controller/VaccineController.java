package com.java.vaccnow.controller;

import com.java.vaccnow.model.Vaccine;
import com.java.vaccnow.repository.VaccineRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@RestController
@RequestMapping("/api")
@Api(value = "Swagger2 VaccNow RestController")
public class VaccineController {

    @Autowired
    private VaccineRepository vaccineRepository;

    @GetMapping("/hello")
    public String sayHello() {
        return "Welcome to VaccNow Application";
    }

    @ApiOperation(value = "Create Vaccine in the System ", response = Iterable.class, tags = "createVaccine")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!")})
    @PostMapping("/vaccine")
    public Vaccine createUser(@Valid @RequestBody Vaccine vaccine) {
        return vaccineRepository.save(vaccine);
    }

}


