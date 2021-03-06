/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.apache.s2graph.core.tinkerpop.process

import org.apache.s2graph.core.S2Graph
import org.apache.s2graph.core.tinkerpop.S2GraphProvider
import org.apache.tinkerpop.gremlin.GraphProviderClass
import org.apache.tinkerpop.gremlin.process.ProcessStandardSuite
import org.junit.FixMethodOrder
import org.junit.runner.RunWith
import org.junit.runners.MethodSorters

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(classOf[ProcessStandardSuite])
@GraphProviderClass(provider = classOf[S2GraphProvider], graph = classOf[S2Graph])
class S2GraphProcessStandardTest {

}
