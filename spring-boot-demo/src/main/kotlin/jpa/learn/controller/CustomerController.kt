package jpa.learn.controller

import jpa.learn.model.Customer
import jpa.learn.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
@RequestMapping("/api")
class CustomerController (@Autowired private val customerRepository: CustomerRepository) {

    @GetMapping("/customers")
    fun getAllCustomers(): List<Customer> = customerRepository.findAll()

    @PostMapping("/customers")
    fun createCustomers(@Valid @RequestBody customer: Customer): Customer =
            customerRepository.save(customer)
}