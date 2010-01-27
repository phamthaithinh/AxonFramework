/*
 * Copyright (c) 2010. Axon Framework
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.axonframework.core;

/**
 * Special case of the {@link org.axonframework.core.AggregateNotFoundException} that indicates that historic
 * information of an aggregate was found, but the aggregate has been deleted.
 *
 * @author Allard Buijze
 * @since 0.4
 */
public class AggregateDeletedException extends AggregateNotFoundException {

    /**
     * Initialize a AggregateDeletedException with the given <code>message</code>
     *
     * @param message The message describing the cause of the exception
     */
    public AggregateDeletedException(String message) {
        super(message);
    }

    /**
     * Initialize a AggregateDeletedException with the given <code>message</code> and <code>cause</code>
     *
     * @param message The message describing the cause of the exception
     * @param cause   The exception causing this exception
     */
    public AggregateDeletedException(String message, Throwable cause) {
        super(message, cause);
    }
}