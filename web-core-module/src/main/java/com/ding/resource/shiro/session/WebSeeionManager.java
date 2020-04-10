package com.ding.resource.shiro.session;

import org.apache.shiro.session.InvalidSessionException;
import org.apache.shiro.session.mgt.SessionKey;
import org.apache.shiro.web.session.mgt.DefaultWebSessionManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Auther: DingCong
 * @Date: 2018/12/9 15:04
 * @Description: WebSessionManager
 */
public class WebSeeionManager extends DefaultWebSessionManager {

    private static final Logger log = LoggerFactory.getLogger(WebSeeionManager.class);

    /**
     * 向session设置属性值
     * @param sessionKey
     * @param attributeKey
     * @param value
     * @throws InvalidSessionException
     */
    @Override
    public void setAttribute(SessionKey sessionKey, Object attributeKey, Object value) throws InvalidSessionException {
        log.info("向Session设置属性,sessionKey:"+sessionKey+",attributeKey:"+attributeKey+",value:"+value);
        super.setAttribute(sessionKey, attributeKey, value);
    }

    /**
     * 删除某个session
     * @param sessionKey
     * @param attributeKey
     * @return
     * @throws InvalidSessionException
     */
    @Override
    public Object removeAttribute(SessionKey sessionKey, Object attributeKey) throws InvalidSessionException {
        log.info("删除session属性,sessionKey:"+sessionKey+",attributeKey:"+attributeKey);
        return super.removeAttribute(sessionKey, attributeKey);
    }

    /**
     * 验证某个session是否有效,无效方便删除
     */
    @Override
    public void validateSessions(){
        log.info("校验session是否有效");

    }
}
