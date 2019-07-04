package jpa.learn

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customer")
data class Customer(
    @Id
    @GeneratedValue
    val id: Long?,
    val firstName: String?,
    val lastName: String?
) {

    internal constructor(): this(null, null, null)

    override fun toString(): String {
        return "Customer[id = $id, firstName = $firstName, lastName = $lastName]"
    }
}