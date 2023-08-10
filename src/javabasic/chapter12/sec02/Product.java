package javabasic.chapter12.sec02;

public class Product<T, M> {
    private T kind;
    private M model;

    public M getModel() {
        return model;
    }

    public T getKind() {
        return kind;
    }

    public void setModel(M model) {
        this.model = model;
    }

    public void setKind(T kind) {
        this.kind = kind;
    }
}
