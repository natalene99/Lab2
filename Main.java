class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");
    int totalNumMM;
    double colorBlue;
    double colorBrown;
    double colorGreen;
    double colorOrange;
    double colorRed;
    double colorYellow;
    totalNumMM = 55 * 11;
    colorBlue = totalNumMM * .24;
    colorBrown = totalNumMM * .13;
    colorGreen = totalNumMM * .16;
    colorOrange = totalNumMM * .20;
    colorRed = totalNumMM * .13;
    colorYellow = totalNumMM * .14;
    System.out.println("Blue is: " + colorBlue);
    System.out.println("Brown is: " + colorBrown);
    System.out.println("Green is: " + colorGreen);
    System.out.println("Orange is: " + colorOrange);
    System.out.println("Red is: " + colorRed);
    System.out.println("Yellow is: " + colorYellow);
    double SumMM;
    SumMM = colorBlue + colorBrown + colorGreen + colorOrange + colorRed + colorYellow;
    System.out.println("Total sum is: " + SumMM);
     if (colorBlue > colorBrown && colorRed > colorOrange)
      System.out.println("Blue over Brown and Red over Orange ");
      if (colorBrown <= colorGreen)
      System.out.println("Brown is less than or equal to green");
      if (SumMM == totalNumMM)
      System.out.println("Numbers Match");
  }
}