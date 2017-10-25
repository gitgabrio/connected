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
var internalJsUtil = goog.require('jsinterop.base.InternalJsUtil');

// monkeypatch the bits of jsinterop-base we use
internalJsUtil.getIndexed=function(array, index) { return array[index]; };
internalJsUtil.getLength=function(array) { return array.length; };

// Seems this can't run right away, circular deps haven't been resolved yet.
setTimeout(function(){ FlowChartEntryPoint.$create__().m_onModuleLoad__()}, 0);

