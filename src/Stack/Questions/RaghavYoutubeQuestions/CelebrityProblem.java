package Stack.Questions.RaghavYoutubeQuestions;

import java.util.Stack;

public class CelebrityProblem {
    //GFG
//    A celebrity is a person who is known to all but does not know anyone at a party. A party is being organized by some people.
//    A square matrix mat[][] (n*n) is used to represent people at the party such that if an element of row i and column j
//    is set to 1 it means ith person knows jth person. You need to return the index of the celebrity in the party,
//    if the celebrity does not exist, return -1.
//
//    Note: Follow 0-based indexing.

    //Brute
    //If complete row is 0 , and complete column is 1 , that is the Celebrity
    //TC=O(N^2)

    public int findCelebrity(int[][] mat) {
        int n = mat.length;

        for (int i = 0; i < n; i++) {
            boolean knowsNobody = true;

            // Check if 'i' knows nobody (row check)
            for (int j = 0; j < n; j++) {
                if (i != j && mat[i][j] == 1) {  // Skip diagonal
                    knowsNobody = false;
                    break;
                }
            }

            if (!knowsNobody) continue;  // Not a candidate

            // Check if everyone knows 'i' (column check)
            boolean knownByAll = true;
            for (int j = 0; j < n; j++) {
                if (i != j && mat[j][i] == 0) {  // Skip diagonal
                    knownByAll = false;
                    break;
                }
            }

            if (knownByAll) return i;  // Found celebrity
        }

        return -1;  // No celebrity found
    }

    //Optimal using Stack

//    The standard stack-based solution works as follows:
//    Push all people onto the stack.
//    Compare two people at a time:
//    If A knows B, then A cannot be the celebrity (discard A, keep B).
//    If A does not know B, then B cannot be the celebrity (discard B, keep A).
//    Verify the last remaining candidate:
//    Ensure they know nobody (row is all 0s except diagonal).
//    Ensure everyone knows them (column is all 1s except diagonal).

    public int celebrity(int[][] mat) {
        int n = mat.length;
        Stack<Integer> st = new Stack<>();

        // Push all people onto the stack
        for (int i = 0; i < n; i++) {
            st.push(i);
        }

        // Eliminate non-celebrities
        while (st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();

            if (mat[v1][v2] == 1) {
                // v1 knows v2 → v1 cannot be the celebrity
                st.push(v2);
            } else {
                // v1 does not know v2 → v2 cannot be the celebrity
                st.push(v1);
            }
        }

        if (st.isEmpty()) {
            return -1; // No potential celebrity
        }

        int potential = st.pop();

        // Check row (must be all 0s except diagonal)
        for (int j = 0; j < n; j++) {
            if (j != potential && mat[potential][j] == 1) {
                return -1;
            }
        }

        // Check column (must be all 1s except diagonal)
        for (int i = 0; i < n; i++) {
            if (i != potential && mat[i][potential] == 0) {
                return -1;
            }
        }

        return potential;
    }

    public static void main(String[] args) {

    }
}
