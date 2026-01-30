package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListManagerTest {

    private ListManager listManager;
    private List<Integer> list;

    @BeforeEach
    void setup() {
        listManager = new ListManager();
        list = new ArrayList<>();
    }

    @Test
    @DisplayName("Add Element Test")
    void testAddElement() {
        listManager.addElement(list, 10);
        assertTrue(list.contains(10));
    }

    @Test
    @DisplayName("Remove Element Test")
    void testRemoveElement() {
        list.add(20);
        listManager.removeElement(list, 20);
        assertFalse(list.contains(20));
    }

    @Test
    @DisplayName("List Size Update Test")
    void testGetSize() {
        listManager.addElement(list, 5);
        listManager.addElement(list, 15);
        assertEquals(2, listManager.getSize(list));
    }
}
