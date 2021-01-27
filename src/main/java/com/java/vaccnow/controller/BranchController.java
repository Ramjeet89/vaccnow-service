package com.java.vaccnow.controller;

import com.java.vaccnow.exception.ResourceNotFoundException;
import com.java.vaccnow.model.Branch;
import com.java.vaccnow.repository.BranchRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
@Api(value = "Swagger2 VaccNow RestController")
public class BranchController {

    @Autowired
    private BranchRepository branchRepository;

    @ApiOperation(value = "Create Branch in the System ", response = Iterable.class, tags = "createBranch")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!")})
    @PostMapping("/branch")
    public Branch createBranch(@Valid @RequestBody Branch branch) throws ResourceNotFoundException {
        return branchRepository.save(branch);
    }

    @ApiOperation(value = "List of all Branch ", response = Iterable.class, tags = "ListAllBranch")
    @ApiResponses(value = {
            @ApiResponse(code = 200, message = "Success|OK"),
            @ApiResponse(code = 401, message = "not authorized!"),
            @ApiResponse(code = 403, message = "forbidden!!!"),
            @ApiResponse(code = 404, message = "not found!!!")})
    @GetMapping(value = "/list-branches")
    public List<String> listAllBranches() {
        List<Branch> branchList = branchRepository.findAll();
        List<String> branchNames = branchList.stream()
                .map(Branch::getBranchName).collect(Collectors.toList());
        return branchNames;
    }
}

