package guest;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BookingTest {

    @Test
    void givenCheckedOut_markStayComplete() {
        // Given
        boolean checkedOut = true;

        // When
        String actual = Booking.markStayComplete(checkedOut);

        // Then
        assertThat(actual).isEqualTo("Stay Complete");
    }
}
