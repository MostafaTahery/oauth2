package co.nilin.security.oauth2.service;

import co.nilin.security.oauth2.data.entity.AuthGroup;
import co.nilin.security.oauth2.data.entity.User;
import co.nilin.security.oauth2.data.repository.AuthGroupRepository;
import co.nilin.security.oauth2.data.repository.UserRepository;
import co.nilin.security.oauth2.security.UserPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class NewUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;
    private final AuthGroupRepository authGroupRepository;
    public NewUserDetailsService(UserRepository userRepository, AuthGroupRepository authGroupRepository) {
        super();
        this.userRepository=userRepository;
        this.authGroupRepository=authGroupRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user=userRepository.findUserByUsername(username);
        if(null==user)throw new UsernameNotFoundException("Cannot find user"+username+". ");
        List<AuthGroup> authGroups=this.authGroupRepository.findByUsername(username);
        return new UserPrincipal(user,authGroups);
    }

}
