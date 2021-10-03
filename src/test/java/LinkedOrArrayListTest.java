import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedOrArrayListTest {

    static List<String > arrayList;
    static List<String > linkedList;

    @BeforeClass
    public static void setUpBeforeClass(){
        System.out.println("Populating ArrayList...");
        arrayList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            arrayList.add("" + i);
        }
        System.out.println("Done.");

        linkedList = new LinkedList<>(arrayList);
    }

    //if test so long time < 7 sec => error
    @Test(timeout = 7)
    @Ignore("Removal on ArrayList takes too long so we disable it for the time being.")
    public void testRemove() {
        LinkedOrArrayList.remove(arrayList, "123");
    }
    @Test(timeout = 1)
    public void testRemove_LinkedList() {
        LinkedOrArrayList.remove(linkedList, "123");
    }
}
