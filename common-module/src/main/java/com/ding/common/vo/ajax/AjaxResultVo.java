package com.ding.common.vo.ajax;

import lombok.Data;

import java.util.HashMap;

/**
 * @program: manager
 * @description: ajax校验结果响应vo
 * @author: DingCong
 * @create: 2018-11-29 16:08
 **/
@Data
public class AjaxResultVo extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    private int code;

    private String msg;

    public AjaxResultVo() {
    }

    public AjaxResultVo(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    /**
     * 返回成功消息
     * @param msg 内容
     * @return 成功消息
     */
    public static AjaxResultVo success(String msg) {
        AjaxResultVo json = new AjaxResultVo();
        json.put("msg", msg);
        json.put("code", 0);
        return json;
    }

    /**
     * 返回成功消息
     * @return 成功消息
     */
    public static AjaxResultVo success() {
        return AjaxResultVo.success("操作成功");
    }

    /**
     * 返回成功消息
     * @param key   键值
     * @param value 内容
     * @return 成功消息
     */
    @Override
    public AjaxResultVo put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    /**
     * 返回错误消息
     * @return 错误消息
     */
    public static AjaxResultVo error() {
        return error(1, "操作失败");
    }

    /**
     * 返回错误消息
     * @param msg 内容
     * @return 错误消息
     */
    public static AjaxResultVo error(String msg) {
        return error(500, msg);
    }

    /**
     * 返回错误消息
     * @param code 错误码
     * @param msg  内容
     * @return 错误消息
     */
    public static AjaxResultVo error(int code, String msg) {
        AjaxResultVo json = new AjaxResultVo();
        json.put("code", code);
        json.put("msg", msg);
        return json;
    }

}
