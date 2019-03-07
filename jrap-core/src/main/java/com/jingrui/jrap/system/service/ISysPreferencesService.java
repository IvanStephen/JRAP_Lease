/*
 * #{copyright}#
 */
package com.jingrui.jrap.system.service;

import java.util.List;

import com.jingrui.jrap.core.annotation.StdWho;
import com.jingrui.jrap.core.IRequest;
import com.jingrui.jrap.core.ProxySelf;
import com.jingrui.jrap.system.dto.SysPreferences;

/**
 * 系统首选项接口.
 * 
 * @author zhangYang
 * @author njq.niu@jingrui.com
 */
public interface ISysPreferencesService extends IBaseService<SysPreferences>, ProxySelf<ISysPreferencesService> {

    /**
     * 保存首选项.
     * 
     * @param requestContext
     *          请求上下文
     * @param preferences
     *          首选项信息集合
     * @return List<SysPreferences>
     *          返回保存结果
     */
    List<SysPreferences> saveSysPreferences(IRequest requestContext, @StdWho List<SysPreferences> preferences);

    /**
     * 优先从缓存中查询当前用户首选项集合
     *
     * @param requestContext
     *            根据SysPreferences.accountId;SysPreferences.preferencesLevel查询条件
     *            查询当前首选项
     * @return responseData 响应数据
     */
    List<SysPreferences> querySysPreferences(IRequest requestContext, SysPreferences preferences);

    /**
     * 从db中查询当前用户首选项集合
     *
     * @param requestContext
     *            根据SysPreferences.accountId;SysPreferences.preferencesLevel查询条件
     *            查询当前首选项
     * @return responseData 响应数据
     */
    List<SysPreferences> querySysPreferencesByDb(IRequest requestContext, SysPreferences preferences);


    /**
     * 优先从缓存中查询当前用户单个首选项
     *
     * @param preference
     * @param userId
     *            根据SysPreferences.accountId;SysPreferences.preferencesLevel查询条件
     *            查询当前首选项
     * @return
     */
    SysPreferences selectUserPreference(String preference, Long userId);
    
}
