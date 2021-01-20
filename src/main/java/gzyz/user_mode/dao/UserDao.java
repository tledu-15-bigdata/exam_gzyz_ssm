package gzyz.user_mode.dao;


import gzyz.user_mode.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

    @Mapper
    public interface UserDao {

        public int addUserInfo(User u);

        public List<User> queryUserInfo();

        public List<User> queryMyMsg(String user_id);

        public int editMyMsg(User u);
    }
