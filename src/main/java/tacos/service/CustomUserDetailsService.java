package tacos.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tacos.data.UserRepository;
import tacos.entity.User;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        User user = userRepository.findByUsername(username);
        org.springframework.security.core.userdetails.User.UserBuilder builder = null;

        if (user == null) {
            throw new UsernameNotFoundException("Unknown user: " + username);
        } else {
            builder = org.springframework.security.core.userdetails.User.withUsername(username);
            builder.password(user.getPassword());
            builder.roles("USER");
        }
        return builder.build();
    }
}
