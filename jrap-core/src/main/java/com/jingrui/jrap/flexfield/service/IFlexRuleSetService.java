package com.jingrui.jrap.flexfield.service;

import com.jingrui.jrap.core.ProxySelf;
import com.jingrui.jrap.flexfield.dto.FlexModel;
import com.jingrui.jrap.system.service.IBaseService;
import com.jingrui.jrap.flexfield.dto.FlexRuleSet;

import java.util.List;

public interface IFlexRuleSetService extends IBaseService<FlexRuleSet>, ProxySelf<IFlexRuleSetService> {

    /** 查询所有弹性域模型
     * @param model 规则集
     * @param page 当前页数
     * @param pageSize 分页大小
     * @return 所有规则集
     */
    List<FlexRuleSet> queryFlexModel(FlexRuleSet model, int page, int pageSize);

    /**删除弹性域模型集合
     * @param flexRuleSets 需要删除额规则集
     */
    void deleteRuleSet(List<FlexRuleSet> flexRuleSets);

}