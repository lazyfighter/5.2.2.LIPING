package com.lazyfighter.bean.inject.depends;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn(value = {"dependBean1", "dependBean2"})
public class DependBean {


}
