package testing.resolver;

import testing.user.User;

/**
 * Created by hossein on 2020-09-09
 */
public interface IdResolver {
    User resolve(String s);
}
