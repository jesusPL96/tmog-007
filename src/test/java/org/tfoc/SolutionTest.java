package org.tfoc;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

@Slf4j
class SolutionTest {

    @Test
    void testSolution() {

        String word = "anagram";
        String possibleAnagram = "nagaram";
        boolean result = Solution.isAnagram(word, possibleAnagram);

        assertTrue(result);

    }

    @Test
    void testSolutionFailed() {

        String word = "rat";
        String possibleAnagram = "car";
        boolean result = Solution.isAnagram(word, possibleAnagram);

        assertFalse(result);

    }

    @Test
    void testLowerCase() {

        String word = "ANAGRAM";
        String possibleAnagram = "nagaram";
        boolean result = Solution.isAnagram(word, possibleAnagram);

        assertTrue(result);

    }

    @Test
    void testNull() {

        String possibleAnagram = "car";
        boolean result = Solution.isAnagram(null, possibleAnagram);

        assertFalse(result);

    }

    @Test
    void testNotEqualLength() {

        String word = "carrrr";
        String possibleAnagram = "car";
        boolean result = Solution.isAnagram(word, possibleAnagram);

        assertFalse(result);

    }



}