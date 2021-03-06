package com.yeqifu.system.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: 落亦-
 * @Date: 2020/1/30 19:57
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultObj {


    /**
     * 响应码
     */
    private Integer code=200;
    /**
     * 响应信息
     */
    private String msg="";
    private String token="";

    public ResultObj(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 是否登陆
     */
    public static final ResultObj IS_LOGIN = new ResultObj(Constant.CODE_SUCCESS,Constant.IS_LOGIN);
    public static final ResultObj UN_LOGIN = new ResultObj(Constant.CODE_ERROR,Constant.UN_LOGIN);

    /**
     * 删除是否成功
     */
    public static final ResultObj DELETE_SUCCESS = new ResultObj(Constant.CODE_SUCCESS,Constant.DELETE_SUCCESS);
    public static final ResultObj DELETE_ERROR = new ResultObj(Constant.CODE_ERROR,Constant.DELETE_ERROR);

    /**
     * 批量删除是否成功
     */
    public static final ResultObj BATCHDELETE_SUCCESS = new ResultObj(Constant.CODE_SUCCESS,Constant.BATCHDELETE_SUCCESS);
    public static final ResultObj BATCHDELETE_ERROR = new ResultObj(Constant.CODE_ERROR,Constant.BATCHDELETE_ERROR);
    public static final ResultObj BATCHDELETE_ERROR_NEWS = new ResultObj(Constant.CODE_ERROR,Constant.BATCHDELETE_ERROR_NEWS);

    /**
     * 添加是否成功
     */
    public static final ResultObj ADD_SUCCESS = new ResultObj(Constant.CODE_SUCCESS,Constant.ADD_SUCCESS);
    public static final ResultObj ADD_ERROR = new ResultObj(Constant.CODE_ERROR,Constant.ADD_ERROR);

    /**
     * 修改是否成功
     */
    public static final ResultObj UPDATE_SUCCESS = new ResultObj(Constant.CODE_SUCCESS,Constant.UPDATE_SUCCESS);
    public static final ResultObj UPDATE_ERROR = new ResultObj(Constant.CODE_ERROR,Constant.UPDATE_ERROR);

    /**
     * 分配菜单或权限是否成功
     */
    public static final ResultObj DISPATCH_SUCCESS = new ResultObj(Constant.CODE_SUCCESS,Constant.DISPATCH_SUCCESS);
    public static final ResultObj DISPATCH_ERROR = new ResultObj(Constant.CODE_ERROR,Constant.DISPATCH_ERROR);

    /**
     * 重置用户密码
     */
    public static final ResultObj RESET_PWD_SUCCESS = new ResultObj(Constant.CODE_SUCCESS,Constant.RESET_PWD_SUCCESS);
    public static final ResultObj RESET_PWD_ERROR = new ResultObj(Constant.CODE_ERROR,Constant.RESET_PWD_ERROR);

    /**
     * 删除用户失败，该用户是其他用户的直属领导
     */
    public static final ResultObj DELETE_ERROR_NEWS = new ResultObj(Constant.CODE_ERROR,Constant.DELETE_ERROR_NEWS);

}
