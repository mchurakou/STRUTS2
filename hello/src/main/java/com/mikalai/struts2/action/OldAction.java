package com.mikalai.struts2.action;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by Mikalai_Churakou on 9/23/2015.
 */
public class OldAction extends Action {
    private static final Logger logger = LogManager.getLogger();

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest req, HttpServletResponse resp) throws Exception {


        logger.info("OLD ACTION");
        return mapping.findForward("old");

    }
}
