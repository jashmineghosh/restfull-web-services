package com.in28minutes.rest.webservices.restfulwebservices.user;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class UserDaoService {
        private static List<User> users = new ArrayList<>();

    private static int usersCount = 0;

    static {
        users.add(new User(++usersCount,"Adam",LocalDate.now().minusYears(30)));
        users.add(new User(++usersCount,"Eve",LocalDate.now().minusYears(25)));
        users.add(new User(++usersCount,"Jim",LocalDate.now().minusYears(20)));
    }

    public User save(User user) {
        user.setId(++usersCount);
        users.add(user);
        return user;
    }

        public List<User> findAll() {
            return users;
        }

    public Optional<User> findOne(int id) {
//        User User = users.stream().filter(x -> x.getId().equals(id)).findFirst().get();
//        return User;
        Optional<User> User = users.stream().filter(x -> x.getId().equals(id)).findFirst();
        return User;
    }

    public void deleteById(int id) {
        Predicate<? super User> predicate = user -> user.getId().equals(id);
        users.removeIf(predicate);
    }

}
