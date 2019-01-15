/*
 * This file is generated by jOOQ.
 */
package com.example.jooq.tables.records;


import com.example.jooq.tables.Authorbook;

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
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class AuthorbookRecord extends UpdatableRecordImpl<AuthorbookRecord> implements Record2<Integer, Integer> {

    private static final long serialVersionUID = 2088664384;

    /**
     * Setter for <code>public.authorbook.author_id</code>.
     */
    public AuthorbookRecord setAuthorId(Integer value) {
        set(0, value);
        return this;
    }

    /**
     * Getter for <code>public.authorbook.author_id</code>.
     */
    public Integer getAuthorId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>public.authorbook.book_id</code>.
     */
    public AuthorbookRecord setBookId(Integer value) {
        set(1, value);
        return this;
    }

    /**
     * Getter for <code>public.authorbook.book_id</code>.
     */
    public Integer getBookId() {
        return (Integer) get(1);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record2<Integer, Integer> key() {
        return (Record2) super.key();
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Integer, Integer> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return Authorbook.AUTHORBOOK.AUTHOR_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field2() {
        return Authorbook.AUTHORBOOK.BOOK_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component2() {
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getAuthorId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value2() {
        return getBookId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorbookRecord value1(Integer value) {
        setAuthorId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorbookRecord value2(Integer value) {
        setBookId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AuthorbookRecord values(Integer value1, Integer value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached AuthorbookRecord
     */
    public AuthorbookRecord() {
        super(Authorbook.AUTHORBOOK);
    }

    /**
     * Create a detached, initialised AuthorbookRecord
     */
    public AuthorbookRecord(Integer authorId, Integer bookId) {
        super(Authorbook.AUTHORBOOK);

        set(0, authorId);
        set(1, bookId);
    }
}