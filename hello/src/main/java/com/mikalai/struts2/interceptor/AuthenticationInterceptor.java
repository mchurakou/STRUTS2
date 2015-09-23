package com.mikalai.struts2.interceptor;


import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.interceptor.Interceptor;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Map;

/**
 * Created by Mikalai_Churakou on 9/18/2015.
 */
public class AuthenticationInterceptor implements Interceptor {
    private static final Logger logger = LogManager.getLogger();

    public void destroy() {

    }

    public void init() {

    }

    public String intercept(ActionInvocation invocation) throws Exception {
        logger.info("AuthenticationInterceptor INTERCEPT!!!");
        Map session = invocation.getInvocationContext().getSession();
        String auth = (String) session.get("auth");
        if (auth == null) {

            return ActionSupport.ERROR;
        } else {
            Action action = (Action) invocation.getAction();

            return invocation.invoke();
        }
    }
}
