package cn.edu.hcnu.dao;

import java.util.Set;

public interface IFlightDao {
    void insertFlight(Flight flight);
    Set<Flight>getAllFlights();
    Flight getFlightByDepartureTime(String departureTime);
    Flight getFlightByDepartureAirport(String departureAirport);
    Flight getFlightByDestinationAirport(String destinationAirport);
    void updateFlight(Flight flight);
}
