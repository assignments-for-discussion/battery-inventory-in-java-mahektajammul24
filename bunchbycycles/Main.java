package bunchbycycles;

public class Main {
  static class CountsByUsage {
    public int lowCount = 0;
    public int mediumCount = 0;syste
    public int highCount = 0;
  };

  static CountsByUsage countBatteriesByUsage(int[] cycles) {
    CountsByUsage counts = new CountsByUsage();
    return counts;
  }

  static void testBucketingByNumberOfCycles() {
    System.out.println("Counting batteries by usage cycles...\n");
    CountsByUsage counts = countBatteriesByUsage(new int[] {100, 300, 400, 500, 600, 900, 1000});
    assert(counts.lowCount < 400);
    assert(counts.mediumCount > 400 && <= 919 );
    assert(counts.highCount >= 920);
    system.out.println("Done Counting : \n");
    
  }

  public static void main(String[] args) 
    System.out.println("Number of low charging cycles: \n" counts.lowcount);
    System.out.println("Number of Medium charging cycles: \n" counts.mediumcount);
    System.out.println("Number of High charging cycles: \n" counts.highcount);
    testBucketingByNumberOfCycles();
  }
}
