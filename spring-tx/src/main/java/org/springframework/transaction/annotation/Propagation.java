/*
 * Copyright 2002-2019 the original author or authors.
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

package org.springframework.transaction.annotation;

import org.springframework.transaction.TransactionDefinition;

/**
 * 事务传播行为枚举
 */
public enum Propagation {

	/**
	 * 支持当前事务， 如果没有则创建一个
	 */
	REQUIRED(TransactionDefinition.PROPAGATION_REQUIRED),

	/**
	 * 支持当前事务，如果没有事务则直接执行
	 */
	SUPPORTS(TransactionDefinition.PROPAGATION_SUPPORTS),

	/**
	 * 支持当前事务， 如果没有则抛出异常
	 */
	MANDATORY(TransactionDefinition.PROPAGATION_MANDATORY),

	/**
	 * 创建一个新的事务，并终止当前的事务
	 */
	REQUIRES_NEW(TransactionDefinition.PROPAGATION_REQUIRES_NEW),

	/**
	 * 不支持事务的执行，如果存在事务则终止事务的执行
	 */
	NOT_SUPPORTED(TransactionDefinition.PROPAGATION_NOT_SUPPORTED),

	/**
	 * 不支持事务执行，如果存在事务则抛出异常
	 */
	NEVER(TransactionDefinition.PROPAGATION_NEVER),

	/**
	 * 如果当前事务存在，则创建一个嵌套事务进行执行
	 */
	NESTED(TransactionDefinition.PROPAGATION_NESTED);


	private final int value;


	Propagation(int value) {
		this.value = value;
	}

	public int value() {
		return this.value;
	}

}
