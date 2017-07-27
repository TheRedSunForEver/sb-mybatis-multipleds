package study.sbmybatismultipleds.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import study.sbmybatismultipleds.entity.UserEntity;
import study.sbmybatismultipleds.mapper.test1.User1Mapper;
import study.sbmybatismultipleds.mapper.test2.User2Mapper;

@RestController
public class Controller {
    @Autowired
    private User1Mapper user1Mapper;

    @Autowired
    private User2Mapper user2Mapper;

    @RequestMapping("/getUser1/{id}")
    public UserEntity getUser1(@PathVariable("id") Long id) {
        return user1Mapper.getOne(id);
    }

    @RequestMapping("/getUser2/{id}")
    public UserEntity getUser2(@PathVariable("id") Long id) {
        return user2Mapper.getOne(id);
    }
}
