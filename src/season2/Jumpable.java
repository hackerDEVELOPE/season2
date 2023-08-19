package season2;

@FunctionalInterface
public interface Jumpable {
    boolean jump(int heigth);
    default void tryToJump(int heigth) {
        System.out.println("jump!");
    }
}
