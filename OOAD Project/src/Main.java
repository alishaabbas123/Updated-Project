import HotelRestaurants.Restaurant;
import HotelRestaurants.RestaurantBooking;
import Services.LaundryService;
import Services.SpaService;
import Services.RoomService;
import Services.Service;

public class Main {
    public static void main(String[] args) {
        // Creating some restaurant instances
        Restaurant restaurant1 = new Restaurant("Ocean View", "Seafood", 60.0);
        Restaurant restaurant2 = new Restaurant("Spice Haven", "Indian", 55.0);



    // Display restaurant details
        System.out.println("Available Restaurants:");
        System.out.println(restaurant1);
        System.out.println(restaurant2);

        // Creating restaurant booking instances
        RestaurantBooking booking1 = new RestaurantBooking("Alice", "2024-12-15", 2);
        RestaurantBooking booking2 = new RestaurantBooking("Bob", "2024-12-16", 4);

        // Display booking details
        System.out.println("\nBookings:");
        System.out.println(booking1);
        System.out.println(booking2);

        // Creating services
        Service spaService = new SpaService("Aromatherapy", 100.0);
        Service roomService = new RoomService("Breakfast in Bed", 20.0);
        Service laundryService = new LaundryService("Dry Cleaning", 15.0);

        // Display service details
        System.out.println("\nAvailable Services:");
        System.out.println(spaService.getServiceDetails() + " - Cost: €" + spaService.getCost());
        System.out.println(roomService.getServiceDetails() + " - Cost: €" + roomService.getCost());
        System.out.println(laundryService.getServiceDetails() + "- Cost: €" + laundryService.getCost());
    }
}
