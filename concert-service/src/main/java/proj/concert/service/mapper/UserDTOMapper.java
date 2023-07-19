package proj.concert.service.mapper;
import proj.concert.service.domain.User;

public class UserDTOMapper {
    //changing userdto object to user object
    public static User toDomainModel(proj.concert.common.dto.UserDTO dtoUser) {
        User fullUser = new User(dtoUser.getUsername(),
                dtoUser.getPassword());
        return fullUser;
    }
    //changing user object to userdto object
    public static proj.concert.common.dto.UserDTO toDto(User user) {
        proj.concert.common.dto.UserDTO dtoUser =
                new proj.concert.common.dto.UserDTO(
                        user.getUsername(),
                        user.getPassword());
        return dtoUser;

    }
}