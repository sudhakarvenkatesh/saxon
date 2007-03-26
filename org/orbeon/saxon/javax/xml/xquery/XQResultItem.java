package org.orbeon.saxon.javax.xml.xquery;

import org.orbeon.saxon.javax.xml.xquery.XQConnection;
import org.orbeon.saxon.javax.xml.xquery.XQException;
import org.orbeon.saxon.javax.xml.xquery.XQItem;
import org.orbeon.saxon.javax.xml.xquery.XQItemAccessor;

/**
 * XQJ interfaces reconstructed from version 0.5 documentation
 */
public interface XQResultItem extends XQItem, XQItemAccessor {

    void clearWarnings();

    XQConnection getConnection() throws XQException;

    XQWarning getWarnings() throws XQException;
}