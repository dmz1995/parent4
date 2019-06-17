package cn.itcast.mapper;

import cn.itcast.domain.User;

import java.util.List;

public interface UserMapper {
    List<User> listSelect();

    void updata(User user);

    void insert(User user);

    void delete(int id);
}
