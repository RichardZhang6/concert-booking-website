package proj.concert.service.mapper;
import proj.concert.service.domain.Performer;

public class PerformerDTOMapper {
    //changing performerdto object to performer
    public static Performer toDomainModel(proj.concert.common.dto.PerformerDTO dtoPerformer) {
        Performer fullPerformer = new Performer(dtoPerformer.getId(),
                dtoPerformer.getName(),
                dtoPerformer.getImageName(),
                dtoPerformer.getGenre(),
                dtoPerformer.getBlurb());
        return fullPerformer;
    }
    //changing performer object to performerdto
    public static proj.concert.common.dto.PerformerDTO toDto(Performer performer) {
        proj.concert.common.dto.PerformerDTO dtoPerformer =
                new proj.concert.common.dto.PerformerDTO(
                        performer.getId(),
                        performer.getName(),
                        performer.getImageName(),
                        performer.getGenre(),
                        performer.getBlurb());
        return dtoPerformer;
    }
}