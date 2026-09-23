import java.util.Arrays;

class Solution {
    static class Node {
        int prod;
        int[][] count;

        Node(int k) {
            prod = 1;
            count = new int[k][k];
        }
    }

    private Node[] tree;
    private int n, k;

    public int[] resultArray(int[] nums, int k, int[][] queries) {
        this.n = nums.length;
        this.k = k;

        tree = new Node[4 * n];
        build(nums, 1, 0, n - 1);

        int[] res = new int[queries.length];
        for (int q = 0; q < queries.length; q++) {
            int idx = queries[q][0];
            int val = queries[q][1];
            int start = queries[q][2];
            int targetX = queries[q][3];

            // 1. Update nums[idx] = val
            update(1, 0, n - 1, idx, val % k);

            // 2. Query range [start, n - 1]
            Node resNode = query(1, 0, n - 1, start, n - 1);

            // 3. Get count for initial remainder = 1
            res[q] = resNode.count[1 % k][targetX];
        }

        return res;
    }

    private void setLeaf(Node node, int val) {
        node.prod = val;
        for (int rem = 0; rem < k; rem++) {
            Arrays.fill(node.count[rem], 0);
            node.count[rem][(rem * val) % k] = 1;
        }
    }

    private void merge(Node parent, Node left, Node right) {
        parent.prod = (left.prod * right.prod) % k;

        for (int rem = 0; rem < k; rem++) {
            int rightRem = (rem * left.prod) % k;
            for (int x = 0; x < k; x++) {
                parent.count[rem][x] = left.count[rem][x] + right.count[rightRem][x];
            }
        }
    }

    private void build(int[] nums, int node, int l, int r) {
        tree[node] = new Node(k);
        if (l == r) {
            setLeaf(tree[node], nums[l] % k);
            return;
        }
        int mid = (l + r) / 2;
        build(nums, 2 * node, l, mid);
        build(nums, 2 * node + 1, mid + 1, r);
        merge(tree[node], tree[2 * node], tree[2 * node + 1]);
    }

    private void update(int node, int l, int r, int idx, int val) {
        if (l == r) {
            setLeaf(tree[node], val);
            return;
        }
        int mid = (l + r) / 2;
        if (idx <= mid) update(2 * node, l, mid, idx, val);
        else update(2 * node + 1, mid + 1, r, idx, val);
        merge(tree[node], tree[2 * node], tree[2 * node + 1]);
    }

    private Node query(int node, int l, int r, int ql, int qr) {
        if (ql <= l && r <= qr) {
            return tree[node];
        }
        int mid = (l + r) / 2;
        if (qr <= mid) return query(2 * node, l, mid, ql, qr);
        if (ql > mid) return query(2 * node + 1, mid + 1, r, ql, qr);

        Node leftRes = query(2 * node, l, mid, ql, qr);
        Node rightRes = query(2 * node + 1, mid + 1, r, ql, qr);

        Node merged = new Node(k);
        merge(merged, leftRes, rightRes);
        return merged;
    }
}