package com.jingrui.jrap.settle.controllers;

import org.springframework.stereotype.Controller;
import com.jingrui.jrap.system.controllers.BaseController;
import com.jingrui.jrap.core.IRequest;
import com.jingrui.jrap.system.dto.ResponseData;
import com.jingrui.jrap.settle.dto.Operate;
import com.jingrui.jrap.settle.service.IOperateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import com.jingrui.jrap.mybatis.common.Criteria;
import java.util.List;

@Controller
public class OperateController extends BaseController{

    @Autowired
    private IOperateService service;


    @RequestMapping(value = "/acc/operate/query")
    @ResponseBody
    public ResponseData query(Operate dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/acc/operate/selectOptions")
    @ResponseBody
    public ResponseData queryOptions(Operate dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        Criteria criteria = new Criteria(dto);
        return new ResponseData(service.selectOptions(requestContext, dto, criteria, page, pageSize));
    }

    @RequestMapping(value = "/acc/operate/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<Operate> dto, BindingResult result, HttpServletRequest request){
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
        ResponseData responseData = new ResponseData(false);
        responseData.setMessage(getErrorMessage(result, request));
        return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/acc/operate/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<Operate> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
}