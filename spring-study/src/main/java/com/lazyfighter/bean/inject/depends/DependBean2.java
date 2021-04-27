package com.lazyfighter.bean.inject.depends;

import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

@Component
@DependsOn("dependBean1")
public class DependBean2 {


}
