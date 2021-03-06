/**
 * Copyright (C) 2005 TopCoder Inc., All Rights Reserved.
 */
package com.topcoder.util.idgenerator.ejb;

import com.topcoder.util.idgenerator.IDGenerationException;
import com.topcoder.util.idgenerator.IDGeneratorFactory;

import java.math.BigInteger;

import javax.ejb.SessionBean;
import javax.ejb.SessionContext;


/**
 * This stateless session bean is simply an EJB interface to the IDGenerator class.
 *
 * @author srowen, iggy36, gua
 * @version 3.0
 */
public class IDGeneratorBean implements SessionBean {
    /** SessionContext for this session bean, set by the container when the bean is created. */
    private SessionContext ctx = null;

    /**
     * Returns the next ID in the named ID sequence.
     *
     * @param idName ID sequence name
     * @return the next ID in the named ID sequence
     *
     * @throws IDGenerationException if an error occurs while generating the ID (for example, error while connecting to
     *         the database)
     */
    public long getNextID(String idName) throws IDGenerationException {
        return IDGeneratorFactory.getIDGenerator(idName).getNextID();
    }

    /**
     * <p>
     * Returns the next BigInteger ID in the named ID sequence.
     * </p>
     *
     * @param idName ID sequence name
     *
     * @return Next id in seqeunce as a BigInteger
     *
     * @throws IDGenerationException if an error occurs while generating the ID (for example, error while connecting to
     *         the database)
     */
    public BigInteger getNextBigID(String idName) throws IDGenerationException {
        return IDGeneratorFactory.getIDGenerator(idName).getNextBigID();
    }

    /**
     * This implementation does nothing.
     */
    public void ejbActivate() {
    }

    /**
     * This implementation does nothing.
     */
    public void ejbPassivate() {
    }

    /**
     * This implementation does nothing.
     */
    public void ejbCreate() {
    }

    /**
     * This implementation does nothing.
     */
    public void ejbRemove() {
    }

    /**
     * Sets the SessionContext for this session bean.
     *
     * @param ctx SessionContext for this session bean
     */
    public void setSessionContext(SessionContext ctx) {
        this.ctx = ctx;
    }
}
