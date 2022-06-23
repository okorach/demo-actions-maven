package coverage_metrics;

/*
*
* This class provides example of SonarQube size metrics
*
*/

public class CoverageMetrics {

  public float f(int i) {
   int k = 0; /* default */
   if (i != 0) {
      k = 1;
   }
   for (int j=k; j>100; j++) {
     // FIXME: Do nothing
   }
   return (float)i/(k+1);
  }
}
