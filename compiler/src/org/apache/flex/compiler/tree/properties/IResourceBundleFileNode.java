/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.flex.compiler.tree.properties;

import org.apache.flex.compiler.tree.as.IFileNode;

/**
 * This AST node represents a .properties file.
 */
public interface IResourceBundleFileNode extends IFileNode
{
    /**
     * Returns the bundle name of the associated .properties file which is the
     * name of the file without file extension.
     * 
     * @return the bundle name of the associated .properties file
     */
    String getBundleName();

    /**
     * Returns the locale of this file node if the associated file is locale
     * dependent.
     * 
     * @return the locale of this file node or <code>null</code> if the
     * associated file is not a locale dependent file which means that the file
     * applies to all the locales.
     */
    String getLocale();
}
