package com.vertispan.draw.connected.client.blank

/*
 * #%L
 * Connected
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

import com.vertispan.draw.connected.client.blank.SelectionEvent.HasSelectionHandlers

import java.util.ArrayList

/**
 * Created by colin on 9/16/17.
 */
class HandlerManager(private val instance: HasSelectionHandlers<*>) {
    private val handlers = ArrayList<(SelectionEvent<*>) -> Unit>()//TODO make this a map again...

    fun <B> addHandler(selectionHandler: (SelectionEvent<B>) -> Unit): (Unit) -> Unit {
        handlers.add(selectionHandler as (SelectionEvent<*>) -> Unit)
        return { handlers.remove(selectionHandler) }
    }

    fun fireEvent(gwtEvent: SelectionEvent<*>) {
        handlers.forEach { handler -> handler(gwtEvent as SelectionEvent<Any>) }
    }
}