package lk.ijse.cmjd114_115.EcoCheck2026.config;

import lk.ijse.cmjd114_115.EcoCheck2026.dao.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserDetailServiceIMPL implements UserDetailsService {
    private final UserDao userDao;
    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
         return userDao.findByEmail(email)
                 .orElseThrow(() ->
                         new UsernameNotFoundException("User not found"));
    }
}
