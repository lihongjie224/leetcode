package com.github.lihongjie.leetcode.括号生成22;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generate(0, 0, n, "", res);
        return res;
    }

    private void generate(int left, int right, int n, String s,  List<String> res) {

        if(left == n && right == n) {
            res.add(s);
            return;
        }

        if(left < n) {
            generate(left + 1, right, n, s + "(", res);
        }

        if(left > right) {
            generate(left, right + 1, n, s + ")", res);
        }

    }

    public static void main(String[] args) {
        System.out.println(new Solution().generateParenthesis(3));
    }


}
