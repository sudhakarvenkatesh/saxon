package org.orbeon.saxon.functions;
import org.orbeon.saxon.expr.Expression;
import org.orbeon.saxon.expr.StaticContext;
import org.orbeon.saxon.expr.StaticProperty;
import org.orbeon.saxon.expr.XPathContext;
import org.orbeon.saxon.om.Item;
import org.orbeon.saxon.value.StringValue;
import org.orbeon.saxon.type.Type;
import org.orbeon.saxon.type.ItemType;
import org.orbeon.saxon.xpath.XPathException;

/**
* Implement XPath function string()
*/

public class StringFn extends SystemFunction {

    /**
    * Simplify and validate.
    * This is a pure function so it can be simplified in advance if the arguments are known
    */

     public Expression simplify(StaticContext env) throws XPathException {
        useContextItemAsDefault();
        return simplifyArguments(env);
    }

    /**
    * Type check. This refinement of the method removes the function call wrapper if the
    * argument is already of type single string
    */

    public Expression analyze(StaticContext env, ItemType contextItemType) throws XPathException {
        super.analyze(env, contextItemType);
        if (argument[0].getItemType()==Type.STRING_TYPE &&
                argument[0].getCardinality()==StaticProperty.EXACTLY_ONE) {
            return argument[0];
        }
        return this;
    }

    /**
    * Evaluate the function
    */

    public Item evaluateItem(XPathContext c) throws XPathException {
        Item arg = argument[0].evaluateItem(c);
        if (arg==null) {
            return StringValue.EMPTY_STRING;
        } else {
            return new StringValue(arg.getStringValue());
        }
    }

}


//
// The contents of this file are subject to the Mozilla Public License Version 1.0 (the "License");
// you may not use this file except in compliance with the License. You may obtain a copy of the
// License at http://www.mozilla.org/MPL/
//
// Software distributed under the License is distributed on an "AS IS" basis,
// WITHOUT WARRANTY OF ANY KIND, either express or implied.
// See the License for the specific language governing rights and limitations under the License.
//
// The Original Code is: all this file.
//
// The Initial Developer of the Original Code is Michael H. Kay.
//
// Portions created by (your name) are Copyright (C) (your legal entity). All Rights Reserved.
//
// Contributor(s): none.
//
