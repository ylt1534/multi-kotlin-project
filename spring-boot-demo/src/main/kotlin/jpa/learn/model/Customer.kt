package jpa.learn.model

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customer")
data class Customer(
    @Id
    @GeneratedValue
    val id: Long = 0,
    val firstName: String = "",
    val lastName: String = ""
)
// default value is needed because hibernate requires an entity to have a no-arg constructor
// Assigning default values to all the member fields will let hibernate instantiate an Article without passing any argument. It Works because Kotlin supports Default Arguments