import com.sun.istack.internal.NotNull;
import com.sun.jmx.remote.internal.ArrayQueue;
import com.sun.source.tree.Tree;
import org.w3c.dom.Node;

import javax.swing.tree.TreeNode;
import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        sort();
    }


    public static class A {
        static {
            System.out.println("static 方法 前 ");
        }

        public static A NOT_SET = new A();

        static {
            System.out.println("static 方法 后 ");
        }


        public static final int NUM = 3;

        public static final String CONSTANT = new String("ssss");

        public A() {
            System.out.println("构造方法 " + CONSTANT + " NUM " + NUM);
        }
    }

    public static class Provider {
        public static String getValue() {
            System.out.println("static CONSTANT 初始化获取值");
            return "这个结果是B";
        }
    }

    /**
     * 最长回文子序列
     */
    public static int dpCharSubLen(@NotNull char[] chars, int start, int end) {
        assert start >= 0;
        assert end < chars.length;

        if (start == end) {
            return 1;
        }

        if (start > end) {
            return 0;
        }

        if (chars[start] == chars[end]) {
            return dpCharSubLen(chars, start + 1, end - 1) + 2;
        } else {
            return Math.max(dpCharSubLen(chars, start + 1, end), dpCharSubLen(chars, start, end - 1));
        }
    }


    /**
     * 数塔问题
     */
    public static void testNumTower() {
        int[][] tower = new int[][]{
                {1, 0, 0},
                {8, 3, 0},
                {4, 5, 6}
        };

        int[][] dp = new int[][]{
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0}
        };

        System.out.println(dpNumTowerMax(tower, 0, 0, dp));

        int i = 0;
        int j = 0;
        while (i < dp.length) {
            if (dp[i][j] < dp[i][j + 1]) {
                j++;
            }
            System.out.println("i " + i + " j " + j + " v " + tower[i][j]);
            i++;
        }
    }

    /**
     * 数塔问题
     */
    public static int dpNumTowerMax(int[][] tower, int i, int j, int[][] dp) {
        if (i == tower.length - 1) {
            return dp[i][j] = tower[i][j];
        }

        int maxLeft = dpNumTowerMax(tower, i + 1, j, dp);
        int maxRight = dpNumTowerMax(tower, i + 1, j + 1, dp);
        return dp[i][j] = (tower[i][j] + Math.max(maxLeft, maxRight));
    }


    public static void sort() {
        // 冒泡排序
        int[] nums = new int[]{1, 5, 2, 4, 6, 3, 7};
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length - 1 - i; j++) {
//                if (nums[j] > nums[j + 1]) {
//                    int temp = nums[j];
//                    nums[j] = nums[j + 1];
//                    nums[j + 1] = temp;
//                }
//            }
//        }

        firstSort(nums, 0, nums.length -1);

        for (int num : nums) {
            System.out.println("" + num);
        }

//        System.out.println(search(nums, 0, nums.length - 1, 4));


    }

    public static int search(int[] nums, int start, int end, int search) {
        if (start > end) {
            return -1;
        }

        int target = (start + end) / 2;
        int num = nums[target];
        if (num == search) {
            return num;
        } else if (num < search) {
            return search(nums, target + 1, end, search);
        } else {
            return search(nums, start, target - 1, search);

        }
    }


    public static int[] firstSort(int[] nums, int start, int end) {
        if (start < end) {
            int i = start;
            int j = end;
            int t = nums[i];

            while (i != j) {
                // 从右向左
                while (nums[j] > t && i < j) {
                    j--;
                }
                // 从左向右
                while (nums[i] <= t && i < j) {
                    i++;
                }

                if (i < j) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }

            nums[start] = nums[i];
            nums[i] = t;

            firstSort(nums, start, i - 1);
            firstSort(nums, i + 1, end);
        }

        return nums;

    }


//    // 链表反转
//    public Node resertNode(Node node) {
//       if (node == null || node.next == null) {
//           return node;
//       }
//
//       Node head = resertNode(node.next);
//       node.next.next = node;
//       node.next = null;
//       return head;
//    }
//
//
//    // 链表反转
//    public Node resertNode(Node node) {
//        if (node == null || node.next == null) {
//            return node;
//        }
//
//        Node before = null;
//        Node curNode = node;
//        while(curNode != null) {
//            Node temp = curNode.next;
//            curNode.next = before;
//            before = curNode;
//            curNode = temp;
//
//        }
//    }

    // 二叉树广度遍历

//    public int treeWidth(TreeNode tree) {
//        if (tree == null) {
//            return 0;
//        }
//
//        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
//        queue.offer(tree);
//        int maxWidth = 0;
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.pop();
//            if (node.left != null) {
//                queue.offer(node.left);
//            }
//
//            if (node.right != null) {
//                queue.offer(node.right);
//            }
//
//            maxWidth = Math.max(maxWidth, queue.size());
//
//        }
//
//        return maxWidth;
//    }

    // 数组中出现超过一半的数字
    int findHalf(int[] nums) {
        int findNum = -1;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                findNum = nums[i];
                count++;
            } else if (findNum != nums[i]) {
                count--;
            } else {
                count++;
            }
        }

        return findNum;
    }

}
