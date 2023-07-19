package proj.concert.service.mapper;
import proj.concert.service.domain.Booking;
import proj.concert.service.domain.Seat;
import java.util.ArrayList;
import java.util.List;

public class BookingDTOMapper {
// method to convert booking to bookingdto
    public static proj.concert.common.dto.BookingDTO toDto(Booking booking) {
        List<proj.concert.common.dto.SeatDTO> seatDtos = new ArrayList<>();
        for (Seat seat: booking.getSeats()) {
            proj.concert.common.dto.SeatDTO seatDto = SeatDTOMapper.toDto(seat);
            seatDtos.add(seatDto);
        }
        proj.concert.common.dto.BookingDTO dtoBooking =
                new proj.concert.common.dto.BookingDTO(
                        booking.getConcertId(),
                        booking.getDate(),
                        seatDtos);
        return dtoBooking;

    }
}