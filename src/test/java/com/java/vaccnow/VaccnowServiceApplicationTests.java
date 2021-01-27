package com.java.vaccnow;

import com.java.vaccnow.controller.BranchController;
import com.java.vaccnow.exception.ResourceNotFoundException;
import com.java.vaccnow.model.Branch;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.ActiveProfiles;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@SpringBootTest
@ActiveProfiles("test")
class VaccnowServiceApplicationTests {

    @MockBean
    BranchController branchController;

    //Valid Scenario
    @Test
    public void createBranches() throws ResourceNotFoundException {
        Branch branch = new Branch();
        branch.setId(101);
        branch.setBranchName("Bangalore");
        branch.setCreatedBy(1);
        branch.setModifiedAt(new Date());
        branch.setModifiedBy(1);
        branch.setCreatedAt(new Date());
        Mockito.when(branchController.createBranch(Mockito.any())).thenReturn(branch);
    }

    @Test
    public void createBranchesWithNull() throws ResourceNotFoundException {
        Branch branch = new Branch();
        branch.setId(101);
        branch.setBranchName("Bangalore");
        branch.setCreatedBy(1);
        branch.setModifiedAt(new Date());
        branch.setModifiedBy(1);
        branch.setCreatedAt(new Date());
        Mockito.when(branchController.createBranch(null)).thenReturn(branch);
    }

    @Test
    public void fetchListOfBranches() {
        List<String> list = Arrays.asList("101", "Bangalore", "12/1/2021", "1", "3/1/2021", "1");
        Mockito.when(branchController.listAllBranches()).thenReturn(list);
        Assertions.assertNotNull(list);
    }
}
