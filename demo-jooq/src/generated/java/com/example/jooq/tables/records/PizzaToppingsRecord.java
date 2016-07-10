/**
 * This class is generated by jOOQ
 */
package com.example.jooq.tables.records;


import com.example.jooq.tables.PizzaToppings;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.2"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class PizzaToppingsRecord extends UpdatableRecordImpl<PizzaToppingsRecord> implements Record2<Long, Long> {

    private static final long serialVersionUID = -927856352;

    /**
     * Setter for <code>PUBLIC.PIZZA_TOPPINGS.PIZZA_ID</code>.
     */
    public void setPizzaId(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>PUBLIC.PIZZA_TOPPINGS.PIZZA_ID</code>.
     */
    public Long getPizzaId() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>PUBLIC.PIZZA_TOPPINGS.TOPPINGS_ID</code>.
     */
    public void setToppingsId(Long value) {
        set(1, value);
    }

    /**
     * Getter for <code>PUBLIC.PIZZA_TOPPINGS.TOPPINGS_ID</code>.
     */
    public Long getToppingsId() {
        return (Long) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Long, Long> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, Long> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PizzaToppings.PIZZA_TOPPINGS.PIZZA_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field2() {
        return PizzaToppings.PIZZA_TOPPINGS.TOPPINGS_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getPizzaId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value2() {
        return getToppingsId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PizzaToppingsRecord value1(Long value) {
        setPizzaId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PizzaToppingsRecord value2(Long value) {
        setToppingsId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PizzaToppingsRecord values(Long value1, Long value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PizzaToppingsRecord
     */
    public PizzaToppingsRecord() {
        super(PizzaToppings.PIZZA_TOPPINGS);
    }

    /**
     * Create a detached, initialised PizzaToppingsRecord
     */
    public PizzaToppingsRecord(Long pizzaId, Long toppingsId) {
        super(PizzaToppings.PIZZA_TOPPINGS);

        set(0, pizzaId);
        set(1, toppingsId);
    }
}
