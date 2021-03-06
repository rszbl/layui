package com.hjming.layui.system.user.mapper;

import com.hjming.layui.system.user.domain.Rolepermission;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface RolepermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Rolepermission record);

    int insertSelective(Rolepermission record);

    Rolepermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Rolepermission record);

    int updateByPrimaryKey(Rolepermission record);

    void deleteRolePermission(Integer roleId);

    void grantAuth(Integer roleId, Integer perId);
}