/*
 * Copyright (c) 2010-2014. Axon Framework
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

package org.axonframework.commandhandling;

/**
 * Interface describing a callback that is invoked when command handler execution has finished. Depending of the outcome
 * of the execution, either the {@link #onSuccess(Object)} or the {@link #onFailure(Throwable)} is called.
 *
 * @param <R> the type of result of the command handling
 * @author Allard Buijze
 * @since 0.6
 */
public interface CommandCallback<R> {

    /**
     * Invoked when command handling execution was successful.
     *
     * @param result The result of the command handling execution, if any.
     */
    void onSuccess(R result);

    /**
     * Invoked when command handling execution resulted in an error.
     *
     * @param cause The exception raised during command handling
     */
    void onFailure(Throwable cause);
}
