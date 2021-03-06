package com.yeqifu.system.service;

import com.yeqifu.system.common.DataGridView;
import com.yeqifu.system.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yeqifu.system.vo.UserVo;

/**
* @Author: 落亦-
* @Date: 2020/1/30 16:39
*/
public interface UserService extends IService<User>{

    /**
     * 根据用户登录名查询用户
     * @param loginname     用户登录名
     * @return
     */
    User queryUserByLoginName(String loginname);

    /**
     * 查询所有用户
     * @param userVo
     * @return
     */
    DataGridView queryAllUser(UserVo userVo);

    /**
     * 保存用户
     * @param user
     */
    User saveUser(User user);

    /**
     * 修改用户
     * @param user
     */
    User updateUser(User user);

    /**
     * 根据部门ID查询出该部门底下的所有员工
     * @param deptId    部门ID
     * @return          DataGridView
     */
    DataGridView loadUsersByDeptId(Integer deptId);

    /**
     * 查询最大排序码
     * @return
     */
    Integer queryUserMaxOrderNum();

    /**
     * 查询该用户是否是其他用户的直属领导
     * @param id    该用户ID
     * @return      true:是  false:否
     */
    Boolean queryOtherUserMgr(Integer id);

    /**
     * 保存用户和角色之间的关系
     * @param uid
     * @param rids
     */
    void saveUserRole(Integer uid, Integer[] rids);
}
