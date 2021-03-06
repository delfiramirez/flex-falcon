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

package org.apache.flex.compiler.tree.as;

import org.apache.flex.compiler.definitions.IClassDefinition;
import org.apache.flex.compiler.definitions.ITypeDefinition;
import org.apache.flex.compiler.projects.ICompilerProject;

/**
 * Represents a class that represents a typed collection. Currently in AS3 with
 * Flash Player 10+, this is restricted to the Vector type. A typed collection
 * will have an additional type that represents the contents that can be held
 * within the collection.
 */
public interface ITypedClassNode extends IClassDefinition
{
    /**
     * Resolves the type of the collection that this IAppliedVectorDefinition
     * contains
     * 
     * @param project an ICompilerProject to help with lookup
     * @return an {@link ITypeNode} or null if the collections type cannot be
     * resolved
     */
    ITypeDefinition resolveCollectionType(ICompilerProject project);

    /**
     * Returns the type of the collection that this IAppliedVectorDefinition
     * contains
     * 
     * @return the type of the collection
     */
    String getCollectionType();

    IExpressionNode getCollectionTypeNode();
}
