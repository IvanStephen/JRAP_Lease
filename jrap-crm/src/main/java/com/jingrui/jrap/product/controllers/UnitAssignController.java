package com.jingrui.jrap.product.controllers;

import org.springframework.stereotype.Controller;
import com.jingrui.jrap.system.controllers.BaseController;
import com.jingrui.jrap.core.IRequest;
import com.jingrui.jrap.system.dto.ResponseData;
import com.jingrui.jrap.product.dto.UnitAssign;
import com.jingrui.jrap.product.service.IUnitAssignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;
import org.springframework.validation.BindingResult;
import java.util.List;

    @Controller
    public class UnitAssignController extends BaseController{

    @Autowired
    private IUnitAssignService service;


    @RequestMapping(value = "/pro/unit/assign/query")
    @ResponseBody
    public ResponseData query(UnitAssign dto, @RequestParam(defaultValue = DEFAULT_PAGE) int page,
        @RequestParam(defaultValue = DEFAULT_PAGE_SIZE) int pageSize, HttpServletRequest request) {
        IRequest requestContext = createRequestContext(request);
        return new ResponseData(service.select(requestContext,dto,page,pageSize));
    }

    @RequestMapping(value = "/pro/unit/assign/submit")
    @ResponseBody
    public ResponseData update(@RequestBody List<UnitAssign> dto, BindingResult result, HttpServletRequest request){
        getValidator().validate(dto, result);
        if (result.hasErrors()) {
        ResponseData responseData = new ResponseData(false);
        responseData.setMessage(getErrorMessage(result, request));
        return responseData;
        }
        IRequest requestCtx = createRequestContext(request);
        return new ResponseData(service.batchUpdate(requestCtx, dto));
    }

    @RequestMapping(value = "/pro/unit/assign/remove")
    @ResponseBody
    public ResponseData delete(HttpServletRequest request,@RequestBody List<UnitAssign> dto){
        service.batchDelete(dto);
        return new ResponseData();
    }
    }