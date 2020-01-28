package com.ocajexam.chapter.eleven.interface_funcional_customized;

@FunctionalInterface
public interface NegativeColor<T> {

	public abstract boolean hasColor(T t);
}
