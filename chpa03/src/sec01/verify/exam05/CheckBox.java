package sec01.verify.exam05;

public class CheckBox {
    OnSelectListener listener;

    void setOnListener(OnSelectListener listener) {
        this.listener = listener;
    }

    void select() {
        listener.onSelect();
    }

    static interface OnSelectListener {
        void onSelect();
    }
}
