package sec02.exam03;

public class Button {
    OnClickListener listener;

    public void setOnClickListener(OnClickListener listener) {
        this.listener = listener;
    }

    void touch() {
        listener.onClick();
        }
    static interface OnClickListener {
        void onClick();
    }
}
