// ============================================================================
//
// Copyright (C) 2006-2021 Talend Inc. - www.talend.com
//
// This source code is available under agreement available at
// %InstallDIR%\features\org.talend.rcp.branding.%PRODUCTNAME%\%PRODUCTNAME%license.txt
//
// You should have received a copy of the agreement
// along with this program; if not, write to Talend SA
// 9 rue Pages 92150 Suresnes, France
//
// ============================================================================
package org.talend.survivorship.action.handler;

/**
 * Create by zshen multi-Condition Responsibility chain handler
 */
public class MCCRHandler extends AbstractChainOfResponsibilityHandler {

    /**
     * create new MCCRHandler by another Responsibility chain handler.
     * 
     * @param acrHandler old Responsibility chain handler
     */
    public MCCRHandler(AbstractChainOfResponsibilityHandler acrHandler) {
        super(acrHandler);
    }

    /**
     * create new MCCRHandler by HandlerParameter.
     * 
     * @param parameterObject parameter of current handler
     */
    public MCCRHandler(HandlerParameter parameterObject) {
        super(parameterObject);
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * org.talend.survivorship.action.handler.AbstractChainResponsibilityHandler#isContinue(org.talend.survivorship.model.DataSet,
     * java.lang.Object, java.lang.String, boolean)
     */
    @Override
    protected boolean needContinue(Object inputData, int rowNum) {
        if (this.getHandlerParameter().getReferenceColumn() == null) {
            return false;
        }
        return this.canHandle(inputData, getHandlerParameter().getExpression(), rowNum);
    }

}
