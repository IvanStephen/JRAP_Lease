package com.jingrui.jrap.audit.service;

import java.util.Map;

/**
 * 自定义审计失败日志.
 *
 * @author lijian.yin@jingrui.com
 * @date 2018/1/21
 **/
public interface IAuditLogService {

    /**
     * 审计失败，日志处理.
     * operator ： 操作人Id
     * message: 异常信息
     * sql：执行失败的SQL
     *
     * @param auditLog 审计失败日志
     */
    void auditlog(Map<String, Object> auditLog);
}
