class CarFleet {
    public int carFleet(int target, int[] position, int[] speed) {
        Stack<Double> stack = new Stack<>();
        List<int[]> positionWithSpeed = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            positionWithSpeed.add(new int[] { position[i], speed[i] });
        }
        positionWithSpeed.sort((a, b) -> b[0] - a[0]);
        for (int i = 0; i < positionWithSpeed.size(); i++) {
            int[] currentPositionWithSpeed = positionWithSpeed.get(i);
            double timeTakenToReachTarget = (double) (target - currentPositionWithSpeed[0])
                    / currentPositionWithSpeed[1];
            while (stack.isEmpty() || stack.peek() < timeTakenToReachTarget) {
                stack.add(timeTakenToReachTarget);
            }
        }
        return stack.size();
    }
}