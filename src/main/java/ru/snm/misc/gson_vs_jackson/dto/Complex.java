package ru.snm.misc.gson_vs_jackson.dto;

/**
 * @author sine-loco
 */
public final class Complex {
    public final String string;
    public final Simple simple;

    public Complex( String string, Simple simple ) {
        this.string = string;
        this.simple = simple;
    }
}
