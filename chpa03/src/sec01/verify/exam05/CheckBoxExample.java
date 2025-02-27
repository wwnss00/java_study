package sec01.verify.exam05;

public class CheckBoxExample {
    public static void main(String[] args) {
        CheckBox checkBox = new CheckBox();
        checkBox.setOnListener(new BackgroundChangeListner());
        checkBox.select();
    }
}
