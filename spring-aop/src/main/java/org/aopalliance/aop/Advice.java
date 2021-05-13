/*
 * Copyright 2002-2016 the original author or authors.
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

package org.aopalliance.aop;

/**
 * Tag interface for Advice. Implementations can be any type
 * of advice, such as Interceptors.
 *
 * @author Rod Johnson
 * @version $Id: Advice.java,v 1.1 2004/03/19 17:02:16 johnsonr Exp $
 *
 * 有了pointcut，有了切面，就应该执行我们需要的操作了，spring定义了通知，
 * 可以实现在程序执行到切面的时候，进行callback Advice来实现具体的操作
 * 同时通知分为以下几种，
 *
 *
 * Interceptors Around：JointPoint前后调用
 * Before：JointPoint前调用
 * After Returning：JointPoint后调用
 * Throw：JoinPoint抛出异常时调用
 * Introduction：JointPoint调用完毕后调用
 *
 */
public interface Advice {

}
