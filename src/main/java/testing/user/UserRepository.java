package testing.user;

import org.springframework.stereotype.Service;
import testing.resolver.IdResolver;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by hossein on 2020-09-09
 */
@Service
public class UserRepository implements IdResolver {

    Map<String,User> repo = new HashMap<>();

    @Override
    public User resolve(String s) {
        return repo.get(s);
    }

    public void put(User s) {
        repo.put(s.getName(),s);
    }
}
