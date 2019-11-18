package com.lazyfighter.namespace;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * @author
 * 自定义xml文件解析
 */
public class MyNameSpaceHandler extends NamespaceHandlerSupport {

	@Override
	public void init() {
		System.out.println("init");
	}
}
