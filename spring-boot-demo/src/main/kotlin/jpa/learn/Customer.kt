package jpa.learn

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "customer") // if the corresponding table is `Customer`, can omit this
data class Customer(
    @Id // jpa will recognize this field as object's ID due to this annotation
    @GeneratedValue
    val id: Long?,
    val firstName: String?,
    val lastName: String?
) {
    // exists for the sake of JPA, wont use it directly
    internal constructor(): this(null, null, null)

    override fun toString(): String {
        return "Customer[id = $id, firstName = $firstName, lastName = $lastName]"
    }
}