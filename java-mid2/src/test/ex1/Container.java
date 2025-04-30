package test.ex1;

public class Container <T>{

    private T t;


    public boolean isEmpty() {
        if(t == null) {
            return true;
        }else {
            return false;
        }
    }


    public void setItem(T data) {
        this.t = data;
    }

    public T getItem() {
        return t;
    }
}
