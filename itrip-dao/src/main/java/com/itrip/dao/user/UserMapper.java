package com.itrip.dao.user;

import com.itrip.beans.pojo.User;
import org.apache.ibatis.annotations.Param;

public interface UserMapper {
    /**
     * 用户登录
     * @param userCode
     * @return
     */
    User getUserLogin(@Param("userCode") String userCode);
}
