class ConcatStrategy implements OperationStrategy{
    public int execute(int a, int b) {
        return Integer.parseInt("" + a + b);
    }
}