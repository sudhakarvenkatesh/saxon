package org.orbeon.saxon.type;

/**
 * This is a marker interface that acts as a surrogate for an object representing
 * an element or attribute declaration.
 * The real implementation of these declarations is available in the schema-aware
 * version of the Saxon product.
 */
public interface SchemaDeclaration {

    public SchemaType getType();

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
// The Initial Developer of the Original Code is Saxonica Limited
//
// Portions created by (your name) are Copyright (C) (your legal entity). All Rights Reserved.
//
// Contributor(s): none
//