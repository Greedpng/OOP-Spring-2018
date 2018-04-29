public class GuitarHero {
  public static String keyboard = "q2we4r5ty7u8i9op-[=zxdcfvgbnjmk,.;/' ";

  public static void main(String[] args) {
    GuitarString[] strings = new GuitarString[37];

    for (int i = 0; i < 37; i++) {
      strings[i] = new GuitarString(440.0 * Math.pow(2,((double)(i - 24.0) / 12.0)));
    }

    while (true) {
      if (StdDraw.hasNextKeyTyped()) {
        char key = StdDraw.nextKeyTyped();

        if (keyboard.indexOf(key) > -1) {
          strings[keyboard.indexOf(key)].pluck();
        }
      }

      double sample = 0;
      for (int i = 0; i < 37; i++) {
        sample += strings[i].sample();
      }

      StdAudio.play(sample);

      for (int i = 0; i < 37; i++) {
        strings[i].tic();
      }
    }
  }
}