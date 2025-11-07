package Exception;
	import java.util.HashMap;
	import java.util.Map;
	class InvalidSeatException extends Exception {
	    public InvalidSeatException(String message) {
	        super(message);
	    }
	}

	class SeatAlreadyBookedException extends Exception {
	    public SeatAlreadyBookedException(String message) {
	        super(message);
	    }
	}

	class MovieBooking {
	    private Map<String, Boolean> seats;

	    public MovieBooking() {
	        seats = new HashMap<>();
	        
	        seats.put("A1", true);
	        seats.put("A2", true);
	        seats.put("A3", true);
	        seats.put("A4", true);
	        seats.put("A5", true);
	    }

	    public void bookSeat(String seatNumber) throws InvalidSeatException, SeatAlreadyBookedException {
	        if (!seats.containsKey(seatNumber)) {
	            throw new InvalidSeatException("Seat number does not exist: " + seatNumber);
	        }

	        if (!seats.get(seatNumber)) {
	            throw new SeatAlreadyBookedException("Seat already booked: " + seatNumber);
	        }

	        seats.put(seatNumber, false); 
	        System.out.println("Seat " + seatNumber + " booked successfully.");
	    }
	}


	public class book_ticket {
	    public static void main(String[] args) {
	        MovieBooking booking = new MovieBooking();

	        try {
	            booking.bookSeat("A1");
	            booking.bookSeat("A1");
	        } catch (InvalidSeatException | SeatAlreadyBookedException e) {
	            System.out.println("Booking error: " + e.getMessage());
	        }

	        try {
	            booking.bookSeat("B1");
	        } catch (InvalidSeatException | SeatAlreadyBookedException e) {
	            System.out.println("Booking error: " + e.getMessage());
	        
	    }
	}



}
