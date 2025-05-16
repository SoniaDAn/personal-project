package guest;

public class Booking {

    public Booking() {
    }

    public static String markStayComplete(boolean checkedOut) {
        if (checkedOut) {
            return "Stay Complete";
        } else {
            return "Booking In Progress";
        }
    }
}
