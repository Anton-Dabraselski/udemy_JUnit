import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

@FunctionalInterface
interface Interface{
    void run();
}

@SuppressWarnings("all")
public class AnnotationsDemo {

    //@Override
    public boolean equals(Object str){
        return this.equals(str);
    }

    //@SuppressWarnings({"unchecked", "deprecation"})
    public void run(){
        List list = new ArrayList();
        list.add("");

        JDialog jd = new JDialog();
        jd.show();
    }

    public static void main(String[] args) {
        new AnnotationsDemo().run();
    }

}
