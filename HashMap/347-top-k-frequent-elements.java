   HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // 2. Keep a Min-Heap of size K based on frequency
        // (a, b) -> map.get(a) - map.get(b) sorts elements by lowest frequency first
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> map.get(a) - map.get(b));

        for (int num : map.keySet()) {
            heap.add(num);
            if (heap.size() > k) {
                heap.poll(); // Remove the element with the lowest frequency
            }
        }

        // 3. Build the final primitive int[] array directly for return
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = heap.poll();
        }

        return result;