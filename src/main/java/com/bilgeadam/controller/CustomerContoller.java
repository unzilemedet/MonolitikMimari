package com.bilgeadam.controller;
import com.bilgeadam.service.CustomerService;
import com.bilgeadam.repository.entity.Customer;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import static com.bilgeadam.constants.EndPointList.*;
import java.util.List;

@RestController
@RequestMapping(CUSTOMER)
@RequiredArgsConstructor
public class CustomerContoller {
    private final CustomerService customerService;



    @PostMapping(SAVE)
    public Customer saveCustomer(@RequestBody Customer customer) {
        return customerService.saveCustomer(customer);
    }

    @GetMapping(FIND_ALL)
    public List<Customer> getAllCustomers() {
        return customerService.getAllCustomers();
    }
}
