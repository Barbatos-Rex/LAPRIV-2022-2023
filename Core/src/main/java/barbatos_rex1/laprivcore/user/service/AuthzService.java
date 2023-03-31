package barbatos_rex1.laprivcore.user.service;

//@Service
//public class AuthzService implements AutzService {
//
//    private UserRepository repo;
//
//    private Optional<User> currentSession = Optional.empty();
//
//    private UserMapper mapper;
//
//    public AuthzService(UserRepository repo, UserMapper mapper) {
//        this.repo = repo;
//        this.mapper = mapper;
//    }
//
//    @Override
//    public Optional<UserDTO> login(String email, String password) {
//        if (currentSession.isPresent()) {
//            return Optional.empty();
//        }
//
//        var user = repo.findByEmail(Email.from(email));
//
//        if (user.isEmpty()) {
//            return Optional.empty();
//        }
//
//        Password p = Password.secure(user.get().getId().getId(), password);
//
//        if (p.getEncryptedPassword().equals(user.get().getPassword().getEncryptedPassword())) {
//            return user.map(mapper::toDTO);
//        }
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<UserDTO> register(CreateUserDTO user) {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<UserDTO> logout() {
//        return Optional.empty();
//    }
//
//    @Override
//    public Optional<UserDTO> currentSession() {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean isAuthorized(Role... roles) {
//        if (currentSession().isEmpty()){
//            return false;
//        }
//        return Arrays.stream(roles).anyMatch(r -> r == currentSession.get().getRole());
//    }
//}
