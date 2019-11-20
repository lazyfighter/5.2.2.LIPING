package com.lazyfighter.importselector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		System.out.println("--------------start---------------");
		System.out.println(this.getClass().getName());
		System.out.println("--------------stop---------------");
		return new String[0];
	}
}
