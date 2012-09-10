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

package org.apache.flex.compiler.internal.config;

import java.util.LinkedList;
import java.util.List;

/**
 * This value object represents a frame's name and classes.
 */
public class FrameInfo
{
    private String label = null;
    private List<String> frameClasses = new LinkedList<String>();
    
    /**
     * @return the label
     */
    public String getLabel()
    {
        return label;
    }
    /**
     * @param label the label to set
     */
    public void setLabel(String label)
    {
        this.label = label;
    }
    /**
     * @return the frameClasses
     */
    public List<String> getFrameClasses()
    {
        return frameClasses;
    }
    /**
     * @param frameClasses the frameClasses to set
     */
    public void setFrameClasses(List<String> frameClasses)
    {
        this.frameClasses = frameClasses;
    }
}