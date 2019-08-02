package com.qixiafei.book.effect.java.rule2;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

/**
 * <P>Description: . </P>
 * <P>CALLED BY:   齐霞飞 </P>
 * <P>UPDATE BY:   </P>
 * <P>CREATE DATE: 2019/8/1 18:20</P>
 * <P>UPDATE DATE: </P>
 *
 * @author 齐霞飞
 * @version 1.0
 * @since java 1.8.0
 */
public abstract class Pizza {

    public enum Topping {HAM, MUSHROOM, ONION, PEPPER, SAUSAGE}

    final Set<Topping> toppings;

    abstract static class AbstractBuilder<T extends AbstractBuilder<T>> {
        final EnumSet<Topping> toppings = EnumSet.allOf(Topping.class);

        public T addTopping(Topping topping) {
            toppings.add(Objects.requireNonNull(topping));
            return self();
        }

        abstract Pizza build();

        protected abstract T self();
    }

    Pizza(AbstractBuilder<?> builder) {
        toppings = builder.toppings.clone();
    }
}
