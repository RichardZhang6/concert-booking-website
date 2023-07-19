package proj.concert.service.mapper;
import proj.concert.service.domain.Seat;

public class SeatDTOMapper {
    //changing seat dto object to seat
    public static Seat toDomainModel(proj.concert.common.dto.SeatDTO dtoSeat) {
        Seat fullSeat = new Seat(dtoSeat.getLabel(),
                dtoSeat.getPrice());
        return fullSeat;
    }
    //changing sear object to seat dto
    public static proj.concert.common.dto.SeatDTO toDto(Seat seat) {
        proj.concert.common.dto.SeatDTO dtoSeat =
                new proj.concert.common.dto.SeatDTO(
                        seat.getLabel(),
                        seat.getCost());
        return dtoSeat;
    }
}