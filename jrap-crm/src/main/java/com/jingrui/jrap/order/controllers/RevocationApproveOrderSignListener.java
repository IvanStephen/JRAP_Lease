/*
 * *
 *  @file com.maddyhome.idea.copyright.pattern.JavaCopyrightVariablesProvider$1@1c3c463f$
 *  @CopyRight (C) 2018 ZheJiangJingRui Co. Ltd.
 *  @brief JingRui Application Platform
 *  @author $name$
 *  @email yulong.yuan@jr-info.cn
 *  @date $date$
 * /
 */

package com.jingrui.jrap.order.controllers;

import com.jingrui.jrap.activiti.custom.IActivitiBean;
import com.jingrui.jrap.code.rule.service.ISysCodeRuleProcessService;
import com.jingrui.jrap.order.dto.Order;
import com.jingrui.jrap.order.mapper.OrderMapper;
import com.jingrui.jrap.order.service.impl.OrderServiceImpl;
import org.activiti.engine.delegate.DelegateExecution;
import org.activiti.engine.delegate.ExecutionListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.ContextLoader;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

public class RevocationApproveOrderSignListener implements ExecutionListener, IActivitiBean {

  private WebApplicationContext context = ContextLoader.getCurrentWebApplicationContext();
  @Autowired
  ISysCodeRuleProcessService codeRuleProcessService;

  public OrderServiceImpl orderServiceimp;

  @Override
  public void notify(DelegateExecution delegateExecution) {
    // 获取Mapper接口
    orderServiceimp = context.getBean(OrderServiceImpl.class);
    codeRuleProcessService = context.getBean(ISysCodeRuleProcessService.class);
    // 获取流程PK
    Long revocationId = Long.parseLong(delegateExecution.getProcessInstanceBusinessKey());
    orderServiceimp.updateOrderCheck("SIGNED", revocationId);
  }

}
