package jpa.learn.repository

import jpa.learn.model.Customer
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface CustomerRepository : JpaRepository<Customer, Long> {
    fun findByLastName( lastName: String) : List<Customer>
}
// Spring boot automatically plugs-in a default implementation of JpaRepository called SimpleJpaRepository at runtime.