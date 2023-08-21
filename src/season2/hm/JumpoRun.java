package season2.hm;

public interface JumpoRun {
  default boolean run(JumpoRun jr, Treadmill t){
      System.out.println( jr.getName() +" был бегающим" );
      System.out.println(t.getDist() < jr.getRUN_DIST() ? "бег был прекрасен" : "бег был ужасен");
      System.out.println();
      return t.getDist() < jr.getRUN_DIST();
    }

   default boolean jump(JumpoRun jr, Wall w) {
       System.out.println(jr.getName() +" был прыгал");
       System.out.println(w.getHeight() < jr.getJUMP_DIST() ? "прыжок был успешен" : "прыжок был плох");
       System.out.println();
       return w.getHeight() < jr.getJUMP_DIST();
   }
    public int getJUMP_DIST();

    public int getRUN_DIST();

    public String getName();
}
