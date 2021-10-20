/*
 * Copyright 2021-2021 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.springframework.batch.extensions.kotlindsl.step

import org.springframework.batch.core.Step
import org.springframework.batch.core.step.builder.FlowStepBuilder
import org.springframework.batch.extensions.kotlindsl.support.BatchDslMarker
import org.springframework.batch.extensions.kotlindsl.support.DslContext

/**
 * A dsl for [FlowStepBuilder][org.springframework.batch.core.step.builder.FlowStepBuilder].
 *
 * @author Taeik Lim
 * @since 0.1.0
 */
@BatchDslMarker
class FlowStepBuilderDsl internal constructor(
    @Suppress("unused")
    private val dslContext: DslContext,
    private val flowStepBuilder: FlowStepBuilder
) {
    internal fun build(): Step {
        return this.flowStepBuilder.build()
    }
}
