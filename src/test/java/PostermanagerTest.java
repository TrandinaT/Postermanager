import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class PostermanagerTest {

    @Test
    public void findAll() {
        Postermanager manager = new Postermanager(5);

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourh");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");


        String[] expected = {"First", "Second", "Third", "Fourh", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findLast() {
        Postermanager manager = new Postermanager(6);

        manager.add("First");
        manager.add("Second");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");


        String[] expected = {"6", "5", "4", "3", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }
    @Test
    public void findLastnoLimit() {
        Postermanager manager = new Postermanager();

        manager.add("First");
        manager.add("Second");
        manager.add("3");
        manager.add("4");
        manager.add("5");
        manager.add("6");



        String[] expected = {"6", "5", "4", "3", "Second", "First"};
        String[] actual = manager.findLast();

        assertArrayEquals(expected, actual);
    }

    @Test
    public void findAllnoLimit() {
        Postermanager manager = new Postermanager();

        manager.add("First");
        manager.add("Second");
        manager.add("Third");
        manager.add("Fourh");
        manager.add("Fifth");
        manager.add("Sixth");
        manager.add("Seventh");
        manager.add("Eighth");
        manager.add("Ninth");
        manager.add("Tenth");


        String[] expected = {"First", "Second", "Third", "Fourh", "Fifth", "Sixth", "Seventh", "Eighth", "Ninth", "Tenth"};
        String[] actual = manager.findAll();

        assertArrayEquals(expected, actual);
    }
}
