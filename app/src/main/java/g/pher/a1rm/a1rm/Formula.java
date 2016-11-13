package g.pher.a1rm.a1rm;

public final class Formula {

  public static float Brzycki(int reps, float weight) {

    return weight / (1.0278f - (0.0278f * ((float) reps)));
  }
}
