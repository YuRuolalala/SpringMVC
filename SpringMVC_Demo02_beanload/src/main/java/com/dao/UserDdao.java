package com.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDdao {

    public void selectById(Integer id);

}
