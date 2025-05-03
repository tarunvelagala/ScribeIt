package com.scribeit.controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ScribeControllerTest {

    private static final String TEST_SCRIBE_ID = "TestScribeId";

    @Test
    void testGetScribe() {
        final ScribeController mockScribeController = new ScribeController();
        final String scribeResponse = mockScribeController.getScribeById(TEST_SCRIBE_ID);
        Assertions.assertTrue(TEST_SCRIBE_ID.equals(scribeResponse));
    }
}
