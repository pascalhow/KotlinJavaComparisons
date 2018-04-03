package com.pascalhow.kotlinlearnings.operators;

import java.util.Objects;

public class Square {
    private final int width;
    private final int height;

    public Square(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public Square sum(Square square) {
        return new Square(this.width + square.getWidth(), this.height + square.getHeight());
    }

    public Square minus(Square square) {
        return new Square(this.width - square.getWidth(), this.height - square.getHeight());
    }

    public Square times(Square square) {
        return new Square(this.width * square.getWidth(), this.height * square.getHeight());
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Square square = (Square) o;
        return width == square.width &&
                height == square.height;
    }

    @Override
    public int hashCode() {
        return Objects.hash(width, height);
    }

    @Override
    public String toString() {
        return "Square{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }
}
