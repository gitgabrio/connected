package com.vertispan.draw.connected.client.data

/*
 * #%L
 * connected
 * %%
 * Copyright (C) 2017 Vertispan
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */

/**
 * Simple "edge" or "line" data model.
 */
class IsParentRelationship (
    var childId: String,
    var parentId: String
) {

    override fun equals(o: Any?): Boolean {
        if (this === o) return true
        if (o == null || javaClass != o.javaClass) return false

        val that = o as IsParentRelationship?

        if (childId != that!!.childId) return false
        return parentId == that.parentId

    }

    override fun hashCode(): Int {
        var result = childId!!.hashCode()
        result = 31 * result + parentId!!.hashCode()
        return result
    }
}