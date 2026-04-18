package Strings.Leetcode;


//Leetcode 796
public class RotateString {
    public boolean rotateString(String s, String goal) {
        // Edge case: If both are empty, return true
        if (s.isEmpty() && goal.isEmpty()) return true;

        // Lengths must match for rotation
        if (s.length() != goal.length()) return false;

        // Check if goal is a substring of s + s
        return (s + s).contains(goal);
    }
}
