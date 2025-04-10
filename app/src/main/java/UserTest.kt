import org.junit.Test
import org.junit.Assert.*

class UserTest {
    @Test
    fun testOrderCreation() {
        val user = User(1, "Test")
        assertEquals("Test", user.username)
    }
}