package hello.world.service;

import javax.inject.Singleton;

@Singleton
public class ServiceImpl implements Service {
    @Override
    public String test() {
        return "Hello World!!!";
    }
}
