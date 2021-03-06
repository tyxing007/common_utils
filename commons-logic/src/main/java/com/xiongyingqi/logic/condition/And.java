package com.xiongyingqi.logic.condition;

import java.util.Collection;
import java.util.HashSet;

/**
 * Created by 瑛琪<a href="http://xiongyingqi.com">xiongyingqi.com</a> on 2014/10/22 0022.
 */
public class And implements Condition {
    public static final Collection<Condition> CONDITIONS = new HashSet<Condition>();

    @Override
    public Condition condition(Condition condition) {
        CONDITIONS.add(condition);
        return this;
    }
}
